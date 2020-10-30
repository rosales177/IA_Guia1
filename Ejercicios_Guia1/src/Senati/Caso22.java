package Senati;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Caso22 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.println("===========================================================");
		System.out.println("                      LIBRETA DE NOTAS");
		System.out.println("===========================================================");
		System.out.print("Ingrese el nombre del alumno : ");
		String nombre = sc.nextLine();
		System.out.print("Ingrese la Nota 1 : ");
		float nt1 = sc.nextFloat();
		System.out.print("\nIngrese la Nota 2 : ");
		float nt2 = sc.nextFloat();
		System.out.print("\nIngrese la Nota 3 : ");
		float nt3 = sc.nextFloat();
		float nota1 = nt1 *0.20f;
		float nota2 = nt2 *0.30f;
		float nota3 = nt3 *0.50f;
		float total = nota1 + nota2 + nota3;
		System.out.println("===========================================================");
		System.out.println("Alumno : " + nombre);
		System.out.println("Su Promedio total es : " + df.format(total));
		System.out.println("===========================================================");
		
		sc.close();
	}
}
