package datos;

public class Persona {
	private int idPersona; 
	private String apellido; 
	private String nombre;  
	private int dni;
	public Persona() {
		super();
	}
	public Persona(String apellido, String nombre, int dni) {
		super();
		this.apellido = apellido;
		this.nombre = nombre;
		this.dni = dni;
	}
	public int getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", apellido=" + apellido + ", nombre=" + nombre + ", dni=" + dni
				+ "]";
	}
	
	



}
