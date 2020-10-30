package Senati;
import java.util.Scanner;
public class Caso13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese su nombre: ");
		String nombre = sc.nextLine();
		System.out.print("Ingrese su apellido: ");
		String apellido = sc.next();
		String aux = " ";
		System.out.println("================================");
		System.out.println("RESULTADO");
		System.out.println("================================");
		String result = nombre.concat(aux);
		String res = result.concat(apellido);
		System.out.println("Nombre completo :" + res);
		sc.close();

	}

}
