package login;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginTest {

    private static final Logger logger = LogManager.getLogger(LoginTest.class);

    @Test
    public void testLogin() {
        // Cài đặt WebDriver
        WebDriverManager.chromedriver().setup();

        // Khởi tạo trình duyệt Chrome
        WebDriver driver = new ChromeDriver();

        try {
            // Mở cửa sổ trình duyệt ở kích thước tối đa
            driver.manage().window().maximize();

            // Truy cập trang đăng nhập
            logger.info("Truy cập trang đăng nhập");
            driver.get("https://the-internet.herokuapp.com/login");

            // Tìm và điền tên đăng nhập
            logger.info("Điền tên đăng nhập");
            WebElement username = driver.findElement(By.id("username"));
            username.sendKeys("tomsmith");

            // Tìm và nhập mật khẩu
            logger.info("Nhập mật khẩu");
            WebElement password = driver.findElement(By.id("password"));
            password.sendKeys("SuperSecretPassword!");

            // Tìm và nhấn nút đăng nhập
            logger.info("Nhấn nút đăng nhập");
            WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));
            loginButton.click();

            // Kiểm tra đăng nhập thành công
            WebElement successMessage = driver.findElement(By.cssSelector(".flash.success"));
            assertTrue(successMessage.isDisplayed(), "Login failed!");
            logger.info("Login successful!");

            // Chờ 3 giây để chụp màn hình
            Thread.sleep(3000);

            // Chụp ảnh màn hình
            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);
            try {
                FileUtils.copyFile(source, new File("./screenshots/screenshot.png"));
                logger.info("Screenshot taken");
            } catch (IOException e) {
                logger.error("Exception while taking screenshot: " + e.getMessage());
            }

        } catch (InterruptedException e) {
            logger.error("InterruptedException: " + e.getMessage());
        } finally {
            // Đóng trình duyệt
            driver.quit();
            logger.info("Đóng trình duyệt");
        }
    }
}
