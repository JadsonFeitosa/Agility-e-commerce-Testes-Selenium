package Testes;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDashboard {
	
	private WebDriver driver;
	private static String caminhoDriver = "D:\\Spring Workspace\\Selenium\\chromedriver.exe";
	private Comando comando;
	
	
	@Before
	public void inicializa(){
		System.setProperty("webdriver.gecko.driver", caminhoDriver);
//		driver = new FirefoxDriver();
		driver = new ChromeDriver();

		driver.get("http://localhost:3000/dashbord");
		comando = new Comando(driver);
		
	}
	
	@After
	public void finaliza(){
	
		driver.close();
		driver.quit();
	}
	
	
	@Test
	public void listarDataPorUltimos5DiasDashbordTest() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[1]/div/button[2]")).click();
		
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[4]/ul/li[1]/a/span[2]")).click();

		Thread.sleep(4000);
	}
	
	@Test
	public void listarDataPorUltimos15DiasDashbordTest() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[1]/div/button[2]")).click();
		
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[4]/ul/li[2]/a/span[2]")).click();

		Thread.sleep(4000);
	}
	
	@Test
	public void listarDataPorUltimos30DiasDashbordTest() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[1]/div/button[2]")).click();
		
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[4]/ul/li[3]/a/span[2]")).click();

		Thread.sleep(4000);
	}
	
	
	
