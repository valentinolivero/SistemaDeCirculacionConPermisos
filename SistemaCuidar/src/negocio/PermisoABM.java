package negocio;
import datos.*;

import dao.PermisoDao;

public class PermisoABM {

	PermisoDao dao= new PermisoDao();
	public Permiso traerPermiso(int idPermiso) {
		return dao.traerPermiso(idPermiso);
	}
}
