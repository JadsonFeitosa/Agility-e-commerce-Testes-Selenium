

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
	

//	@Test
//	public void loginValidoTest() throws InterruptedException {
//		
//		
//		Thread.sleep(1000);
//		comando.escrever("e-mail","agilityecommerce@gmail.com");
//		comando.escrever("senha","123456");
//		Thread.sleep(3000);
//		Thread.sleep(100);
//		comando.clicarBotao("ENTER");
//		Thread.sleep(100);
//		comando.clicarBotao("ENTER");
//		Thread.sleep(3000);
//		
////		class="p-toast-detail"
////				E-mail ou senha inválido
//		
////		driver.findElement(By.xpath("//button[@name='ENTER']"));
////		Thread.sleep(3000);
////		assertEquals(driver.findElement(By.className("p-toast-detail")), "p-toast-detail");
////		driver.findElement(By.id("ENTER")).submit();
////		driver.findElement(By.xpath("//button[@name='ENTER']")).click();
////		driver.findElement(By.xpath("//button[@name='ENTER']")).click();
////		driver.findElement(By.className("p-button-label")).submit();
////		driver.findElement(By.className("esquece")).click();
//		
//	}
	
	
//	@Test
//	public void loginEmailInvalidoTest() throws InterruptedException{
//		Thread.sleep(1000);
//		comando.escrever("e-mail","asdd@gmail.com");
//		comando.escrever("senha","123456");
//		Thread.sleep(3000);
//		Thread.sleep(100);
//		comando.clicarBotao("ENTER");
//		Thread.sleep(100);
//		comando.clicarBotao("ENTER");
//		Thread.sleep(3000);
//		
//		
//	}
	
	@Test
	public void loginSenhaInvalidoTest() throws InterruptedException{
		Thread.sleep(1000);
		comando.clicarLink("esquece");
		driver.findElement(By.className("p-inputtext p-component p-col-12 p-xl-12 p-lg-12")).sendKeys("jadson.feitosa.silva@mail.com");;
//		Thread.sleep(150);
//		driver.findElement(By.className("p-button-label p-c")).click();
//		Thread.sleep(150);
//		driver.findElement(By.className("p-button-label p-c")).click();
		Thread.sleep(99900); 
		
	}

//	@Test
//	public void recuperarSenhaTest() throws InterruptedException {
//		
//		
//		
//	}



}
