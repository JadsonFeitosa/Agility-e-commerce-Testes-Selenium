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

		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[6]/div/div/label")).click();

		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[7]/div[1]/div/div/div/canvas")).click();

		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[8]/div/label")).click();

		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[10]/div[1]/div/div/div/canvas")).click();
		

		Thread.sleep(4000);
	}
	
	@Test
	public void listarDataPorUltimos15DiasDashbordTest() throws InterruptedException {
	Thread.sleep(1000);
	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[1]/div/button[2]")).click();
	
	Thread.sleep(500);
	driver.findElement(By.xpath("/html/body/div[4]/ul/li[2]/a/span[2]")).click();

	Thread.sleep(500);
	driver.findElement(By.xpath("/html/body/div[1]/div/div[6]/div/div/label")).click();

	Thread.sleep(500);
	driver.findElement(By.xpath("/html/body/div[1]/div/div[7]/div[1]/div/div/div/canvas")).click();

	Thread.sleep(500);
	driver.findElement(By.xpath("/html/body/div[1]/div/div[8]/div/label")).click();

	Thread.sleep(500);
	driver.findElement(By.xpath("/html/body/div[1]/div/div[10]/div[1]/div/div/div/canvas")).click();
	

	Thread.sleep(4000);
	}
	
	@Test
	public void listarDataPorUltimos30DiasDashbordTest() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[1]/div/button[2]")).click();
		
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[4]/ul/li[3]/a/span[2]")).click();

		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[6]/div/div/label")).click();

		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[7]/div[1]/div/div/div/canvas")).click();

		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[8]/div/label")).click();

		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[10]/div[1]/div/div/div/canvas")).click();
		

		Thread.sleep(4000);
	}
	
	
	
	
	@Test
	public void listarPorCampoDataDashbordTest() throws InterruptedException {

		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[1]/span/span[1]/span[1]/input")).click();

		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[2]/span/input")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[2]/span/input")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[2]/span/input")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[2]/span/input")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[2]/span/input")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[2]/span/input")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[2]/span/input")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[2]/span/input")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[2]/span/input")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[2]/span/input")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[2]/span/input")).sendKeys("01/10/2021");
		Thread.sleep(300);

		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[2]/span/button")).click();

		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[3]/span/input")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[3]/span/input")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[3]/span/input")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[3]/span/input")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[3]/span/input")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[3]/span/input")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[3]/span/input")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[3]/span/input")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[3]/span/input")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[3]/span/input")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[3]/span/input")).sendKeys("01/12/2021");
		Thread.sleep(300);

		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[3]/span/button")).click();
		
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@name='Filtrar']")).click();

		Thread.sleep(4000);
		
	}
	
	@Test
	public void listarPorCampoDataInvalidaDashbordTest() throws InterruptedException {
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[1]/span/span[1]/span[1]/input")).click();

		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[2]/span/input")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[2]/span/input")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[2]/span/input")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[2]/span/input")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[2]/span/input")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[2]/span/input")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[2]/span/input")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[2]/span/input")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[2]/span/input")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[2]/span/input")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[2]/span/input")).sendKeys("22/12/2011");
		Thread.sleep(300);

		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[2]/span/button")).click();

		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[3]/span/input")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[3]/span/input")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[3]/span/input")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[3]/span/input")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[3]/span/input")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[3]/span/input")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[3]/span/input")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[3]/span/input")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[3]/span/input")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[3]/span/input")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[3]/span/input")).sendKeys("01/02/2015");
		Thread.sleep(300);

		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[3]/span/button")).click();
		
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@name='Filtrar']")).click();

		Thread.sleep(4000);
		
	}
	
	
	@Test
	public void listarPorComponenteDataDashbordTest() throws InterruptedException {
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[1]/span/span[1]/span[1]/input")).click();
		
		Thread.sleep(300);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[2]/span/button")).click();
		
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/button[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/button[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/button[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/button[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/table/tbody/tr[3]/td[2]/span")).click();
		Thread.sleep(1000);
		
		Thread.sleep(300);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[3]/span/button")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/button[2]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/button[2]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/button[2]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/button[2]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/table/tbody/tr[4]/td[6]/span")).click();
		Thread.sleep(1000);
		
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@name='Filtrar']")).click();
		
		Thread.sleep(4000);
		
	}
	
	@Test
	public void listarPorComponenteInvalidoDataDashbordTest() throws InterruptedException {
	
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[1]/span/span[1]/span[1]/input")).click();
		
		Thread.sleep(300);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[2]/span/button")).click();
		
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/button[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/button[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/button[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/button[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/button[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/button[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/button[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/button[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/button[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/button[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/button[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/button[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/button[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/button[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/button[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/table/tbody/tr[3]/td[2]/span")).click();
		Thread.sleep(1000);
		
		Thread.sleep(300);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[3]/span/button")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/button[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/button[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/button[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/button[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/button[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/button[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/button[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/button[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/button[1]")).click();
		Thread.sleep(500);
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/table/tbody/tr[4]/td[6]/span")).click();
		Thread.sleep(1000);
		
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@name='Filtrar']")).click();
		
		Thread.sleep(4000);
		
	}

}
