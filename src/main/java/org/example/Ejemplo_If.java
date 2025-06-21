package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ejemplo_If {

    public static void main(String[] args) {

        //iniciating chrome browser
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        //Abrir la pagina de pruebas
        driver.get("https://www.saucedemo.com/v1/");

        //Identify & interact with the element in the login page
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("wrong_password");
        driver.findElement(By.id("login-button")).click();

        //Ex. If, verify an element
        WebElement errorMsg = driver.findElement(By.className("error-button"));

        if(errorMsg.isDisplayed()){
            System.out.println("Login Fallido");
        }else{
            System.out.println("Login Exitoso");
        }

       // driver.findElement(By.id("")).sendKeys(...keysToSend:"");
       //driver.findElement(By.id("user-name")).sendKeys(...keysToSend:"standard_user");



    }
}

