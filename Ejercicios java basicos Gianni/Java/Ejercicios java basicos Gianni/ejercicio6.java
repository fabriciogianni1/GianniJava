import java.util.Scanner;

public class PatoEmpleado {
 
	private String nombre;
	private int sueldo;
	private Scanner teclado;
	
	private void carga(){
		teclado = new Scanner(System.in);
		System.out.print("Ingrese el nombre del empleado:");
		nombre=teclado.next();
		System.out.print("Ingrese el sueldo del empleado:");
		sueldo=teclado.nextInt();
	}
	
	private void imprimir(){
		System.out.print("El Nombre es:"+nombre+" y el sueldo es:"+sueldo+"\n");
		if(sueldo >= 3000){
			System.out.print("Debe pagar impuestos");
		}else {
			System.out.print("No debe pagar impuestos");
		}
	}
	
	public static void main(String[] ar){
		PatoEmpleado empleado1;
		empleado1 = new PatoEmpleado();
		empleado1.carga();
		empleado1.imprimir();
	}
}
