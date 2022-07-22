package datos;
import java.time.*;
import java.util.Set;

public class Permiso {

	  private int idPermiso;
	  private LocalDate fecha;
	  private Persona persona; 
	  private int dias; 
	  private Rodado rodado;
	  private Set<Lugar> desdeHasta;
	public Permiso() {
		super();
	}
	public Permiso(LocalDate fecha, Persona persona, int dias, Rodado rodado, Set<Lugar> desdeHasta) {
		super();
		this.fecha = fecha;
		this.persona = persona;
		this.dias = dias;
		this.rodado = rodado;
		this.desdeHasta = desdeHasta;
	}
	public int getIdPermiso() {
		return idPermiso;
	}
	public void setIdPermiso(int idPermiso) {
		this.idPermiso = idPermiso;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	public int getDias() {
		return dias;
	}
	public void setDias(int dias) {
		this.dias = dias;
	}
	public Rodado getRodado() {
		return rodado;
	}
	public void setRodado(Rodado rodado) {
		this.rodado = rodado;
	}
	public Set<Lugar> getDesdeHasta() {
		return desdeHasta;
	}
	public void setDesdeHasta(Set<Lugar> desdeHasta) {
		this.desdeHasta = desdeHasta;
	}
	@Override
	public String toString() {
		return "Permiso [idPermiso=" + idPermiso + ", fecha=" + fecha + ", persona=" + persona + ", dias=" + dias
				+ ", rodado=" + rodado + ", desdeHasta=" + desdeHasta + "]";
	}
	
}
