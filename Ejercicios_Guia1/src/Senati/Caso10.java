package Senati;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.print("ingrese el radio :");
		int rd = sc.nextInt();
		float pi = (float) 3.14159;
		System.out.println("===================================");
		System.out.println("            RESULTADOS");
		System.out.println("===================================");
		
		
		System.out.println("Area del circulo es : " + df.format(pi*rd*rd));
		System.out.println("El perimetro........: " + df.format(2*pi*rd));
		sc.close();

	}

}
