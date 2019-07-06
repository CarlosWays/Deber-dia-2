import java.util.Scanner;
public class CalcularP{
	public static void main (String []args){
		float nota1, nota2;
		Scanner lee= new Scanner(System.in);
		System.out.println("Ingrese nota 1: ");
		nota1=lee.nextFloat();
		System.out.println("Ingrese nota 2: ");
		nota2=lee.nextFloat();
		Promedio obj= new Promedio(nota1, nota2);
		obj.Prome();
	}
}