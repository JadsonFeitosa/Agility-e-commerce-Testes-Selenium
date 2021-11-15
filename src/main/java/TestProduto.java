package Testes;


import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestProduto {
	
	private WebDriver driver;
	private static String caminhoDriver = "D:\\Spring Workspace\\Selenium\\chromedriver.exe";
	private Comando comando;
	
	
	@Before
	public void inicializa(){
		System.setProperty("webdriver.gecko.driver", caminhoDriver);
//		driver = new FirefoxDriver();
		driver = new ChromeDriver();

		driver.get("http://localhost:3000/produto");
		comando = new Comando(driver);
		
	}
	
	@After
	public void finaliza(){
	
		driver.close();
		driver.quit();
	}
	
	@Test
	public void cadastroProdutoValidoTest() throws InterruptedException {
		
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@class='p-button-label p-c']")).click();
		Thread.sleep(100);
		comando.escreverXPath("//*[@id='barras']","123");
		Thread.sleep(100);
		comando.escreverXPath("//*[@id='name']","ProdutoSelenium");
		Thread.sleep(100);
		comando.escreverXPath("//*[@role='spinbutton']","11");
		Thread.sleep(100);
		comando.escreverXPath("/html/body/div[4]/div[3]/div/div[2]/form/div[1]/div[2]/div[2]/span/input","11");
		Thread.sleep(100);
		comando.escreverXPath("/html/body/div[4]/div[3]/div/div[2]/form/div[1]/div[2]/div[3]/span/input","11");
		Thread.sleep(100);
		driver.findElement(By.xpath("//*[@class='p-multiselect-label p-placeholder']")).click();
		Thread.sleep(100);
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/ul/li[1]")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div[2]/form/div[1]/div[2]")).click();
		Thread.sleep(100);
		comando.escreverXPath("/html/body/div[4]/div[3]/div/div[2]/form/div[1]/div[3]/div[1]/span/input","11");
		Thread.sleep(100);
		comando.escreverXPath("/html/body/div[4]/div[3]/div/div[2]/form/div[1]/div[3]/div[2]/span/input", "16");
		Thread.sleep(100);
		comando.escreverXPath("/html/body/div[4]/div[3]/div/div[2]/form/div[1]/div[3]/div[3]/span/input","11");
		Thread.sleep(100);
		comando.escreverXPath("/html/body/div[4]/div[3]/div/div[2]/form/div[1]/div[3]/div[4]/span/input", "11");
		Thread.sleep(100);
		comando.escreverXPath("//*[@id='description']", "54544545");
		Thread.sleep(100);
		driver.findElement(By.xpath("//*[@id=\"SALVAR\"]")).click();
		Thread.sleep(500);
		
		Thread.sleep(300);
		comando.escreverXPath("/html/body/div[1]/div/div[2]/div[3]/div[2]/div/div/input", "ProdutoSelenium");

		
		
		Thread.sleep(3000);
	}

	@Test
	public void editarProdutoValidoTest() throws InterruptedException {
		
		Thread.sleep(1000);
		comando.escreverXPath("/html/body/div[1]/div/div[2]/div[3]/div[2]/div/div/input", "item-11");

		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[2]/div/div[2]/table/tbody/tr/td[9]/div/div[1]/button")).click();
		
		
		Thread.sleep(500);
		comando.escreverXPath("//*[@id=\"name\"]", "ProdutoSeleniumEditado");

		driver.findElement(By.xpath("//*[@id=\"SALVAR\"]")).click();
		Thread.sleep(500);
		
		Thread.sleep(300);
		comando.escreverXPath("/html/body/div[1]/div/div[2]/div[3]/div[2]/div/div/input", "ProdutoSeleniumEditado");

		
		
		Thread.sleep(3000);
	}

	@Test
	public void deletarProdutoSimTest() throws InterruptedException {
		
		Thread.sleep(1000);
		comando.escreverXPath("/html/body/div[1]/div/div[2]/div[3]/div[2]/div/div/input", "item-61");
		
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[2]/div/div[2]/table/tbody/tr/td[9]/div/div[2]/button")).click();

		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id='button-sim']")).click();
		
		
		Thread.sleep(300);
		comando.escreverXPath("/html/body/div[1]/div/div[2]/div[3]/div[2]/div/div/input", "item-61");
		
		
		
		Thread.sleep(3000);
	}

	@Test
	public void deletarProdutoNaoTest() throws InterruptedException {
		
		Thread.sleep(1000);
		comando.escreverXPath("/html/body/div[1]/div/div[2]/div[3]/div[2]/div/div/input", "item-51");
		
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[2]/div/div[2]/table/tbody/tr/td[9]/div/div[2]/button")).click();
		
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id='button-nao']")).click();
		
		
		Thread.sleep(300);
		comando.escreverXPath("/html/body/div[1]/div/div[2]/div[3]/div[2]/div/div/input", "item-51");
		
		
		
		Thread.sleep(3000);
	}
	
	
	@Test
	public void cadastroProdutoInvalidoDescricaoTest() throws InterruptedException {
		
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@class='p-button-label p-c']")).click();
		Thread.sleep(100);
		comando.escreverXPath("//*[@id='barras']","111");
		Thread.sleep(100);
		comando.escreverXPath("//*[@id='name']","Produto111");
		Thread.sleep(100);
		comando.escreverXPath("//*[@role='spinbutton']","111");
		Thread.sleep(100);
		comando.escreverXPath("/html/body/div[4]/div[3]/div/div[2]/form/div[1]/div[2]/div[2]/span/input","111");
		Thread.sleep(100);
		comando.escreverXPath("/html/body/div[4]/div[3]/div/div[2]/form/div[1]/div[2]/div[3]/span/input","111");
		Thread.sleep(100);
		driver.findElement(By.xpath("//*[@class='p-multiselect-label p-placeholder']")).click();
		Thread.sleep(100);
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/ul/li[1]")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div[2]/form/div[1]/div[2]")).click();
		Thread.sleep(100);
		comando.escreverXPath("/html/body/div[4]/div[3]/div/div[2]/form/div[1]/div[3]/div[1]/span/input","111");
		Thread.sleep(100);
		comando.escreverXPath("/html/body/div[4]/div[3]/div/div[2]/form/div[1]/div[3]/div[2]/span/input", "111");
		Thread.sleep(100);
		comando.escreverXPath("/html/body/div[4]/div[3]/div/div[2]/form/div[1]/div[3]/div[3]/span/input","111");
		Thread.sleep(100);
		comando.escreverXPath("/html/body/div[4]/div[3]/div/div[2]/form/div[1]/div[3]/div[4]/span/input", "111");
		Thread.sleep(100);
		comando.escreverXPath("/html/body/div[4]/div[3]/div/div[2]/form/div[1]/div[3]/div[4]/span/input", "Descrição111");
		Thread.sleep(10);
		driver.findElement(By.xpath("//*[@id=\"SALVAR\"]")).click();

		Thread.sleep(3000);
	}
 

	@Test
	public void cadastroProdutoInvalidoComprimentoTest() throws InterruptedException {
		
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@class='p-button-label p-c']")).click();
		Thread.sleep(100);
		comando.escreverXPath("//*[@id='barras']","111");
		Thread.sleep(100);
		comando.escreverXPath("//*[@id='name']","Produto Selenium");
		Thread.sleep(100);
		comando.escreverXPath("//*[@role='spinbutton']","111");
		Thread.sleep(100);
		comando.escreverXPath("/html/body/div[4]/div[3]/div/div[2]/form/div[1]/div[2]/div[2]/span/input","111");
		Thread.sleep(100);
		comando.escreverXPath("/html/body/div[4]/div[3]/div/div[2]/form/div[1]/div[2]/div[3]/span/input","111");
		Thread.sleep(100);
		driver.findElement(By.xpath("//*[@class='p-multiselect-label p-placeholder']")).click();
		Thread.sleep(100);
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/ul/li[1]")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div[2]/form/div[1]/div[2]")).click();
		Thread.sleep(100);
		comando.escreverXPath("/html/body/div[4]/div[3]/div/div[2]/form/div[1]/div[3]/div[1]/span/input","111");
		Thread.sleep(100);
		comando.escreverXPath("/html/body/div[4]/div[3]/div/div[2]/form/div[1]/div[3]/div[2]/span/input", "11");
		Thread.sleep(100);
		comando.escreverXPath("/html/body/div[4]/div[3]/div/div[2]/form/div[1]/div[3]/div[3]/span/input","111");
		Thread.sleep(100);
		comando.escreverXPath("/html/body/div[4]/div[3]/div/div[2]/form/div[1]/div[3]/div[4]/span/input", "111");
		Thread.sleep(100);
		comando.escreverXPath("//*[@id=\"description\"]", "Descrição111");
		Thread.sleep(100);
		driver.findElement(By.xpath("//*[@id=\"SALVAR\"]")).click();
		
		Thread.sleep(3000);
	}
	 
	@Test
	public void cadastroProdutoInvalidoCodigoTest() throws InterruptedException {
		
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@class='p-button-label p-c']")).click();
		Thread.sleep(100);
		comando.escreverXPath("//*[@id='barras']","1111111AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
		Thread.sleep(100);
		comando.escreverXPath("//*[@id='name']","Produto Selenium");
		Thread.sleep(100);
		comando.escreverXPath("//*[@role='spinbutton']","111");
		Thread.sleep(100);
		comando.escreverXPath("/html/body/div[4]/div[3]/div/div[2]/form/div[1]/div[2]/div[2]/span/input","111");
		Thread.sleep(100);
		comando.escreverXPath("/html/body/div[4]/div[3]/div/div[2]/form/div[1]/div[2]/div[3]/span/input","111");
		Thread.sleep(100);
		driver.findElement(By.xpath("//*[@class='p-multiselect-label p-placeholder']")).click();
		Thread.sleep(100);
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/ul/li[1]")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div[2]/form/div[1]/div[2]")).click();
		Thread.sleep(100);
		comando.escreverXPath("/html/body/div[4]/div[3]/div/div[2]/form/div[1]/div[3]/div[1]/span/input","111");
		Thread.sleep(100);
		comando.escreverXPath("/html/body/div[4]/div[3]/div/div[2]/form/div[1]/div[3]/div[2]/span/input", "11");
		Thread.sleep(100);
		comando.escreverXPath("/html/body/div[4]/div[3]/div/div[2]/form/div[1]/div[3]/div[3]/span/input","999999");
		Thread.sleep(100);
		comando.escreverXPath("/html/body/div[4]/div[3]/div/div[2]/form/div[1]/div[3]/div[4]/span/input", "111");
		Thread.sleep(100);
		comando.escreverXPath("//*[@id=\"description\"]", "Descrição111");
		Thread.sleep(100);
		driver.findElement(By.xpath("//*[@id=\"SALVAR\"]")).click();
		
		Thread.sleep(3000);
	}


}
