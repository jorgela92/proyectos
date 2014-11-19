public class Palabra{
	//atributo
	private String contenido;	
	
	//constructor
	public Palabra(String c){
		this.contenido = c;
		}
	//metodos
	public String toString(){
		return this.contenido;
	}
	public String mayuscula(){
		return this.contenido.toUpperCase();		
	}
	public String minuscula(){
		return this.contenido.toLowerCase();
	}
	public String reemplazar(char vieja, char nueva){
		return this.contenido.replace(vieja, nueva);
	}
	public int numeroCaracteres(){
		return this.contenido.length();
	}
	public String empiezaPor(){
		return this.contenido.substring(0,1);
	}
	public char acabaPor1(){
		return this.contenido.charAt(this.contenido.length()-1);
		// return this.contenido.charAt(this.numeroCaracteres()-1);
	}
	public String acabaPor2(){
			return this.contenido.substring(this.contenido.length()-1);
	}
}
class TestPalabra{
	public static void main(String[] args){
			Palabra p1 = new Palabra("Esto es una cadena");
			System.out.println(p1);
			System.out.println("En mayusculas: "+p1.mayuscula());
			System.out.println("En minusculas: "+p1.minuscula());
			System.out.println("Longitud: "+p1.numeroCaracteres());
			System.out.println("La cadena empieza por: "+p1.empiezaPor());
			System.out.println(p1.acabaPor1());
			System.out.println(p1.acabaPor2());
			System.out.println(p1.toString());
	}
}
