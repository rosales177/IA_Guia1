package Senati;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Caso23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.println("===========================================================");
		System.out.println("                      BODEGA LUCHITO");
		System.out.println("===========================================================");
		System.out.print("Ingrese el nombre del producto : ");
		String name = sc.nextLine();
		System.out.print("Ingrese la cantidad : ");
		float cantidad = sc.nextInt();
		System.out.print("Ingrese el precio por unidad : ");
		float precio = sc.nextFloat();
		float importe = cantidad * precio;
		float Igv = importe * 0.18f;
		float dec = importe *0.03f;
		float total = importe - dec + Igv;
		System.out.println("===========================================================");
		System.out.println("Producto......................: " + name);
		System.out.println("El import es..................: " + importe);
		System.out.println("El IGV es.....................: " + df.format(Igv));
		System.out.println("El Descuento es...............: " + df.format(dec));
		System.out.println("El precio total a pagar es....: " + df.format(total));
		System.out.println("===========================================================");
		
		sc.close();

	}

}
