package negocio;
import datos.*;

import dao.LugarDao;
public class LugarABM {
	LugarDao dao= new LugarDao();
	public Lugar traerLugar(int id) {
		return dao.traerLugar(id);
	}

	public Localidad traerLocalidad(int id) throws Exception {
		Lugar auxiliar= traerLugar(id);
		if (auxiliar==null) throw new Exception ("Error, no se encontró con esa id");
		if (auxiliar instanceof Ubicacion) {
			throw new Exception ("Error, pertenece al hijo departamento y no a Localidad");
		}
		Localidad objeto= (Localidad) auxiliar;
		return objeto;
		
	}public Ubicacion traerUbicacion(int id) throws Exception {
		Lugar auxiliar= traerLugar(id);
		if (auxiliar==null) throw new Exception ("Error, no se encontró con esa id");
		if (auxiliar instanceof Localidad) {
			throw new Exception ("Error, pertenece al hijo Localidad y no a Ubicacion");
		}
		Ubicacion objeto= (Ubicacion) auxiliar;
		return objeto;
		
	}
}
