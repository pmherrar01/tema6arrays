import java.util.Scanner;

public class Ejercicio8 {

	public static int pedirNumero() {
		Scanner entrada = new Scanner(System.in);
		int num;
		System.out.println("Introduce un numero de 5 cifras");
		num = entrada.nextInt();
		return num;
	}
	
	public static void dividirCifras(int num){
		int n1, n2, n3, n4, n5;
		
		n1 = num % 10;
        n2 = (num / 10) % 10;
        n3 = (num / 100) % 10;
        n4 = (num / 1000) % 10;
        n5 = (num / 10000) % 10;
	}
	
	public static void main(String[] args) {
		

	}

}
