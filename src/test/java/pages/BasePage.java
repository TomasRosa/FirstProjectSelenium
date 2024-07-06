package pages;

import java.time.Duration;
import java.util.List;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
    //De tipo protected y static para que solamente puedan acceder al driver todos los hijos de esta clase (herencia).
    protected static WebDriver driver;
    //Objeto wait, le pasamos el driver de arriba y el tiempo de espera en segundos.
    //Es el tiempo maximo que se da para encontrar los elementos en la web.
    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));

    //Bloque estatico que va a crear (instanciar) el chromeDriver cuando arranque la ejecución: ngOnInit
    static{
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    //Constructor, ya que esta clase sera instanciada por las subclases que la hereden.
    public BasePage(WebDriver driver)
    {
        BasePage.driver = driver;
    }
    //Metodo de la clase BasePage, el cual sera heredado por las clases hijas.
    //Me lleva hacia una url mediante el metodo get de Selenium (WebDriver driver)
    public static void navigateTo(String url)
    {
        driver.get(url);
    }
    //Creo objeto de tipo WebElement (viene de Selenium) nos permite invocar funciones de Selenium para 
    //trabajar con webElements.
    //Le pusimo de nombre Find (nombre arbitrario) y le pasamos un locator(buscar elemento en la pagina web)
    //de tipo string.
    //Debido a que la funcion es de tipo WebElement devolvemos un objeto de tipo WebElement utilizando 
    //el wait declarado arriba. (Devolveme esperando hasta que la condicion que el elemento este presente)
    //(y ese elemento lo ubiques con xpath utilizando el locator pasado por parametro, devolveme ese webElement)
    private WebElement Find(String locator) //funcion privada xq solamente la vamos a usar en esta clase.
    {
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
        ///Esto me permite manejar las esperas una sola vez. En la basePage. Muy importante.
    }
    //Metodo que vamos a utilizar en las distintas page object class para clickear un determinado 
    //elemento segun su locator.
    public void clickElement(String locator)
    {
        //Busco el element a partir de su locator - realizo acción, en este caso, click.
        Find(locator).click();
    }
    //Metodo que vamos a utilizar en las distintas page object class para escribir en un input 
    //segun su locator
    public void write(String locator, String keysToSend)
    {
        ///Borro si hay un placeholder o mensaje en el input antes de escribir.
        Find(locator).clear();
        Find(locator).sendKeys(keysToSend);
    }
    //Metodo que vamos a utilizar en las distintas page object class para seleccionar un elemento en un 
    //dropdown mediante un valor.
    public void selectFromDropdownByValue(String locator, String value)
    {
        //Creamos el select y le asignamos el locator.
        Select dropdown = new Select(Find(locator));

        dropdown.selectByValue(value);
    }
    //Metodo que vamos a utilizar en las distintas page object class para seleccionar un elemento en un 
    //dropdown segun un indice.
    public void selectFromDropdownByIndex(String locator, int index)
    {
        Select dropdown = new Select(Find(locator));

        dropdown.selectByIndex(index);
    }
    //Metodo que vamos a utilizar en las distintas page object class para devolver la cantidad de elementos
    //que tiene un dropdown.
    public int dropdownSize (String locator)
    {
        //El select nos habilita a agarrar todos las opciones que tenga esa lista.
        Select dropdown = new Select(Find(locator));
        //Esa lista esta llena de objetos del tipo webElement.
        List<WebElement> dropdownOptions = dropdown.getOptions();
        //Devolviendo el tamaño, devolvemos la cantidad de opciones que hay dentro de ese dropdown.
        return dropdownOptions.size();
    }
    //Metodo que nos va a devolver una lista con todos los valores de un dropdown.
    public List<String> getDropdownValues (String locator)
    {   
        Select dropdown = new Select(Find(locator));

        List<WebElement> dropdownOptions = dropdown.getOptions();

        List<String> values = new ArrayList<>();

        for(WebElement option : dropdownOptions)
        {
            values.add(option.getText());
        }

        return values;
    }
    //Metodo para cerrar el driver. (cierra el test, cierra el browser).
    public static void closeBrowser()
    {
        driver.quit();
    }
}
