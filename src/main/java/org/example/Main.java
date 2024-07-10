package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.automationexercise.com/");
        driver.manage().window().maximize();
        driver.get("https://www.automationexercise.com/login");
        WebElement textBoxFirst = driver.findElement(By.xpath("//input[@data-qa=\"login-email\"]"));
        textBoxFirst.sendKeys("mahmoud.elhalawany1996@gmail.com");
        WebElement textBoxSecond = driver.findElement(By.xpath("//input[@data-qa=\"login-password\"]"));
        textBoxSecond.sendKeys("1*1m7mod");
        WebElement loginButton = driver.findElement(By.xpath("//button[@data-qa=\"login-button\"]"));
        loginButton.click();
        WebElement nameField = driver.findElement(By.xpath("//a[@href=\"/logout\"]"));
//        if (nameField.getText().equalsIgnoreCase("logout")) {
//            System.out.println("Pass");
//        } else {
//            System.out.println("Fail");
//        }
        if (nameField.isDisplayed()  && nameField.isEnabled()) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }


    }
}