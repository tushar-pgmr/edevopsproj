package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProjCert {
	
  @Test
  public void f() throws InterruptedException {
	    	
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://3.16.167.233:32768/");
		Thread.sleep(1000);
				
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("About Us")).click();
		
				
		String estr = "This is about page. Lorem Ipsum Dipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.\n" + 
				"It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).";
		String astr = driver.findElement(By.xpath("/html/body")).getText();
		Assert.assertEquals(astr, estr);
		
		System.out.printf("%n PRINTING THE EXTRACTED TEXT:%n %s %n%n", astr);
				
		Thread.sleep(30000);
		driver.close();
  }
  
}
