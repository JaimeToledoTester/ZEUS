import java.util.Iterator;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class operaciones {

	public static void main(String[] args) {
		
		 Scanner teclado = new Scanner( System.in );
			 int n1, n2;
			 System. out. println("Introduce el primer número:");
			 n1 = teclado.nextInt();
			 System.out.println("Introduce el segundo número:");
			 n2 = teclado.nextInt();
			 System.out.println("El resultado es:"+suma(n1,n2));
			 System.out.println("El factorial de "+n1+" es: "+factorial(n1));
			 System.out.println("El numero "+n1+" es primo?  "+esprimo(n1));
	}
		    public static int suma(int a, int b) {
			int r=0;
			r=a+b;
			return r;
			
		    }
		    
		    public static int factorial(int a) {
		    	int r=1;
		    for (int i=1; i<=a; i++) {
				r*=i;
		    }
		    return r;
		    }
		    
		    public static boolean esprimo(int a){
		    	boolean r=false;
		    	int rs=a % a;
		    	int rs2=a%1;
		    	int rs3=a % 2;
		    	if(rs==0 && rs2==0&& rs3!=0) {
		    		r=true;
		    	}
		    	return r;
		    }


}