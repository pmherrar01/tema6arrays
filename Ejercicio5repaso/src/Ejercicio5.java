import java.util.Scanner;

public class Ejercicio5 {

	public static int pedirNumeros() {
		Scanner entrada = new Scanner(System.in);
		int numeros;
		System.out.println("Introduce un numero para el array bidimensional");
		numeros=entrada.nextInt();
		return numeros;		
	}

	public static void rellenarMatric(int aNumeros[][]) {
		int i, j;
		for(i=0;i<aNumeros.length;i++) {
			for(j=0;j<aNumeros[i].length;j++) {
				aNumeros[i][j] = pedirNumeros();
			}
		}
	}

	public static void mostrarMatric(int aNumeros[][]) {
		int i, j;
		for (i=0; i<aNumeros.length;i++) {
			for(j=0;j<aNumeros[i].length;j++) {
				System.out.print("["+aNumeros[i][j]+"]");
			}
		}
	}

	public static int calcularMayor(int aNumeros[][]) {
		int mayor = aNumeros[0][0];
		for(int i = 0;i < aNumeros.length;i++){
			for(int j = 0; j < aNumeros[i].length;j++){
				if  (aNumeros[i][j] > mayor){
					mayor = aNumeros[i][j];
				}
			}
		}

		return mayor;

	}

	public static int calcularMenor(int aNumeros[][]) {
		int menor = aNumeros[0][0];
		for(int i = 0;i < aNumeros.length;i++){
			for(int j = 0; j < aNumeros[i].length;j++){
				if  (aNumeros[i][j] < menor){
					menor = aNumeros[i][j];
				}
			}
		}

		return menor;

	}

	public static int calcularSuma(int aNumeros[][]) {
	    int i, j, suma = 0;
	    for (i = 0; i < aNumeros.length; i++) {
	        for (j = 0; j < aNumeros[i].length; j++) {
	            suma += aNumeros[i][j];
	        }
	    }
	    return suma;
	}


	public static void main(String[] args) {
		    int numeros = pedirNumeros();
		    int[][] aNumeros = new int[4][2];

		    rellenarMatric(aNumeros);
		    mostrarMatric(aNumeros);

		    int mayor, menor, suma;

		    mayor = calcularMayor(aNumeros);
		    menor = calcularMenor(aNumeros);
		    suma = calcularSuma(aNumeros);

		    System.out.println("El mayor es: " + mayor);
		    System.out.println("El menor es: " + menor);
		    System.out.println("La suma es: " + suma);
		}


}
