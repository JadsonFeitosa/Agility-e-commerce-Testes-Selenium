import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestEditora {
	
	
	private WebDriver driver;
	private static String caminhoDriver = "C:\\drive\\geckodriver.exe";
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
		
//		assertEquals("Editora rua nova", comando.obterValueElemento("name1"));
		
		
	}


}
