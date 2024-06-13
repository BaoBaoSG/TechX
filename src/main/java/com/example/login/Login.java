package com.example.login;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    public static void main(String[] args) {
        // Cài đặt WebDriver
        WebDriverManager.chromedriver().setup();

        // Khởi tạo trình duyệt Chrome
        WebDriver driver = new ChromeDriver();

        try {
            // Truy cập trang đăng nhập
            driver.get("https://the-internet.herokuapp.com/login");

            // Tìm và điền tên đăng nhập
            WebElement username = driver.findElement(By.id("username"));
            username.sendKeys("tomsmith");

            // Tìm và nhập mật khẩu
            WebElement password = driver.findElement(By.id("password"));
            password.sendKeys("SuperSecretPassword!");

            // Tìm và nhấn nút đăng nhập
            WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));
            loginButton.click();

            // Kiểm tra đăng nhập thành công
            WebElement successMessage = driver.findElement(By.cssSelector(".flash.success"));
            if (successMessage.isDisplayed()) {
                System.out.println("Login successful!");
            } else {
                System.out.println("Login failed!");
            }

        } finally {
            // Đóng trình duyệt
            driver.quit();
        }
    }
}
