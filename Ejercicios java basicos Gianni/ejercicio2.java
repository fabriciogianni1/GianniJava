
import java.util.Scanner;
public class Precio {
	private Scanner teclado;
	private int precio;
	private int cantidad;
	private int total;
public void calcular(){
	teclado= new Scanner(System.in);
	System.out.print("Ingrese el precio del producto:");
	precio = teclado.nextInt();
	System.out.print("Ingresela cantidad que lleva:");
	cantidad= teclado.nextInt();
	total= precio * cantidad;
	System.out.print("tendra que abonar:$"+total);
}
public static void main (String[] ar){
Precio precio1;
precio1 = new Precio();
precio1.calcular();
}
}
