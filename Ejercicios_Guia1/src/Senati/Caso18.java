package Senati;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Caso18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  =  new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingrese la longirud de la base del triangulo : ");
		float base = sc.nextFloat();
		System.out.print("Ingrese la longitud de la altura del triangulo : ");
		float altura = sc.nextFloat();
		
		float area = base* altura/2;
		System.out.println("=======================================================");
		System.out.println("RESULTADO");
		System.out.println("=======================================================");
		
		System.out.println("El area es : " + df.format(area) + "m2");
		
		sc.close();

	}

}
