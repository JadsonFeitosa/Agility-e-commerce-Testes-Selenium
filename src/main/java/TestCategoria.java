import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sun.jna.platform.mac.Carbon.EventHotKeyID.ByValue;
import com.sun.source.tree.AssertTree;

public class TestCategoria {
	
	
	private WebDriver driver;
	private static String caminhoDriver = "D:\\Spring Workspace\\Selenium\\chromedriver.exe";
	private Comando comando;
	
	
	@Before
	public void inicializa(){
		System.setProperty("webdriver.gecko.driver", caminhoDriver);
		driver = new FirefoxDriver();
		driver.get("http://localhost:4200/admin");
		comando = new Comando(driver);
		
	}
	
	@After
	public void finaliza(){
		driver.close();
		driver.quit();
	
	}
	
	@Test
	public void cadastro() throws InterruptedException {
		comando.clicarBotao("editora");
		Thread.sleep(1000);
		comando.clicarBotao("novo");
		Thread.sleep(1000);
		comando.escrever("nome", "Terror");
		comando.clicarBotao("save");
		
		assertEquals("categoria", comando.obterValueElemento("nome"));
		
		
	}


}
