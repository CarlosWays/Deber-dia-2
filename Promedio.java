public class Promedio{
	private float nota1, nota2;
	public Promedio(float nota1, float nota2){
		this.nota1=nota1;
		this.nota2=nota2;
		
	}
	public void setNota1(float nota1){
		nota1=nota1;
	}
	public float getNota1(){
		return nota1;
	}
	public void setNota2(int nota2){
		nota2=nota2;
	}
	public float getNota2(){
		return nota2;
	}
	public void Prome(){
		float prom=0;
		prom=(nota1+nota2)/2;
		System.out.println("El promedio es:");
		System.out.println(prom);
	}
}