package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Ejemplo_Loops {
    public static void main(String[] args) {

        //iniciating chrome browser
        WebDriver driver = new ChromeDriver();

        //Abrir la pagina de pruebas
        driver.get("https://www.saucedemo.com/v1/");

        //Identify & interact with the element in the login page
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        //Ex. If, verify an element desplegado
        List<WebElement> inventoryItem = driver.findElements(By.className("inventory_item_name"));
        System.out.println(inventoryItem.size());


        String firstItem = inventoryItem.get(0).getText();
        String thirdItem = inventoryItem.get(2).getText();

        System.out.println(firstItem);
        System.out.println(thirdItem);

        for (int i = 0; i < inventoryItem.size(); i++) {
            System.out.println("El item en la posicion: " + i + " tiene el nombre de " + inventoryItem.get(i).getText());
        }
    }
}
