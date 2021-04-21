import javax.swing.JOptionPane;

public class Cuadrado {

	int l,l1,r;
	public Cuadrado(int l, int l1){
		this.l=l;
		this.l1=l1;	
		areacuadrado();
	}
	
	public void areacuadrado() {
		r=l*l1;
		JOptionPane.showInputDialog("El area de cuadrado es:"+r);
	}
	
	
}
