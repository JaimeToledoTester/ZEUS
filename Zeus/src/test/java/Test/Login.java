package Test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import POM.Base;

public class Login {

	Base b=Base.getInstance();
	By user= By.id("com.upax.zeusgeneric:id/userId");
	By continuar1=By.id("com.upax.zeusgeneric:id/tv_continue");
	By pass= By.id("com.upax.zeusgeneric:id/password"); 
	By log= By.id("com.upax.zeusgeneric:id/tv_log_in"); 
	By phone= By.id("com.upax.zeusgeneric:id/et_phone_number"); 
	By sendphone= By.id("com.upax.zeusgeneric:id/btn_send"); 
	By code=By.id("com.upax.zeusgeneric:id/et_code");
	By next=By.id("com.upax.zeusgeneric:id/btn_next");
	By next1=By.id("com.upax.zeusgeneric:id/btnNext");            
	By session=By.id("com.upax.zeusgeneric:id/btnAccept");
	By make=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup");
    By alan=By.id("com.upax.zeusgeneric:id/btnAction");
	By file=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ImageView");
	By selfile=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/com.google.android.material.card.MaterialCardView/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ImageView[1]");
	By startaudio=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ImageView");
	By startsignature=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ImageView");
	By savesign=By.id("com.upax.zeusgeneric:id/btnSave");
	By picture=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ImageView");
	By video=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ImageView");
	By azul=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.CheckBox[1]");
	By rojo=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.CheckBox[2]");
	By amarillo=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.CheckBox[3]");
    By sex=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RadioGroup/android.widget.RadioButton[1]");
    By marca=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.EditText");
    By finish=By.id("com.upax.zeusgeneric:id/btnAction");
    
    @Test
	public void MLogin() {
		User();
	    b.closedriver();
	}


	public void User() {
		b.wait(user);
		b.write("3100034",user);
		b.clic(continuar1);
		Password();
	}

	public void Password() {
		b.wait(pass);
		b.write("TestZeus2021",pass);
		b.clic(log);
		Phone();
	}

	public void Phone() {
		try {
			b.wait(phone);
			b.write("5585589859",phone);
			b.clic(sendphone);
			getcode();
		}catch(Exception e) {System.out.println("Error phone: "+e);}
	}

	public void getcode() {
		try {
			b.wait(code);
			b.write(b.notif(),code);
			b.clic(next);
			sessionaccept();
		}catch(Exception e) {System.out.println("Error getcode: "+e);}
	}

	public void sessionaccept() {
		try {
			boolean a=b.isDisplayed(session);
			if (a==true) {
				b.clic(session);
				opcions();
			}else {opcions();}
		}catch(Exception e) {System.out.println("sessionaccept: "+e);} 
	}
	
	public void opcions() {
		try {
		b.wait(make);
		b.clic(make);
		b.scroll("testing automatizacion");
		b.wait(alan);
		b.clic(alan);
		starttest();
		}catch(Exception e) {System.out.println("opcions: "+e);} 
	}
	
	public void starttest() {
		b.wait(next1);
		b.clic(next1);
		files();
	}
	
	public void files() {
		b.wait(file);
		b.clic(file);
		b.wait(selfile);
		b.clic(selfile);
		b.wait(next1);
		b.clic(next1);
		audio();
	}
	
	public void audio() {
		b.wait(startaudio);
		b.clic(startaudio);
		b.waitimplic();
		b.clic(startaudio);
		b.wait(next1);
		b.clic(next1);
		signature();
	}
	public void signature() {
		b.wait(startsignature);
		b.clic(startsignature);
		b.wait(savesign);
		b.paintsign();
		b.clic(savesign);
		b.wait(next1);
		b.clic(next1);
		pictures();
	}
	
	public void pictures() {
		b.wait(picture);
		b.clic(picture);
		b.waitimplic();
		b.takepicture();
		b.wait(next1);
		b.clic(next1);
		videos();
	}
	
	public void videos() {
		try {
		b.wait(video);
		b.clic(video);
		b.takevideo();
		b.wait(next1);
		b.clic(next1);
		colors();
		}catch(Exception e) {System.out.println("videos: "+e);}
	}
	
	public void colors() {
		b.wait(azul);
		b.clic(azul);
		b.clic(amarillo);
		b.clic(rojo);
		b.wait(next1);
		b.clic(next1);
		sexs();
	}
	
	public void sexs() {
		b.wait(sex);
		b.clic(sex);
		b.wait(next1);
		b.clic(next1);
		mh();
	}
	
	public void mh() {
		b.wait(marca);
		b.write("Nike", marca);
		b.wait(next1);
		b.clic(next1);
		mm();
	}
	
	public void mm() {
		b.wait(marca);
		b.write("Zara", marca);
		b.wait(next1);
		b.clic(next1);
		b.wait(finish);
		b.clic(finish);
	}

}
