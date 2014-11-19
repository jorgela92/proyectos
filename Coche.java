public class Coche{
		public int litroDeposito;
		public int consumo100 = 3;
		
		
		public void setCombustible(int litroDeposito){
			this.litroDeposito = litroDeposito;
			}
		public int getCantidadLitros(){
			return litroDeposito;
			}
		public double kilometrosRecorrer(){
			return litroDeposito / consumo100 * 100;
			}
}
class TestCoche{
	public static void main(String[] args){
		Coche c1 = new Coche();
		Coche c2 = new Coche();
		c1.setCombustible(5);
		c2.setCombustible(5);
		System.out.println("Litros deposito coche 1: "+ c1.getCantidadLitros()+" Litros");
		System.out.println("Litros deposito coche 2: "+ c2.getCantidadLitros()+" Litros");
		System.out.println("Kilometros que puede hacer el coche1: "+ c1.kilometrosRecorrer()+" Kilometros");
		System.out.println("Kilometros que puede hacer el coche2: "+ c2.kilometrosRecorrer()+" Kilometros");
	}
}
