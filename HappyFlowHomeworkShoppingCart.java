import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.Browser;
import org.testng.annotations.*;
import static org.testng.Assert.assertTrue;

public class HappyFlowHomeworkShoppingCart {

    WebDriver driver;

    @Test(priority = 1)
    void openBrowser() throws InterruptedException {
        System.out.println("Open The Browser");
        System.setProperty("webdriver.firefox.driver","C:\\Users\\cheta\\IdeaProjects\\ShoppingHomeWorkTestNGFramework\\src\\test\\resources\\Drivers\\geckodriver.exe");
        driver = new FirefoxDriver();


        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
    }

    @Test(priority = 2)
    void selectComputeraddtocart() {
        System.out.println("Select Computer and add to cart");
        driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[1]/div/div/a")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[3]/div[2]/button[1]")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[4]/a/span[1]")).click();



    }

    @Test(priority = 3)
    void updateCart() throws InterruptedException {
        System.out.println("Update Qty to 3");
        driver.findElement(By.className("qty-input")).click();
        driver.findElement(By.className("qty-input")).sendKeys(Keys.DELETE);
        driver.findElement(By.className("qty-input")).sendKeys("3");
        driver.findElement(By.xpath("//*[@id=\"updatecart\"]")).click();

            }

    @Test(priority = 4)
    void agreeTermsOfServiceAndCheckout() {
        System.out.println("Agree Terms Of Service and Checkout");
        driver.findElement(By.xpath("//*[@id=\"termsofservice\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();

//        String actualString3 = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/form/div[1]/table/tbody/tr/td[6]/span")).getText();
//        assertTrue(actualString3.contains("$500.00"));
    }

    @Test(priority = 5)
    void checkoutAsGuest() {
        System.out.println("Checkout As Guest");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[1]/div[3]/button[1]")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[1]/div[2]/form/div/div/div[2]/div/div/div[1]/input")).sendKeys("Chetan");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[1]/div[2]/form/div/div/div[2]/div/div/div[2]/input")).sendKeys("Valand");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[1]/div[2]/form/div/div/div[2]/div/div/div[3]/input")).sendKeys("unifytester001@gmail.com");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[1]/div[2]/form/div/div/div[2]/div/div/div[4]/input")).sendKeys("Testing Company");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[1]/div[2]/form/div/div/div[2]/div/div/div[5]/select")).sendKeys("United Kingdom");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[1]/div[2]/form/div/div/div[2]/div/div/div[7]/input")).sendKeys("Leicestershire");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[1]/div[2]/form/div/div/div[2]/div/div/div[8]/input")).sendKeys("Lapwing Drive");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[1]/div[2]/form/div/div/div[2]/div/div/div[9]/input")).sendKeys("Leicester");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[1]/div[2]/form/div/div/div[2]/div/div/div[10]/input")).sendKeys("LE4 3EW");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[1]/div[2]/form/div/div/div[2]/div/div/div[11]/input")).sendKeys("07123456789");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[1]/div[2]/div/button[4]")).click();


    }

    @Test (priority = 6)
    void shippingMethod() throws InterruptedException {
        System.out.println("Shipping Method");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"shippingoption_2\"]")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[3]/div[2]/form/div[2]/button")).click();

    }

    @Test (priority = 7)
    void paymentMethod() {
        System.out.println("Payment Method");
        driver.findElement(By.xpath("//*[@id=\"paymentmethod_0\"]")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[4]/div[2]/div/button")).click();


    }

    @Test (priority = 8)
    void paymentInformation() {
        System.out.println("Payment Information");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[5]/div[2]/div/button")).click();
    }

    @Test (priority = 9)
    void confirmOrder() throws InterruptedException {
        System.out.println("Confirm Order");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[6]/div[2]/div[2]/button")).click();
        //driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/div[3]/button")).click();
        Thread.sleep(2000);
    }

    @Test (priority = 10)
    void closeBrowser() throws InterruptedException {
        System.out.println("Browser Close");
        Thread.sleep(1000);
        driver.quit();
    }

}
