package auto;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest {

	public static void main(String[] args) {
		//设置驱动文件的路径
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.baidu.com");
		
		//找到百度的输入框这个元素（控件，标签：html）
		//findElement只找一个元素，findElements：找多个
		//1：通过id
		//WebElement element = driver.findElement(By.id("kw"));
		
		//2.通过name,如果radio、checkbox那么他们的选项name值是一样的
		//WebElement element = driver.findElement(By.name("wd"));
		
		//3：tagName，标签名
		//List<WebElement> elements = driver.findElements(By.tagName("input"));
		//System.out.println(elements.size());
		
		//百度的输入框是第八个
		//WebElement element = elements.get(7);
		
		//4.className
		//WebElement element = driver.findElement(By.className("s_ipt"));
		
		//5.linkText:完整的文本内容
		//WebElement element = driver.findElement(By.linkText("新闻"));
		
		//6.partialLinkText:部分文本
		//WebElement element = driver.findElement(By.partialLinkText("闻"));
						
		//7.cssSelector:样式选择器
		//WebElement element = driver.findElement(By.cssSelector("input.s_ipt"));
		WebElement element = driver.findElement(By.cssSelector("input[autocomplete='off']"));
		//8.xpath
		//WebElement element = driver.findElement(By.xpath(""));
		
		//往这个元素输入内容
		element.sendKeys("充钱才能够变强");
		
		//点击
		//element.click();
	}

}
