package fabricas;

import interfaces.Vehiculo;
import interfaces.VehiculoDeTransporte;

/**
 * Clase que permite la creacion de un servicio 
 * @author Luis Armando Orozco Cifuentes 1190-22-102
 *
 */
public class FabricaDeVehiculos {
	
	public static void crearFabricaDeVehiculo(VehiculoDeTransporte factory)
	{
		/**Aplicamos Polimorfismo*/
		Vehiculo objetoVehiculo= factory.crearVehiculo();
		objetoVehiculo.codigoDeVehiculo();
	}

}
