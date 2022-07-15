/*
package Pruebas;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import static io.github.bonigarcia.seljup.BrowserType.CHROME;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.seljup.DockerBrowser;
import io.github.bonigarcia.seljup.SeleniumJupiter;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.seljup.DockerBrowser;
import io.github.bonigarcia.seljup.SeleniumJupiter;



public class TestPaginaWeb {

    WebDriver driver;

    WebDriverManager wdm = WebDriverManager.chromedriver().browserInDocker();

    @BeforeEach
    void setupTest() {
        driver = wdm.create();
    }

    @AfterEach
    void teardown() {
        wdm.quit();
    }

    @Test
    void Test1() {
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/");
        assertThat(driver.getTitle()).contains("Selenium WebDriver");
    }


  */
/*  static WebDriver driver;

    static WebDriverManager wdm = WebDriverManager.chromedriver().browserInDocker();


    @Before
    public void setUp(){
        driver = wdm.create();
//        driver.manage().deleteAllCookies();
//      driver.manage().window().maximize();
        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
  @Test
  public void Test1() {
        //inicializamos webdrivermanager con setup base y creamos el webDriver que aceptara el ChromeDriver


        //funciones configuracion -> funciones internas


        //funciones de navegacion -> funciones Externas
        driver.get("https://www.google.com");
        String tituloPagina = driver.getTitle(); // "Google"
        assertEquals("hola", tituloPagina);
        //escribir en el tag input con nombre q
        WebElement barraTextoGoogle = driver.findElement(By.name("q"));
        barraTextoGoogle.sendKeys("TSOFT");
        barraTextoGoogle.submit();
        By result = By.xpath("//h3[contains(text(),'HOME')]");
        WebElement link = driver.findElement(result);
        link.click();
        String tituloPaginaTsoft = driver.getTitle();
        driver.close();
    }
    @After
    public void close(){

        wdm.quit();

    }*//*

}*/
