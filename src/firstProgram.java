import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class firstProgram {
	public static WebDriver dri;
	@Before
	public  void launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JAGADESHAN R\\eclipse\\jaga01\\Firstpro\\driss\\chromedriver.exe");
		dri = new ChromeDriver();
		dri.get("http://ntrack.thegoldenelement.com ");
		
		dri.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		dri.manage().window().maximize();
	}
	@Test
	public  void test1() {
	Select s= new Select(dri.findElement(By.id("language")));
	s.selectByIndex(1);
	WebDriverWait w = new WebDriverWait(dri,50);
	w.until(ExpectedConditions.elementToBeClickable(dri.findElement(By.id("cId"))));
	dri.findElement(By.id("cId")).sendKeys("demo");
	dri.findElement(By.id("uName")).sendKeys("demo-ca");
	dri.findElement(By.id("pass")).sendKeys("12345");
	dri.findElement(By.xpath("//button[text()='Login']")).click();
	//String ss= dri.getCurrentUrl();
	//System.out.println(ss);
	//Assert.assertTrue("verify",dri.getCurrentUrl().contains("gridview"));
	Assert.assertTrue("verify",dri.getTitle().contains("GPS-TRACK"));
	//WebElement ww = dri.findElement(By.xpath("(//a[text()='Live Data'])[1]"));
	//Assert.assertEquals("verify","Live Data", ww.getAttribute("text"));
		
		
	}

	@Test
	public  void test2() {
	Select s= new Select(dri.findElement(By.id("language")));
	s.selectByIndex(1);
	WebDriverWait w = new WebDriverWait(dri,50);
	w.until(ExpectedConditions.elementToBeClickable(dri.findElement(By.id("cId"))));
	dri.findElement(By.id("cId")).sendKeys("demo");
	dri.findElement(By.id("uName")).sendKeys("demo-ca");
	dri.findElement(By.id("pass")).sendKeys("123");
	dri.findElement(By.xpath("//button[text()='Login']")).click();
	Assert.assertTrue("verify",dri.getCurrentUrl().contains("gridview"));
	//Assert.assertEquals(" Verify the data",dri.findElement(By.xpath("(//a[text()='Live Data'])[1])")).getText().contains("Live Data"));
		
		
	}

	@Test
	public  void test3() {
	Select s= new Select(dri.findElement(By.id("language")));
	s.selectByIndex(2);
	WebDriverWait w = new WebDriverWait(dri,50);
	w.until(ExpectedConditions.elementToBeClickable(dri.findElement(By.id("cId"))));
	dri.findElement(By.id("cId")).sendKeys("demo");
	dri.findElement(By.id("uName")).sendKeys("demo-ca");
	dri.findElement(By.id("pass")).sendKeys("12345");
	dri.findElement(By.xpath("//button[text()='تسجيل الدخول']")).click();
	//String ss= dri.getCurrentUrl();
	//System.out.println(ss);
	//Assert.assertTrue("verify",dri.getCurrentUrl().contains("gridview"));
	Assert.assertTrue("verify",dri.getTitle().contains("GPS-TRACK"));
	//WebElement ww = dri.findElement(By.xpath("(//a[text()='Live Data'])[1]"));
	//Assert.assertEquals("verify","Live Data", ww.getAttribute("text"));
		
		
	}

	@Test
	public  void test4() {
	Select s= new Select(dri.findElement(By.id("language")));
	s.selectByIndex(2);
	WebDriverWait w = new WebDriverWait(dri,50);
	w.until(ExpectedConditions.elementToBeClickable(dri.findElement(By.id("cId"))));
	dri.findElement(By.id("cId")).sendKeys("demo");
	dri.findElement(By.id("uName")).sendKeys("demo-ca");
	dri.findElement(By.id("pass")).sendKeys("123");
	dri.findElement(By.xpath("//button[text()='تسجيل الدخول']")).click();
	Assert.assertTrue("verify",dri.getCurrentUrl().contains("gridview"));
	//Assert.assertEquals(" Verify the data",dri.findElement(By.xpath("(//a[text()='Live Data'])[1])")).getText().contains("Live Data"));
		
		
	}

	@After
	public  void close() {
		//dri.close();
		
	}
		

}
