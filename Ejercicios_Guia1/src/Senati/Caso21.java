package Senati;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Caso21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.println("===========================================================");
		System.out.println("                    CUPON DE DESCUENTO");
		System.out.println("===========================================================");
		System.out.print("Ingrese el valor del gasto realizado : ");
		float gasto = sc.nextFloat();
		float desc = gasto*0.12f;
		System.out.println("El descuento es de : " + df.format(desc));
		System.out.println("Usted pagará : " + df.format(gasto-desc));
		System.out.println("===========================================================");
		System.out.println("<<El descuento se calcula dependiendo del gasto realizado>>");
		System.out.println("===========================================================");
		
		sc.close();
	}

}
