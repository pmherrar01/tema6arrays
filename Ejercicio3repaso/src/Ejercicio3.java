import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {

	public static int pedirLongitud() {
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
		}while((longitud <= 0)&&(longitud > 10));
		return longitud;
	}

	public static int generarAleatorio() {
		int aleatorio;
		aleatorio = (int)((Math.random()*6)+1);
		return aleatorio;
	}

	public static void rellenarVector(int vNum[]){
		int i;
		for(i=0; i < vNum.length; i++) {
			vNum[i] = generarAleatorio();
		}

	}
	public static void mostrarVector(int vNum[]){
		int i;
		for (i = 0;i < vNum.length;i++){
			System.out.print("["+vNum[i]+"] ");
		}
	

}	
public static void main(String[] args) {
	int longitud = pedirLongitud();
	int[] vNum = new int[longitud];
	rellenarVector(vNum);
	mostrarVector(vNum);
}


}
