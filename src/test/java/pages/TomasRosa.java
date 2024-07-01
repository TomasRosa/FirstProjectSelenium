package pages; ///Paquete en el que esta incluida esta clase

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TomasRosa {
    
    private WebDriver driver; //Seteamos variable driver de tipo WebDriver para inicializarla antes del test.
    ///Antes del testeo inicializa el WebDriver para Chrome
    @BeforeMethod
    public void setUp()
    {
        // Inicializa el WebDriver para Chrome.
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(); ///Creamos la instancia del chromeDriver.
    }
    ///En el testeo vamos hacia la URL FreeRangeTesters
    @Test
    public void navegamosAFreeRangeTesters ()
    {
        driver.get("https://www.freerangetesters.com"); ///nos lleva hacia la pagina freerangetesters

    }
    ///Luego del testeo cierra el navegador.
    @AfterMethod
    public void tearDown()
    {
        ///Si el driver esta inicializado, lo cierra.
        if(driver != null)
        {
            driver.quit();
        }
    }
}
