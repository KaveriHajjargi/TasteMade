import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Taste {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.tastemade.com/");
	Thread.sleep(3000);
    driver.findElement(By.xpath("//span[@data-reactid='107']")).click();
    driver.findElement(By.id("EMAIL")).sendKeys("kaverihajjargi@gmail.com");
    driver.findElement(By.id("PASSWORD")).sendKeys("tastemade123");
    driver.findElement(By.xpath("//button[@class='Button-kDSBcD jDVmgl']")).click();
 String Title =driver.getTitle();
System.out.println(Title);
driver.close();

}
}
