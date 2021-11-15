package Testes;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCategoria {
	
	private WebDriver driver;
	private static String caminhoDriver = "D:\\Spring Workspace\\Selenium\\chromedriver.exe";
	private Comando comando;
	
	
	@Before
	public void inicializa(){
		System.setProperty("webdriver.gecko.driver", caminhoDriver);
//		driver = new FirefoxDriver();
		driver = new ChromeDriver();

		driver.get("http://localhost:3000/categoria");
		comando = new Comando(driver);
		
	}
	
	@After
	public void finaliza(){
	
		driver.close();
		driver.quit();
	}
	

	
	@Test
	public void editarCategoriaValidoTest() throws InterruptedException {
		
		Thread.sleep(1000);
		comando.escreverXPath("/html/body/div[1]/div/div[2]/div[3]/div/div/div/input", "categoria-test7");

		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[2]/div/div[2]/table/tbody/tr/td[4]/div/div[1]/button")).click();
		
		Thread.sleep(500);
		comando.escreverXPath("//*[@id='name']", "CategoriaSeleniumEditado");

		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"SALVAR\"]")).click(); 
		
		Thread.sleep(500);
		comando.escreverXPath("/html/body/div[1]/div/div[2]/div[3]/div/div/div/input", "CategoriaSeleniumEditado");

		
		
		Thread.sleep(3000);
	}
	

	@Test
	public void deletarCategoriaTest() throws InterruptedException {
		
		Thread.sleep(1000);
		comando.escreverXPath("/html/body/div[1]/div/div[2]/div[3]/div/div/div/input", "categoria-test0");
		
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[2]/div/div[2]/table/tbody/tr/td[4]/div/div[2]/button")).click();
		
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id='button-sim']")).click();
		
		
		Thread.sleep(500);
		comando.escreverXPath("/html/body/div[1]/div/div[2]/div[3]/div/div/div/input", "categoria-test0");
		
		Thread.sleep(3000);
	}

	@Test
	public void cadastrarCategoriaTest() throws InterruptedException {
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='Adicionar']")).click();
		
		Thread.sleep(500);
		comando.escreverXPath("//*[@id='name']", "Categoria nova");
		
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"SALVAR\"]")).click(); 
		
		Thread.sleep(500);
		comando.escreverXPath("/html/body/div[1]/div/div[2]/div[3]/div/div/div/input", "Categoria nova");
		
		Thread.sleep(3000);
	}
	
}
