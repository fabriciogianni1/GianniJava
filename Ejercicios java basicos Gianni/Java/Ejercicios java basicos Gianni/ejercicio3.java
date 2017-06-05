import java.util.Scanner;

public class PatoEsUnAcumulador {
	private Scanner teclado;
	private int acum;
	private int num;
	private boolean seguir;
	
	public void acU(){
		seguir=true;
		acum=0;
		teclado= new Scanner(System.in);
		while(seguir!=false){
			System.out.print("Ingrese un numero o 9999 para terminar:");
			num = teclado.nextInt();
			if (num!=9999){
				acum=acum+num;
			}else{
				System.out.print("Finalizo la carga");
				seguir=false;
			}
			
			System.out.print("El total de la suma de los numeros ingresados es:"+acum+"\n");
		}
		
		if (acum > 0){
			System.out.print("el numero es mayor a 0");
		}else if(acum == 0){
			System.out.print("el numero es igual a 0");
		}else{
			System.out.print("el numero es menor a 0");
		}
	}
	public static void main(String[] ar){
		PatoEsUnAcumulador suma;
		suma = new PatoEsUnAcumulador();
		suma.acU();
	}
}
