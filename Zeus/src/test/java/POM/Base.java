package POM;



import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import static io.appium.java_client.touch.offset.PointOption.point;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;


public class Base {
	By msn=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView[1]");
    By messaescamp=By.className("android.view.ViewGroup");
	public AndroidDriver<MobileElement> driver;
    By delete=By.id("com.android.systemui:id/clear_all");

	
	public AndroidDriver<MobileElement> generatedriver() {
		try {		
			DesiredCapabilities caps = new DesiredCapabilities();
			 caps.setCapability(CapabilityType.PLATFORM_NAME, "Android");
		        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");  
		        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "starqlteue");
		        caps.setCapability(MobileCapabilityType.UDID, "3458415559353498");
		        caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,60);
		        caps.setCapability("appPackage","com.upax.zeusgeneric");
		        caps.setCapability("appActivity",".uimodules.splash.ZGSplashActivity");
		        caps.setCapability("noReset", false);
		        caps.setCapability("noSign", true);
		        caps.setCapability("autoGrantPermissions", true);
		        URL url=new URL("http://127.0.0.1:4723/wd/hub");
			    driver= new AndroidDriver<MobileElement>(url,caps);
		    }catch(Exception e) {System.out.println("ERROR en Base Método generatedriver: "+e);}
		return driver;
	}
	
	public MobileElement findElement(By locator) {
		return driver.findElement(locator);
	}

	public List<MobileElement> findElements(By locator) {
		return driver.findElements(locator);
	}
	
	public Boolean isPresent(By locator) {
		return driver.findElements(locator).size() > 0;
	}

	public void write(String text, By locator) {
		driver.findElement(locator).sendKeys(text);
	}

	public String getText(By locator) {
		return driver.findElement(locator).getText();
	}
	
	MobileElement listitem;
	public MobileElement scroll(String text) {
		try {
        listitem= (MobileElement) driver.findElement
		(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\""+text+"\").instance(0))"));		
        listitem.click();//clic si encuentra la empresa
	    }catch(Exception e) {System.out.println("No se encontro: "+text);}
		return listitem;
	}

	public void clic(By locator) {
		driver.findElement(locator).click();
	}

	public void clear(By locator) {
		driver.findElement(locator).clear();
	}

	public void submit(By locator) {
		driver.findElement(locator).submit();
	}

	public void wait(By locator) {
		try {
			WebDriverWait load = new WebDriverWait(driver,20);
			load.until(ExpectedConditions.presenceOfElementLocated(locator));
		} catch (Exception e) {
			System.out.println("No se encontro el elemento en el tiempo de espera"+locator);
		}
	}

	public Boolean isDisplayed(By locator) {
		try {
			return driver.findElement(locator).isDisplayed();
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

	public Boolean isEnabled(By locator) {
		try {
			return driver.findElement(locator).isEnabled();
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

	public void closedriver() {
		driver.quit();
	}
	
	public void waitimplic() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}




	public String notif() {
		String code="";
		try {
		driver.openNotifications();
		wait(messaescamp);
		wait(msn);
		code=findElement(msn).getText().toString().split(":")[1];
		clic(delete);
		}catch(Exception e) {System.out.println("Error notif"+e);}
		return code;
	}
	
	public void paintsign() {
		  TouchAction a=new TouchAction(driver);
		  a.press(point(939,877)).moveTo(point(185,819)).release ().perform();
		  a.press(point(406,460)).moveTo(point(370,1540)).release ().perform();	  
	}
	
	public void takepicture() {
		try {
		TouchAction a=new TouchAction(driver);
		  Thread.sleep(2000);
		  a.press(point(558,1917)).release().perform();
		  Thread.sleep(2000);
		  a.press(point(950,1932)).release().perform();
		}catch(Exception e) {System.out.println("Error takepicture"+e);}
	}
	
	public void takevideo() {
		try {
			TouchAction b=new TouchAction(driver);
			  Thread.sleep(2000);
			  b.press(point(536,1877)).release().perform();
			  Thread.sleep(4000);
			  b.tap(point(533,1881)).perform();
			}catch(Exception e) {System.out.println("Error takevideo"+e);}
	}
	
	

	
//---------------------------------------------------singleton---------------------------
	private static Base base;

	private Base() {
    driver=generatedriver();
	}

	public static Base getInstance() {
        if (base == null) {
			base=new Base();
		}
		return base;
	}

}
