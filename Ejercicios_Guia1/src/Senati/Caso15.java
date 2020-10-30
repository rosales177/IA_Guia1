package Senati;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Caso15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.print("Ingrese la Cantidad de producto : ");
		int cantidad =  sc.nextInt();
		System.out.print("Ingrese el precio por unidad : ");
		float precio = sc.nextFloat();
		float importe = cantidad*precio;
		System.out.println("========================================");
		System.out.println("RESULTADO");
		System.out.println("========================================");
		System.out.println("El importe es : " + importe);
		System.out.println("El euivalente a dolares es : " + df.format(importe/3.24));
		System.out.println("El equivalente a euros es : " + df.format(importe/3.75));
		
		sc.close();

	}

}
