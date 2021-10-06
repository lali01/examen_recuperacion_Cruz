package examen.recuperacion;

public class Becado {

	private String codigoDeBeca;
	private String nombre;
	private String apellido;
	
	
	public String getCodigoDeBeca() {
		return codigoDeBeca;
	}
	public void setCodigoDeBeca(String codigoDeBeca) {
		this.codigoDeBeca = codigoDeBeca;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	@Override
	public String toString() {
		return "Becado [codigoDeBeca=" + codigoDeBeca + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	
}
