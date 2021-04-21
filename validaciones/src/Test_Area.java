import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Test_Area {
	
	Webdriver w;
	By captural=By.id("l1");
	By captural2=By.id("l2");
	By capturab=By.id("BASE");
	By capturaa=By.id("ALTURA");
	By submit=By.xpath("//input[@text='CONFIRMAR']");
	By rtrriangulo=By.xpath("//*[contains(@text,'El area de el triangulo es:')]");
	By rcuadrado=By.xpath("//*[contains(@text,'El area de el cuadrado es:')]");
    
  @BeforeTest
  public void beforeTest() { 
	 driver.get("url");
	 
  }	
	
  @Test
  public void f(int v1,int v2) {
	  validarcuadrado(v1,v2);
	  validartriangulo(v1,v2);
  }
 

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }
  
  public void validarcuadrado(int v1, int v2) {
	  driver.findelement(captural).sendkeys(String.valueOf(v1));
	  driver.findelement(captural2).sendkeys(String.valueOf(v2));
	  driver.findelement(submit).click();
	  int result=v1*v2;
	  String resultadoweb=dirver.findelement(rcuadrado).gettext();
	  assertTrue(String.valueOf(result),resultadoweb);
  }

  public void validartriangulo(int v1, int v2) {
	  driver.findelement(capturab).sendkeys(String.valueOf(v1));
	  driver.findelement(capturaa).sendkeys(String.valueOf(v2));
	  driver.findelement(submit).click();
	  int result=(v1*v2)/2;
	  String resultadoweb=dirver.findelement(rtrriangulo).gettext();
	  assertTrue(String.valueOf(result),resultadoweb);
  }
}
