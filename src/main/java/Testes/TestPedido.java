package Testes;




import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestPedido {
	
	private WebDriver driver;
	private static String caminhoDriver = "D:\\Spring Workspace\\Selenium\\chromedriver.exe";
	private Comando comando;
	
	
	@Before
	public void inicializa(){
		System.setProperty("webdriver.gecko.driver", caminhoDriver);
//		driver = new FirefoxDriver();
		driver = new ChromeDriver();

		driver.get("http://localhost:3000/pedido");
		comando = new Comando(driver);
		
	}
	
	@After
	public void finaliza(){
	
		driver.close();
		driver.quit();
	}
	
	
	@Test
	public void listarPorDataDoPedidoCadastradoTest() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@class='p-button-icon p-c pi pi-calendar']")).click();
		Thread.sleep(100);
		driver.findElement(By.xpath("//*[@class='p-datepicker-prev p-link']")).click();
		Thread.sleep(100);
		driver.findElement(By.xpath("//*[@class='p-datepicker-prev p-link']")).click();
		Thread.sleep(100);
		driver.findElement(By.xpath("//*[@class='p-datepicker-prev p-link']")).click();
		Thread.sleep(100);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/table/tbody/tr[3]/td[2]/span")).click();
		driver.findElement(By.xpath("//*[@class='p-fluid p-grid p-formgrid p-col-12']")).click();
		Thread.sleep(1000);

		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='dt_final']")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("//*[@name='dt_final']")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("//*[@name='dt_final']")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("//*[@name='dt_final']")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("//*[@name='dt_final']")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("//*[@name='dt_final']")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("//*[@name='dt_final']")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("//*[@name='dt_final']")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("//*[@name='dt_final']")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("//*[@name='dt_final']")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("//*[@name='dt_final']")).sendKeys("22/12/2022");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]")).click();
		
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@name='Filtrar']")).click();

		Thread.sleep(4000);
		
	}
	
	@Test
	public void listarPorDataDoPedidoInvalidaCadastradoTest() throws InterruptedException {
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='dt_inicial']")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("//*[@name='dt_inicial']")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("//*[@name='dt_inicial']")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("//*[@name='dt_inicial']")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("//*[@name='dt_inicial']")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("//*[@name='dt_inicial']")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("//*[@name='dt_inicial']")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("//*[@name='dt_inicial']")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("//*[@name='dt_inicial']")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("//*[@name='dt_inicial']")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("//*[@name='dt_inicial']")).sendKeys("22/12/2011");

		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='dt_final']")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("//*[@name='dt_final']")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("//*[@name='dt_final']")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("//*[@name='dt_final']")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("//*[@name='dt_final']")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("//*[@name='dt_final']")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("//*[@name='dt_final']")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("//*[@name='dt_final']")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("//*[@name='dt_final']")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("//*[@name='dt_final']")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("//*[@name='dt_final']")).sendKeys("13/01/2020");
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]")).click();
		
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@name='Filtrar']")).click();

		Thread.sleep(4000);
		
	}

	@Test
	public void verDetalhesDoPedidoCadastradoTest() throws InterruptedException {
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@class='p-button-icon p-c pi pi-chart-bar']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div[2]/form/div/div[5]/div[2]/div/div/div[2]/div[3]/div/div/div[3]/p")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div[2]/form/div/div[11]/h2/span")).click();
		Thread.sleep(3000);
		
	}

	@Test
	public void buscaDePedidoPorClienteNaoCadastradoTest() throws InterruptedException {
		
		Thread.sleep(1000);
		comando.escreverXPath("/html/body/div[1]/div/div[2]/div[3]/div[1]/div/div/input", "Jadson");
		Thread.sleep(500);
		
		Thread.sleep(3000);
		
	}
	
	@Test
	public void buscaDePedidoPorClienteCadastradoTest() throws InterruptedException {
		
		Thread.sleep(1000);
		comando.escreverXPath("/html/body/div[1]/div/div[2]/div[3]/div[1]/div/div/input", "LUAN MIRANDA");
		Thread.sleep(500);
		
		Thread.sleep(3000);
		
	}

	@Test
	public void listagemPedidosConcluidosTest() throws InterruptedException {
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[2]/div/div/ul/li[4]/a")).click();
		Thread.sleep(3000);
		
	}
	
	@Test
	public void listagemPedidosNaoPagosTest() throws InterruptedException {
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[2]/div/div/ul/li[2]/a")).click();
		Thread.sleep(3000);
		
	}

	@Test
	public void listagemPedidosAEnviarTest() throws InterruptedException {
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[2]/div/div/ul/li[3]/a")).click();
		Thread.sleep(3000);
		
	}

	@Test
	public void listagemPedidosDevolucaoReenbolsoTest() throws InterruptedException {
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[2]/div/div/ul/li[5]/a")).click();
		Thread.sleep(3000);
		
	}

	@Test
	public void listagemPedidosTodosTest() throws InterruptedException {
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[2]/div/div/ul/li[1]/a")).click();
		Thread.sleep(3000);
		
	}

	@Test
	public void listagemPedidosPorCodigoTest() throws InterruptedException {
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[1]/div/div[1]/div/table/thead/tr/th[2]/span[1]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[1]/div/div[1]/div/table/thead/tr/th[2]/span[1]")).click();
		Thread.sleep(3000);
		
	}


}
