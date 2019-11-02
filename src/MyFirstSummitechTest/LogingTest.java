package MyFirstSummitechTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//setting the property of your test
		//you specify the type of driver to be used with 1st command. 2nd command in bracket specifies the location of where your driver is in
	   	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Onyekachi\\Desktop\\summitech\\executables\\chromedriver.exe");
	   	
	   	 

	   	 //Creating an instance of driver, to launch browser
	   	 //this launches the driver/browser we specified 
	   	 WebDriver browser = new ChromeDriver();

	   	 

	   	 //to open the facebook login page

	   	 browser.get("https://www.facebook.com/");

	    

	   	 //to maximize the browser

	   	 browser.manage().window().maximize();

	   	 

	   	 //to check the actual url is displayed
	   	 //get the title of the webpage
	   	 System.out.println(browser.getTitle());

	   	 

	   	 //to write email into email field
	   	 //action select, hold back, scroll(to scroll using the scroll bar
	   	 browser.findElement(By.id("email")).sendKeys("ojasperduruzor@yahoo.com");
	   	 //browser.findElement(By.type("email")).sendKeys("ojasperduruzor@yahoo.com");
	   	 //browser.findElement(By.class("inputtext login_form_input_box")).sendKeys("ojasperduruzor@yahoo.com");
	   	 //browser.findElement(By.name("email")).sendKeys("ojasperduruzor@yahoo.com");
	   	 //browser.findElement(By.data-testid("royal_email")).sendKeys("ojasperduruzor@yahoo.com");
	   	  //browser.findElement(By.Xpath("//*[@id=\"email\"]")).sendKeys("ojasperduruzor@yahoo.com");
	   
	  
	   	 

	   	 //to write password into the password field

	   	browser.findElement(By.id("pass")).sendKeys("faith123");
	   	//browser.findElement(By.Xpath("//*[@id="pass"]")).sendKeys("faith123");	
	   	//browser.findElement(By.type("password")).sendKeys("faith123");
	   	//browser.findElement(By.class("inputtext login_form_input_box")).sendKeys("faith123");
	   	//browser.findElement(By.name("pass")).sendKeys("faith123");
	   	//browser.findElement(By.data-testid("royal_pass")).sendKeys("faith123");
	   
	   	 
	   	 

	   	 //to click the login button

	   	 browser.findElement(By.id("loginbutton")).click();

	   	 

	   	 //to close the browser

	   	 browser.close();
	}

}
