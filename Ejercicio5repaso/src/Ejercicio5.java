import java.util.Scanner;

public class Ejercicio5 {

	public static int pedirNumeros() {
		Scanner entrada = new Scanner(System.in);
		int numeros;
		System.out.println("Introduce un numero para el array bidimensional");
		numeros=entrada.nextInt();
		return numeros;		
	}

	public static void rellenarMatric(int numeros, int aNumeros[][]) {
		int i, j;
		for(i=0;i<aNumeros.length;i++) {
			for(j=0;j<aNumeros[j].length;j++) {
				aNumeros[i][j] = numeros;
			}
		}
	}

	public static void mostrarMatric(int aNumeros[][]) {
		int i, j;
		for (i=0; i<aNumeros.length;i++) {
			for(j=0;j<aNumeros[j].length;j++) {
				System.out.println(" [" + i + j + "] " + aNumeros[i][j]);
			}
		}
	}
	
	public static int mostrarMayor(int aNumeros[][]) {
		int mayor = aNumeros[0][0];
        for(int i = 0;i < aNumeros.length;i++){
            for(int j = 0; j < aNumeros[0].length;j++){
                if  (aNumeros[i][j] > mayor){
                    mayor = aNumeros[i][j];
                }
            }
        }
		
		return mayor;
		
	}
	
	public static int mostrarMenor(int aNumeros[][]) {
		int menor = aNumeros[0][0];
        for(int i = 0;i < aNumeros.length;i++){
            for(int j = 0; j < aNumeros[0].length;j++){
                if  (aNumeros[i][j] < menor){
                    menor = aNumeros[i][j];
                }
            }
        }
		
		return menor;
		
	}

	public static void main(String[] args) {

		int [][] aNumeros = new int [4][2];
	}

}
