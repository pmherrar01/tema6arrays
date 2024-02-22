import java.util.Scanner;

public class Ejercicio1 {

	public static void rellenarVector(int vector[]) {
		Scanner entrada = new Scanner(System.in);
		int num=0;
		for(int i=0; i < vector.length; i++) {
			System.out.println("Introduce un numero");
			vector[i]=entrada.nextInt();
		}
	}
	
    public static void mostrarPares(int vNum[]){
        int i;
        for (i = 0;i < vNum.length;i++){
            if  ((vNum[i] % 2) == 0){
                System.out.println("["+vNum[i]+"]");
            }
        }
    }

	public static void main(String[] args) {
		int[] vNum = new int [10];
		rellenarVector(vNum);
		mostrarPares(vNum);
	}

}