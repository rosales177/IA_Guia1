package Senati;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Caso20 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.println("=================================================================");
		System.out.println("*************************BOLETA DE PAGO*************************");
		System.out.println("=================================================================");
		System.out.println("PRODUCTOS...");
		System.out.println("\n[1] Lapiceros    1.50 c/u");
		System.out.println("[2] Cuadernos    4.50 c/u");
		System.out.println("[3] Plumones     6.50 c/u");
		System.out.println("[4] Colores      5.00 c/u");
		System.out.print("\nElija una opción : ");
		int opc = sc.nextInt();
		System.out.println("==================================================================");
		if (opc != 0) {
			if (opc == 1) {
				System.out.println("Lapiceros...:");
				System.out.print("Ingrese la cantidad : ");
			    int cantidad = sc.nextInt();
			    if (cantidad == 0) {
			    	System.out.println("<<<<Opción fuera de rango>>>>");
			    }
			    else {
			    	float precio = (float) 1.5*cantidad;
			    	System.out.println("Total a pagar es : s/." + precio);
			    	float aux = precio*42/100;
			    	System.out.println("Precio aumentado : " + aux);
			    }
			}
			    
			else if (opc == 2 ) {
				System.out.println("Cuadernos...:");
				System.out.print("Ingrese la cantidad : ");
			    int cantidad = sc.nextInt();
			    if (cantidad == 0) {
			    	System.out.println("<<<<Opción fuera de rango>>>>");
			    }
			    else {
			    	float precio = (float) 4.5 * cantidad;
			    	System.out.println("Total a pagar es : s/." + precio);
			    	float aux = precio*42/100;
			    	System.out.println("Precio aumentado : " + df.format(aux));
			    }
			    
			}
			else if ( opc  == 3) {
				System.out.println("Plumones.....:");
				System.out.print("Ingrese la cantidad : ");
			    int cantidad = sc.nextInt();
			    if (cantidad == 0) {
			    	System.out.println("<<<<Opción fuera de rango>>>>");
			    }
			    else {
			    	float precio = (float) 6.5*cantidad;
			    	System.out.println("Total a pagar es : s/." + precio);
			    	float aux = precio*42/100;
			    	System.out.println("Precio aumentado : " + df.format(aux));
			    }
			} 
			else if (opc == 4 ) {
				System.out.println("Colores......:");
				System.out.print("Ingrese la cantidad : ");
			    int cantidad = sc.nextInt();
			    if (cantidad == 0) {
			    	System.out.println("<<<<Opción fuera de rango>>>>");
			    }
			    else {
			    	float precio = cantidad*5;
			    	System.out.println("Total a pagar es : s/." + precio);
			    	float aux = precio*42/100;
			    	System.out.println("Precio aumentado : " + df.format(aux));
			    }
			}
			System.out.println("==================================================================");
			System.out.println("Por tiempos dificiles el precio de los productos aumentará en 42%");
		    System.out.println("==================================================================");
		    
		}
		
		else {
			System.out.println("<<<<Opción fuera de rango>>>> ");
		}
		
		
		sc.close();
		

	}

}