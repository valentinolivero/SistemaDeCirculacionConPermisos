package datos;

import java.time.LocalDate;

public abstract class Lugar {

	protected int idLugar; 
	protected String lugar;
	public Lugar() {
		super();
	}
	public Lugar(String lugar) {
		super();
		this.lugar = lugar;
	}
	public int getIdLugar() {
		return idLugar;
	}
	public void setIdLugar(int idLugar) {
		this.idLugar = idLugar;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	} 
    public abstract boolean ingresoHabilitado( int idPermiso, LocalDate dia);


}
