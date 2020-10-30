package Senati;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Caso17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.print("Numeros de aprobados : ");
		float apr = sc.nextInt();
		System.out.print("Numeros de desaprobados : ");
		float des = sc.nextInt();
		System.out.print("Numeros de retirados : ");
		float ret = sc.nextInt();
		
		float  total = apr + des + ret;
		System.out.println("================================");
		System.out.println("RESULTADOS");
		System.out.println("================================");
		System.out.println("Aprobados....: " + df.format(apr*100/total) + "%");
		System.out.println("Desaprobados.: " + df.format(des*100/total) + "%");
		System.out.println("Retirados....: " + df.format(ret*100/total) + "%");
		
		sc.close();
		

	}

}
