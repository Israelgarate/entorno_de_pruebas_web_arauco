

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;

public class PaginaWeb {
    static WebDriver driver;

    static WebDriverManager wdm = WebDriverManager.chromedriver().browserInDocker();

    @BeforeClass
    public static void init(){
        driver = wdm.create();
    }

    @Before
    public void setUp(){
        //preparacion de Driver = Navegador
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
    }
  @Test
  public void Test1() {
        //inicializamos webdrivermanager con setup base y creamos el webDriver que aceptara el ChromeDriver


        //funciones configuracion -> funciones internas
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //funciones de navegacion -> funciones Externas
        driver.get("https://www.google.com");
        String tituloPagina = driver.getTitle(); // "Google"
        Assert.assertEquals("hola", tituloPagina);
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

    }
}