//	
//	@Test
//	public void listarPorCampoDataDashbordTest() throws InterruptedException {
//		
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@name='dt_inicial']")).sendKeys(Keys.BACK_SPACE);
//		driver.findElement(By.xpath("//*[@name='dt_inicial']")).sendKeys(Keys.BACK_SPACE);
//		driver.findElement(By.xpath("//*[@name='dt_inicial']")).sendKeys(Keys.BACK_SPACE);
//		driver.findElement(By.xpath("//*[@name='dt_inicial']")).sendKeys(Keys.BACK_SPACE);
//		driver.findElement(By.xpath("//*[@name='dt_inicial']")).sendKeys(Keys.BACK_SPACE);
//		driver.findElement(By.xpath("//*[@name='dt_inicial']")).sendKeys(Keys.BACK_SPACE);
//		driver.findElement(By.xpath("//*[@name='dt_inicial']")).sendKeys(Keys.BACK_SPACE);
//		driver.findElement(By.xpath("//*[@name='dt_inicial']")).sendKeys(Keys.BACK_SPACE);
//		driver.findElement(By.xpath("//*[@name='dt_inicial']")).sendKeys(Keys.BACK_SPACE);
//		driver.findElement(By.xpath("//*[@name='dt_inicial']")).sendKeys(Keys.BACK_SPACE);
//		driver.findElement(By.xpath("//*[@name='dt_inicial']")).sendKeys("22/12/2011");
//
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@name='dt_final']")).sendKeys(Keys.BACK_SPACE);
//		driver.findElement(By.xpath("//*[@name='dt_final']")).sendKeys(Keys.BACK_SPACE);
//		driver.findElement(By.xpath("//*[@name='dt_final']")).sendKeys(Keys.BACK_SPACE);
//		driver.findElement(By.xpath("//*[@name='dt_final']")).sendKeys(Keys.BACK_SPACE);
//		driver.findElement(By.xpath("//*[@name='dt_final']")).sendKeys(Keys.BACK_SPACE);
//		driver.findElement(By.xpath("//*[@name='dt_final']")).sendKeys(Keys.BACK_SPACE);
//		driver.findElement(By.xpath("//*[@name='dt_final']")).sendKeys(Keys.BACK_SPACE);
//		driver.findElement(By.xpath("//*[@name='dt_final']")).sendKeys(Keys.BACK_SPACE);
//		driver.findElement(By.xpath("//*[@name='dt_final']")).sendKeys(Keys.BACK_SPACE);
//		driver.findElement(By.xpath("//*[@name='dt_final']")).sendKeys(Keys.BACK_SPACE);
//		driver.findElement(By.xpath("//*[@name='dt_final']")).sendKeys("13/01/2020");
//		
//		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]")).click();
//		
//		Thread.sleep(500);
//		driver.findElement(By.xpath("//*[@name='Filtrar']")).click();
//
//		Thread.sleep(4000);
//		
//	}
//	
//	@Test
//	public void listarPorCampoDataInvalidaDashbordTest() throws InterruptedException {
//		
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@name='dt_inicial']")).sendKeys(Keys.BACK_SPACE);
//		driver.findElement(By.xpath("//*[@name='dt_inicial']")).sendKeys(Keys.BACK_SPACE);
//		driver.findElement(By.xpath("//*[@name='dt_inicial']")).sendKeys(Keys.BACK_SPACE);
//		driver.findElement(By.xpath("//*[@name='dt_inicial']")).sendKeys(Keys.BACK_SPACE);
//		driver.findElement(By.xpath("//*[@name='dt_inicial']")).sendKeys(Keys.BACK_SPACE);
//		driver.findElement(By.xpath("//*[@name='dt_inicial']")).sendKeys(Keys.BACK_SPACE);
//		driver.findElement(By.xpath("//*[@name='dt_inicial']")).sendKeys(Keys.BACK_SPACE);
//		driver.findElement(By.xpath("//*[@name='dt_inicial']")).sendKeys(Keys.BACK_SPACE);
//		driver.findElement(By.xpath("//*[@name='dt_inicial']")).sendKeys(Keys.BACK_SPACE);
//		driver.findElement(By.xpath("//*[@name='dt_inicial']")).sendKeys(Keys.BACK_SPACE);
//		driver.findElement(By.xpath("//*[@name='dt_inicial']")).sendKeys("22/12/2011");
//
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@name='dt_final']")).sendKeys(Keys.BACK_SPACE);
//		driver.findElement(By.xpath("//*[@name='dt_final']")).sendKeys(Keys.BACK_SPACE);
//		driver.findElement(By.xpath("//*[@name='dt_final']")).sendKeys(Keys.BACK_SPACE);
//		driver.findElement(By.xpath("//*[@name='dt_final']")).sendKeys(Keys.BACK_SPACE);
//		driver.findElement(By.xpath("//*[@name='dt_final']")).sendKeys(Keys.BACK_SPACE);
//		driver.findElement(By.xpath("//*[@name='dt_final']")).sendKeys(Keys.BACK_SPACE);
//		driver.findElement(By.xpath("//*[@name='dt_final']")).sendKeys(Keys.BACK_SPACE);
//		driver.findElement(By.xpath("//*[@name='dt_final']")).sendKeys(Keys.BACK_SPACE);
//		driver.findElement(By.xpath("//*[@name='dt_final']")).sendKeys(Keys.BACK_SPACE);
//		driver.findElement(By.xpath("//*[@name='dt_final']")).sendKeys(Keys.BACK_SPACE);
//		driver.findElement(By.xpath("//*[@name='dt_final']")).sendKeys("13/01/2020");
//		
//		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]")).click();
//		
//		Thread.sleep(500);
//		driver.findElement(By.xpath("//*[@name='Filtrar']")).click();
//
//		Thread.sleep(4000);
//		
//	}
//	
//	
//	@Test
//	public void listarPorComponenteDataDashbordTest() throws InterruptedException {
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@class='p-button-icon p-c pi pi-calendar']")).click();
//		Thread.sleep(100);
//		driver.findElement(By.xpath("//*[@class='p-datepicker-prev p-link']")).click();
//		Thread.sleep(100);
//		driver.findElement(By.xpath("//*[@class='p-datepicker-prev p-link']")).click();
//		Thread.sleep(100);
//		driver.findElement(By.xpath("//*[@class='p-datepicker-prev p-link']")).click();
//		Thread.sleep(100);
//		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/table/tbody/tr[3]/td[2]/span")).click();
//		driver.findElement(By.xpath("//*[@class='p-fluid p-grid p-formgrid p-col-12']")).click();
//		Thread.sleep(1000);
//		
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@class='p-button-icon p-c pi pi-calendar']")).click();
//		Thread.sleep(100);
//		driver.findElement(By.xpath("//*[@class='p-datepicker-prev p-link']")).click();
//		Thread.sleep(100);
//		driver.findElement(By.xpath("//*[@class='p-datepicker-prev p-link']")).click();
//		Thread.sleep(100);
//		driver.findElement(By.xpath("//*[@class='p-datepicker-prev p-link']")).click();
//		Thread.sleep(100);
//		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/table/tbody/tr[3]/td[2]/span")).click();
//		driver.findElement(By.xpath("//*[@class='p-fluid p-grid p-formgrid p-col-12']")).click();
//		Thread.sleep(1000);
//		
//		
//		Thread.sleep(500);
//		driver.findElement(By.xpath("//*[@name='Filtrar']")).click();
//		
//		Thread.sleep(4000);
//		
//	}
//	
//	@Test
//	public void listarPorComponenteInvalidoDataDashbordTest() throws InterruptedException {
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@class='p-button-icon p-c pi pi-calendar']")).click();
//		Thread.sleep(100);
//		driver.findElement(By.xpath("//*[@class='p-datepicker-prev p-link']")).click();
//		Thread.sleep(100);
//		driver.findElement(By.xpath("//*[@class='p-datepicker-prev p-link']")).click();
//		Thread.sleep(100);
//		driver.findElement(By.xpath("//*[@class='p-datepicker-prev p-link']")).click();
//		Thread.sleep(100);
//		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/table/tbody/tr[3]/td[2]/span")).click();
//		driver.findElement(By.xpath("//*[@class='p-fluid p-grid p-formgrid p-col-12']")).click();
//		Thread.sleep(1000);
//		
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@class='p-button-icon p-c pi pi-calendar']")).click();
//		Thread.sleep(100);
//		driver.findElement(By.xpath("//*[@class='p-datepicker-prev p-link']")).click();
//		Thread.sleep(100);
//		driver.findElement(By.xpath("//*[@class='p-datepicker-prev p-link']")).click();
//		Thread.sleep(100);
//		driver.findElement(By.xpath("//*[@class='p-datepicker-prev p-link']")).click();
//		Thread.sleep(100);
//		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/table/tbody/tr[3]/td[2]/span")).click();
//		driver.findElement(By.xpath("//*[@class='p-fluid p-grid p-formgrid p-col-12']")).click();
//		Thread.sleep(1000);
//		
//		Thread.sleep(500);
//		driver.findElement(By.xpath("//*[@name='Filtrar']")).click();
//		
//		Thread.sleep(4000);
//		
//	}

}
