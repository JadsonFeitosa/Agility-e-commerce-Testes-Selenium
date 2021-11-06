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
	private static String caminhoDriver = "C:\\System Clinica\\geckodriver.exe";
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
		comando.escrever("Nome", "Editora rua nova");
		comando.escrever("cnpj", "35.001.002./0001-89");
		comando.escrever("CEP", "58500-000");
		comando.escrever("Rua", "rua de nos bobos");
		comando.escrever("Numero", "123");
		comando.escrever("Bairro", "centro");
		comando.escrever("Cidade", "centro");
		comando.escrever("UF", "PB");
		comando.clicarBotao("save");
		
		//assertTrue("");
		
		
	}


}
