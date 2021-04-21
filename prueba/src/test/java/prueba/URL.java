package prueba;

public class URL {

	private static URL url;// para la instancia
	
	
	static final String instagram="http://stage.mysite.com";
	
	
	public void urls(String a,String b, String c) {
		  
	}
	
	public String facebook() {
		static final String facebook="https://www.facebook.com/";
	}
	
	private URL() {

	}
	
	

	public static URL getInstance()// si no existe una instancia creala
	{
		if (url == null) {
			url = new URL();
		}
		return url;
	}
}
