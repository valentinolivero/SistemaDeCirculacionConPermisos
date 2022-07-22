package test;
import java.util.*;
import datos.*;
import java.time.*;
import negocio.*;
public class TestMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.out.println("\n 1");
		PermisoABM permisoABM= new PermisoABM();
		System.out.println(permisoABM.traerPermiso(4).toString());
		System.out.println("\n 2");
		LugarABM lugarABM =new LugarABM();
		System.out.println(lugarABM.traerLocalidad(3));
		System.out.println(((Localidad) lugarABM.traerLocalidad(3)).ingresoHabilitado(4 , LocalDate.of(2021, 5, 12)));
		System.out.println(((Localidad) lugarABM.traerLocalidad(3)).ingresoHabilitado(4 , LocalDate.of(2021, 5, 20)));
		System.out.println(((Localidad) lugarABM.traerLocalidad(3)).ingresoHabilitado(4 , LocalDate.of(2021, 5, 25)));

		System.out.println("\n 3");
		System.out.println(lugarABM.traerUbicacion(4));
		System.out.println(((Ubicacion) lugarABM.traerUbicacion(4)).ingresoHabilitado(3 , LocalDate.of(2021, 3, 31)));
		System.out.println(((Ubicacion) lugarABM.traerUbicacion(4)).ingresoHabilitado(3 , LocalDate.of(2021, 4, 30)));

	}

}
