package abcd;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Improve {
	 public static String driverPath = ("C:\\eclipse work space\\chrome");
	 public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver","C:\\eclipse work space\\Testing\\exefiles\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("http://www.google.com");
		driver.navigate().to("http://ec2-18-220-244-125.us-east-2.compute.amazonaws.com:9292/login");
		//driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[2]/a[1]")).click();
		//driver.switchTo().activeElement();
		//driver.findElement( By.xpath("//*[@id=\"suemail\"]")).sendKeys("revanthrocz139@gmail.com");
	
		//driver.findElement(By.xpath("//*[@id=\"supwd\"]")).sendKeys("revanthni");
		//driver.findElement(By.xpath("//*[@id=\"sucpwd\"]")).sendKeys("revanthni");
		//driver.findElement(By.xpath("//*[@id=\"singupform\"]/div[3]/p/input")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[2]/a[2]")).click();
		driver.switchTo().activeElement();
		driver.findElement(By.id("email")).sendKeys("revanthrocz139@gmail.com");
		driver.findElement(By.id("pwd")).sendKeys("revanthni");
		driver.findElement(By.xpath("//*[@id=\"myModallogin\"]/div/div/div/form/fieldset/div/div[1]/div/div[3]/p/input")).click();
		driver.findElement(By.xpath("//*[@id=\"default-button\"]")).click();
	}

}
