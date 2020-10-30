package Senati;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Caso19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  =  new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingrese lado 1 : ");
		float lado1 = sc.nextFloat();
		System.out.print("Ingrese lado 2 : ");
		float lado2 = sc.nextFloat();
		System.out.print("Ingrese lado 3 : ");
		float lado3 = sc.nextFloat();
		
		float perimetro = lado1 + lado2 + lado3 ;
		System.out.println("=======================================================");
		System.out.println("RESULTADO");
		System.out.println("=======================================================");
		
		System.out.println("El perimetro es : " + df.format(perimetro) + " m");
		
		sc.close();

	}

}
