import javax.swing.JOptionPane;

public class Triangulo {
	int b,a,r;
	public Triangulo(int b, int a){
		this.b=b;
		this.a=a;	
		areatriangulo();
	}
	
	public void areatriangulo() {
		r=(b*a)/2;
		JOptionPane.showInputDialog("El area de triangulo es:"+r);
	}
	
}
