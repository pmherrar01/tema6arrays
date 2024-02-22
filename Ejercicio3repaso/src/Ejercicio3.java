import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {

	public static void pedirLongitud() {
		Scanner entrada = new Scanner(System.in);
		int longitud;
		do {
			try {
			System.out.println("Introduce un numero que sera la longitud del array y tiene q ser entre 1 y 10");
			longitud=entrada.nextInt();	
			}catch (InputMismatchException e) {
				System.out.println("Error el parametro introducido deve ser un numero entero");
				longitud =-1;
			}
		}while((longitud<10)&&(longitud>1));
	}
	
	public static void rellenarVector(){
		
	}	
	public static void main(String[] args) {
		
		pedirLongitud();
	}


}
