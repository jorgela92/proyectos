public class Libros{
	private String nombre;
	private String isbn;
	private String editorial;
	private String autor;
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public void setIsbn(String isbn){
		this.isbn = isbn;
	}
	public void setEditorial(String editorial){
		this.editorial = editorial;
	}
	public void setAutor(String autor){
		this.autor = autor;
	}
	public String getNombre(){
			return nombre;
	}
	public String getIsbn(){
			return isbn;
	}
	public String getEditorial(){
			return editorial;
	}
	public String getAutor(){
			return autor;
	}
}
class TestLibros{
	public static void main(String[] args){
		Libros l = new Libros();
		l.setNombre("La Celestina");
		l.setIsbn("ADF1115155");
		l.setEditorial("Austral");
		l.setAutor("Fernando de Rojas");
		System.out.println("Nombre del libro: " + l.getNombre());
		System.out.println("ISBN del libro: " + l.getIsbn());
		System.out.println("Editorial del libro: " + l.getEditorial());
		System.out.println("Autor del libro: " + l.getAutor());
	}
}
