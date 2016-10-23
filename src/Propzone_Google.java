import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Propzone_Google {

	static WebDriver driver;

	@Test
	public void demo1() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver=new FirefoxDriver();
		driver.navigate().to(
				"https://www.google.co.in/search?num=100&site=&source=hp&q=property+in+gandhinagar&oq=property+in+gandhinagar");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		// String
		// class1=driver.findElement(By.xpath(".//*[@id='class_selector']")).getText();
		// WebElement
		// we=driver.findElement(By.xpath(".//*[@id='class_selector']"));

		for (int i = 1; i < 2; i++) {

			if (driver.findElements(By.cssSelector("._Rm")).size() > 0) {
				System.out.print("Hip");
				List<WebElement> we = driver.findElements(By.cssSelector("._Rm"));
				Iterator<WebElement> itr = we.iterator();

				while (itr.hasNext()) {
					WebElement ekl = (WebElement) itr.next();
					if (ekl.getText().startsWith("www.propzonegandhinagar")) {

						System.out.println(ekl.getText());
						break;
					} else {
						System.out.println("Not found under first page");
						break;
					}

				}
				break;

			}
		}

		/*
		 * String
		 * strSiteURL=driver.findElement(By.xpath(".//*[@id='rso']/div/div["+i+
		 * "]/div/div/div/div/cite")).getText(); System.out.println(strSiteURL);
		 * if(strSiteURL.startsWith("www.propzonegandhinagar.in")) {
		 * 
		 * System.out.println("Rank: "+i); break; } } else {
		 * System.out.println("Fail"); }
		 */

		// driver.findElement(By.xpath(".//*[@id='sb_ifc0']")).sendKeys("Property
		// in gandhinagar");

		//

		/*
		 * JavascriptExecutor js = (JavascriptExecutor) driver; //Applying
		 * boarder to the element js.executeScript(
		 * "arguments[0].setAttribute('style', arguments[1]);", we,
		 * "color: red; border: 5px solid red;"); // js.executeScript("", arg1)
		 * //js.executeScript(
		 * "arguments[0].setAttribute('style', arguments[1]);", we, "");
		 * 
		 * List<WebElement> lists = we.findElements(By.tagName("option"));
		 * 
		 * for(WebElement element: lists) { String var2 = element.getText();
		 * System.out.println(var2); }
		 */
	}

}
