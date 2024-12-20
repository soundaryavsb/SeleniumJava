package advancedSeleniumAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part21DynamicTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\Downloads\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/table.xhtml");

		List<WebElement> columns=driver.findElements(By.tagName("th"));
		int columnsCount=columns.size();
		System.out.println("Column count is: "+columnsCount);

		List<WebElement> rows=driver.findElements(By.tagName("tr"));
		int rowsCount=rows.size();
		System.out.println("Row count is: "+rowsCount);
		
		WebElement Representative=driver.findElement(By.xpath("//span[contains(text(),'Asiya Javayant')]"));
		Representative.click();
		
		//get the join date
		WebElement JoinDate=driver.findElement(By.xpath("//span[contains(text(),'Asiya Javayant')]//following::td[1]"));
		String DateJoined=JoinDate.getText();
		System.out.println("Munro Smith joined date is "+DateJoined);
		
		WebElement Status=driver.findElement(By.xpath("//span[contains(text(),'Asiya Javayant')]//following::td[2]"));
		String CustomerStatus=Status.getText();
		System.out.println("Munro Smith status is "+CustomerStatus);
		
		//country
		WebElement Country=driver.findElement(By.xpath("//span[contains(text(),'Asiya Javayant')]//preceding::td[1]"));
		String CountryStatus=Country.getText();
		System.out.println("Munro Smith Country is "+CountryStatus);
		
		//WebElement 
		
	}

}
