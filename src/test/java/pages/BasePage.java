package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
    //De tipo protected y static para que solamente puedan acceder al driver todos los hijos de esta clase (herencia).
    protected static WebDriver driver;
    //Objeto wait, le pasamos el driver de arriba y el tiempo de espera en segundos.
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
}
