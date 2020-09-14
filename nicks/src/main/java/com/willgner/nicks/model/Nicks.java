package com.willgner.nicks.model;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.Select;


public class Nicks {
	
	public static void generateNicks()
	{
		
		File pathToBinary = new File("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
		FirefoxProfile firefoxProfile = new FirefoxProfile();
		
		//Abrir a Web Pagina Para Buscar os dados 
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.4devs.com.br/gerador_de_nicks");
		
		//setar os valores
		Select method = new Select(driver.findElement(By.name("method")));
		method.selectByVisibleText("Aleatório");
		
		Select limit = new Select(driver.findElement(By.name("limit")));
		limit.selectByVisibleText("8");
		
		WebElement quantity = driver.findElement(By.name("quantity"));
		quantity.clear();
		quantity.sendKeys("50");
		
		//Executar o botão de Salvar
		WebElement botaoSalvar = driver.findElement(By.id("bt_gerar_nick"));
		botaoSalvar.click();
		
		WebElement webElement = driver.findElement(By.id("nicks"));
	
	}
}
