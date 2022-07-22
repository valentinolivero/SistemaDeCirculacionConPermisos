package datos;

import java.time.LocalDate;

import negocio.PermisoABM;

public class Localidad extends Lugar{
	private int idLocalidad;
	private String codPostal;
	private boolean cumplirCuarentena;
	public Localidad() {
		super();
	}
	public Localidad(String lugar, String codPostal, boolean cumplirCuarentena) {
		super(lugar);
		this.codPostal = codPostal;
		this.cumplirCuarentena = cumplirCuarentena;
	}
	public String getCodPostal() {
		return codPostal;
	}
	
	public int getIdLocalidad() {
		return idLocalidad;
	}
	public void setIdLocalidad(int idLocalidad) {
		this.idLocalidad = idLocalidad;
	}
	public void setCodPostal(String codPostal) {
		this.codPostal = codPostal;
	}
	public boolean isCumplirCuarentena() {
		return cumplirCuarentena;
	}
	public void setCumplirCuarentena(boolean cumplirCuarentena) {
		this.cumplirCuarentena = cumplirCuarentena;
	}
	@Override
	public String toString() {
		return "Localidad [idLocalidad=" + idLocalidad + ", codPostal=" + codPostal + ", cumplirCuarentena="
				+ cumplirCuarentena + "]";
	}
	@Override
	public boolean ingresoHabilitado(int idPermiso, LocalDate dia) {
		// Localidad tiene habilitado el ingreso por un período que va desde la fecha del permiso hasta fecha
		//vencimiento inclusive
		PermisoABM permisoABM= new PermisoABM();
		Permiso auxiliar= permisoABM.traerPermiso(idPermiso);
		boolean flag=false;
	{
		if (dia.isBefore(auxiliar.getFecha().plusDays(5)) || dia.isEqual(auxiliar.getFecha())){
			flag= true;
		}}
		
		return flag;
	}
	

}
