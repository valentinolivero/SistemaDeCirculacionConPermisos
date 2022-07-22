package datos;

import java.time.LocalDate;
import negocio.PermisoABM;

public class Ubicacion extends Lugar {

	private int idUbicacion;
	private int longitud;
	private int latitud;

	public Ubicacion() {
		super();
	}

	public Ubicacion(String lugar, int longitud, int latitud) {
		super(lugar);
		this.longitud = longitud;
		this.latitud = latitud;
	}

	public int getIdUbicacion() {
		return idUbicacion;
	}

	public void setIdUbicacion(int idUbicacion) {
		this.idUbicacion = idUbicacion;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public int getLatitud() {
		return latitud;
	}

	public void setLatitud(int latitud) {
		this.latitud = latitud;
	}

	@Override
	public String toString() {
		return "Ubicacion [idUbicacion=" + idUbicacion + ", longitud=" + longitud + ", latitud=" + latitud + "]";
	}

	@Override
	public boolean ingresoHabilitado(int idPermiso, LocalDate dia) {
		PermisoABM permisoABM= new PermisoABM();
		Permiso auxiliar= permisoABM.traerPermiso(idPermiso);
		boolean flag= false;
		for (long i=0; i<auxiliar.getDias();i++) {
		if (auxiliar.getFecha().plusDays(i).isEqual(dia)) {
			flag=true;
			i= auxiliar.getDias();
		}}
		
		return flag;
	}



}
