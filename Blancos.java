public class Blancos{
		private String palabra;
		
		public Blancos(String p){
				this.palabra=p;
		}
		public String eliminaBlancosPrincipioFinal(){
				return this.palabra.trim();
		}
		public String eliminarTodosBlancos(){
				return this.palabra.replace(" ","");
		}
		public String getPalabra(){
				return this.palabra;
		}
}
class TestBlancos{
	public static void main(String[] args){
			Blancos b = new Blancos(" Esto es una cadena ");
			System.out.println(b.getPalabra());
			System.out.println(b.eliminaBlancosPrincipioFinal());
			System.out.println(b.eliminarTodosBlancos());
	}
}
