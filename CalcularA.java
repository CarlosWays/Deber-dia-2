import java.util.Scanner;
public class CalcularA{
	public static void main (String []args){
		int lado;
		Scanner lee= new Scanner(System.in);
		System.out.println("Ingrese el lado: ");
		lado=lee.nextInt();
		Areac obj= new Areac(lado);
		obj.Area();
	}
}