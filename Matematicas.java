public class Matematicas{
	private double numero;
	
	public double getNumero(){
		return numero; 
	}
	public void setNumero(double numero){
		this.numero = numero;
	}
	public double raizCuadrada(){
		return Math.sqrt(this.numero);
	}
	public double raizCuvica(){
		return Math.abs(Math.cbrt(this.numero));
	}
	public int redondeoPositivo(){
		return (int)Math.round(Math.abs(this.numero));		
	}
	public int aleatorio(){
		return (int)(Math.round(Math.random())* Math.round(Math.abs(this.numero)));
	}
}
class TestMatematicas{
	public static void main(String[] args){
		Matematicas num = new Matematicas();
		num.setNumero(-49.2356);
		System.out.println("La raiz cuadradad de: "+ num.getNumero()+" es: "+num.raizCuadrada());
		System.out.println("La raiz cuvica de: "+ num.getNumero()+" es: "+num.raizCuvica());
		System.out.println("El redondeo del numero: "+ num.getNumero()+" es: "+num.redondeoPositivo());
		System.out.println(num.aleatorio());
		System.out.println("Numero PI: "+Math.PI);
		System.out.println("Numero E: "+Math.E);
	}
}
