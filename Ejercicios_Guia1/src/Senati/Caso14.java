package Senati;
import java.util.Scanner;
public class Caso14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = 0;
		System.out.print("Ingrese el numero: ");
		n = sc.nextInt();
		int result = (n*(n+1)/2);
		System.out.println("--------------------------");
		System.out.println("RESULTADOS");
		System.out.println("--------------------------");
		System.out.println("La sumatoria es :" + result);
		sc.close();

	}

}
