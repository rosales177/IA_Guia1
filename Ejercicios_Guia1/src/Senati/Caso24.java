package Senati;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Caso24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.println("===========================================================");
		System.out.println("                  CALCULADORA DE MONTOS");
		System.out.println("===========================================================");
		
		System.out.print("Monto 1 : ");
		float monto = sc.nextFloat();
		System.out.print("Monto 2 : ");
		float monto2 = sc.nextFloat();
		System.out.print("Monto 2 : ");
		float monto3 = sc.nextFloat();
		float suma = monto + monto2 + monto3;
		float reslt1 = (monto / 5) + (monto2*0.20f) ;
		float reslt2 = ((monto3 * 0.60f ) + monto3)/2;
		float reslt3 = (suma -( suma*0.08f));
		System.out.println("===========================================================");
		System.out.println("                      RESULTADOS");
		System.out.println("===========================================================");
		System.out.println("Resultado 1 = " + df.format(reslt1));
		System.out.println("Resultado 2 = " + df.format(reslt2));
		System.out.println("Resultado 3 = " + df.format(reslt3));
		System.out.println("============================================================");
		sc.close();

	}

}
