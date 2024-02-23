import java.util.Scanner;

public class ejercicio15 {

	public static int generarAleatorios() {
		int aleatorio;
		aleatorio = (int)((Math.random()*91)+10);
		return aleatorio;
	}

	public static void rellenarVector(int vVentas[], int aleatorio) {
		int i;
		for(i=0; i<vVentas.length;i++) {
			vVentas[i] = generarAleatorios();
		}

	}

	public static void mostrarVector(int vVentas[]) {
		int i;
		for(i=0; i<vVentas.length;i++) {
			System.out.print("["+vVentas[i]+"] ");
		}
	}

	public static void mostrarVentasInversa(int vVentas[]){
		int i;
		for(i = vVentas.length - 1;i >= 0;i--){
			System.out.print("["+vVentas[i]+"]");
		}
	}

	public static void sumaVentas(int vVentas[]) {
		int suma=0, i;
		for(i=0;i<vVentas.length;i++) {
			suma = suma + vVentas[i];
		}
		System.out.println("Ventas totales: " + suma);
	}
	
    public static void mostrarMejorMes(int vVentas[]){
        String[] vMeses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        int i, mes = 0, mayor = vVentas[0];
        for(i = 1;i < vVentas.length;i++){
            if  (vVentas[i] > mayor){
                mayor = vVentas[i];
                mes = i;
            }
        }
        System.out.println("El mejor mes es "+vMeses[mes]+" con "+mayor+" ventas");
    }
	
	public static void rrellenarMeses(int vMeses[]) {
		int i;
		for(i=0; i< vMeses.length;i++) {
			
		}
	}
	
    public static void mostrarVentasTotalesMesesPares(int vVentas[]){
        int i, suma = 0;
        for(i = 0;i < vVentas.length;i++){
            if  (((i + 1) % 2) == 0){
                suma = suma + vVentas[i];
            }
        }
        System.out.print("\n Ventas totales: "+suma);
    }

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int aleatorio=generarAleatorios();
		int[] vVentas = new int[12];
		int opc;
		do{
			System.out.println("\n  MENU");
			System.out.println("1. Rellenar Ventas");
			System.out.println("2. Mostrar Ventas");
			System.out.println("3. Mostrar ventas al revés");
			System.out.println("4. Ventas totales");
			System.out.println("5. Ventas totales meses pares");
			System.out.println("6. Mes con más ventas");
			System.out.println("7. Salir");
			System.out.print("   Opción: ");
			opc = entrada.nextInt();
			switch(opc){
			case 1:
				rellenarVector(vVentas, aleatorio);
				break;
			case 2:
				mostrarVector(vVentas);
				break;
			case 3:
				mostrarVentasInversa(vVentas);
				break;
			case 4:
				sumaVentas(vVentas);
				break;
			case 5:
				mostrarVentasTotalesMesesPares(vVentas);
				break;
			case 6:
				mostrarMejorMes( vVentas);
			break;
			case 7:
				System.out.print("¡Hasta la próxima!");
				break;
			default:
				System.out.print("Opción incorrecta");
			}
		}while(opc != 7);
	}
}
