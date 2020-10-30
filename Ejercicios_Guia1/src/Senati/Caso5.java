package Senati;
import java.util.Scanner;
public class Caso5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese el primer numero: ");
		float num1 = sc.nextFloat();
		System.out.print("Ingrese el segundo numero: ");
		float num2 =sc.nextFloat();
		float promedio = (num1 + num2) /2 ;
		
		System.out.println("=================================");
		System.out.println("El promedio es : " + promedio);
		System.out.println("El numero 1 aumentado es : " + (num1+(num1*20/100)));
		System.out.println("el segundo numero dismminuido es : " + (num2-(num2*30/100)));
		
		sc.close();
	}
}
