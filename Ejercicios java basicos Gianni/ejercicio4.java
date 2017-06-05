import java.util.Scanner;

public class PatoBasico {
				
		private Scanner teclado;
		private int num1, num2,total;
	
	public void carga(){
	System.out.print("ingrese un numero");
	num1=teclado.nextInt();
	System.out.print("ingrese otro numero");
	num2=teclado.nextInt();
	}
	
	public int suma(){
		total=num1+num2;
		return total;
	}
	
	public int resta(){
		total=num1-num2;
		return total;
	}
	
	public int multiplicacion(){
		total=num1*num2;
		return total;
	}
	
	public int division(){
		total=num1/num2;
		return total;
	}
	private static void main(String[] ar){
		PatoBasico operaciones;
		operaciones = new PatoBasico();
		operaciones.carga();
		System.out.print("El resultado de la suma entre "+num1+"+"+num2+"="+operaciones.suma());
	}
	}
