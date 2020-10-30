package Senati;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Caso16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingrese las horas trabajadas :");
		int horas = sc.nextInt();
		System.out.print("Ingrese la tarifa por hora  : ");
		float tarifa = sc.nextFloat();
		float sueldo = horas * tarifa;
		float bono = sueldo * 5/ 100;
		float total = sueldo + bono;
		System.out.println("===================================");
		System.out.println("RESUMEN");
		System.out.println("===================================");
		System.out.println("Sueldo.....................: " + df.format(sueldo));
		System.out.println("Bono.......................: " + df.format(bono));
		System.out.println("Sueldo neto................: " + df.format(total));
		System.out.println("Equivalente a dolares es...: " + df.format(total/3.24));
		sc.close();
	}

}
