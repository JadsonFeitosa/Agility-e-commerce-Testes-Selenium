package Testes;


import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@FixMethodOrder(MethodSorters.JVM)
public class TestLogin {
	
	private WebDriver driver;
	private static String caminhoDriver = "D:\\Spring Workspace\\Selenium\\chromedriver.exe";
	private Comando comando;
	
	
	@Before
	public void inicializa(){
		System.setProperty("webdriver.gecko.driver", caminhoDriver);
//		driver = new FirefoxDriver();
		driver = new ChromeDriver();

		driver.get("http://localhost:3000");
		comando = new Comando(driver);
		
	}
	
	@After
	public void finaliza(){
	
		driver.close();
		driver.quit();
	}
	

	@Test
	public void loginValidoTest() throws InterruptedException {
		
		
		Thread.sleep(1000);
		comando.escrever("e-mail","agilityecommerce@gmail.com");
		Thread.sleep(500);
		comando.escrever("senha","123456");
		Thread.sleep(500);
		comando.clicarBotao("ENTER");
		Thread.sleep(3000);
		
		
	}
	
	
	@Test
	public void loginEmailInvalidoTest() throws InterruptedException{
		Thread.sleep(1000);
		comando.escrever("e-mail","asdd@gmail.com");
		Thread.sleep(500);
		comando.escrever("senha","123456");
		Thread.sleep(500);
		comando.clicarBotao("ENTER");
		Thread.sleep(3000);
		
	}
	@Test
	public void loginSenhaInvalidoTest() throws InterruptedException{
		Thread.sleep(1000);
		comando.escrever("e-mail","asdd@gmail.com");
		Thread.sleep(500);
		comando.escrever("senha","123456");
		Thread.sleep(500);
		comando.clicarBotao("ENTER");
		Thread.sleep(3000);
		
		
	}
	
	
	@Test
	public void recuperarSenhaTest() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.className("esquece")).click();
		Thread.sleep(1000);
		comando.escreverXPath("//*[@placeholder='Digite o e-mail cadastrado']", "jadson.feitosa.silva@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='button-recuperar']")).click(); 		
		
		Thread.sleep(4000);
		
	}
	@Test
	public void recuperarSenhaInvalidaTest() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.className("esquece")).click();
		Thread.sleep(1000);
		comando.escreverXPath("//*[@placeholder='Digite o e-mail cadastrado']", "jadson@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='button-recuperar']")).click(); 		
		Thread.sleep(2000);
		
	}
 
}
