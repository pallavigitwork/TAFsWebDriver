package examplesScripts;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import com.codeborne.selenide.*;


public class selenideExample {
	
	@Test 
	public void launch_demosite() {
		Configuration.browser = Browsers.FIREFOX;
	    open("http://5elementslearning.dev/demosite");
	    $(By.linkText("My Account")).click();
	    $(By.xpath("//h1")).shouldHave(text("Welcome, Please Sign In"));
	    
	}
}
