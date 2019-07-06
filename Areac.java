public class Areac{
	private int lado, area;
	public Areac(int lado){
		this.lado=lado;
		
	}
	public void setLado(int lado){
		lado=lado;
	}
	public int getLado(){
		return lado;
	}
	public void Area(){
		int area=0;
		area=lado*lado;
		System.out.println("El area del cuadrado es:");
		System.out.println(area);
	}
}