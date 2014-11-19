public class Pares{
	private int numero;
	Pares(int n){
		numero=n;
	}
public boolean esPar(){
	return numero % 2 ==0;
}
	public static void main(String[] args){
		Pares n1 = new Pares(2);
		Pares n2 = new Pares(3);
		boolean b1 = n1.esPar();
		boolean b2 = n2.esPar();
		System.out.println("b1: "+b1);
		System.out.println("b2: "+b2);
	}
}
