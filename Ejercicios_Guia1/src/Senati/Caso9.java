package Senati;
import java.util.Scanner;


public class Caso9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ingrese el primer numero :");
		int num1 = sc.nextInt();
		System.out.print("Ingrese el segundo numero : ");
		int num2 = sc.nextInt();
		System.out.println("===================================");
		System.out.println("            RESULTADOS");
		System.out.println("===================================");
		System.out.println("Area del rectangulo : " + num1*num2);
		System.out.println("El perimetro........: " + (num1*2+num2*2));
		sc.close();
		
	}

}
