package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ejemplo_if_2   {
    public static void main(String[] args) {

        //iniciating chrome browser
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        //Abrir la pagina de pruebas
        driver.get("https://www.saucedemo.com/v1/");

        //Identify & interact with the element in the login page
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        //Ex. If, verify an element desplegado
        WebElement inventoryItem = driver.findElement(By.className("inventory_item_name"));

        if(inventoryItem.isDisplayed()) {
            System.out.println("Elemento desplegado en la pagina");
        }    else{
            System.out.println("Elemento No Desplegado en la pagina");
        }

    //Methods to validate website or URL
        String tituloDePagina = driver.getTitle();
        System.out.println(tituloDePagina);

        String urlDePagina = driver.getCurrentUrl();
        System.out.println(urlDePagina);

    }
}
