package Senati;
import java.util.Scanner;
public class Caso4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el primer numero : ");
		int num1 = sc.nextInt();
		System.out.println("Ingrese el segundo numero : ");
		int num2 = sc.nextInt();
		System.out.println("================================");
		System.out.println("La suma de los numeros es : " + (num1+num2));
		System.out.println("La resta de los numeros es: " + (num1-num2));
		System.out.println("EL producto de los dos numeros es : " + num1*num2);
		System.out.println("La divicion de los dos numeros es : " + num1/num2);
		sc.close();
		

	}

}
