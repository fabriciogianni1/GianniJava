import java.util.Scanner;

public class PatoEsPar {
	private Scanner teclado;
	private int num;
	
	private int impar;
	private int par;
private void parImpar(){
	teclado = new Scanner(System.in);
	par = 0;
	impar = 0;
	for(int i=1;i<=10;i++){
		System.out.print(i+".Ingrese un numero:");
		num=teclado.nextInt();
		if (num % 2 == 0){
			par=par+1;
		}
		else
		{
			impar=impar+1;
		}
		
	}
	System.out.print("La cantidad de numeros pares es:"+par+" y La cantidad de impares es:"+impar);
}
public static void main (String[] ar){
	PatoEsPar parimp;
	parimp =new PatoEsPar();
	parimp.parImpar();
	
}
}
