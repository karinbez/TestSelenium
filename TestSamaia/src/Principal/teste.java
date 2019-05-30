package Principal;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class teste {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\libs\\chromedriver_win32\\chromedriver.exe");
        
        
        WebDriver drive= new ChromeDriver();
        drive.get("http://www.google.com");
        
        //Pesquisa Empresa
        WebElement busca =  drive.findElement(By.name("q"));
        busca.sendKeys("Samaia It");
        busca.submit();
        
        //Formulario contato
        drive.get("https://samaiait.com.br/");
        drive.get("https://www.portalinvestigativo.com.br/");
        WebElement saibamais = drive.findElement(By.linkText("Contato"));
        saibamais.click();
        
        //preencer formulário
        WebElement nome = drive.findElement(By.id("nome"));
        nome.sendKeys("Karin Bez");
        WebElement email = drive.findElement(By.id("email"));
        email.sendKeys("karin.bez@gmail");
        WebElement telefone = drive.findElement(By.id("telefone"));
        telefone.sendKeys("48991911173");
        WebElement mensagem = drive.findElement(By.id("mensagem"));
        mensagem.sendKeys("Teste Automatizado");
  //    WebElement submeter = drive.findElement(By.id("enviar"));
   //         
       // submeter.submit();
        
        
        
        
        
       
	}

	

}
