package fabricas;
import interfaces.Vehiculo;
import interfaces.VehiculoDeTransporte;

import javax.swing.JOptionPane;

import clases.Buseta;


/**
 * Clase que permite la creacion de un objeto Buseta
 * @author Luis Armando Orozco Cifuentes 1190-22-102
 *
 */
public class FabricaBusetas implements VehiculoDeTransporte{

	@Override
	public Vehiculo crearVehiculo() {
		Buseta miBuseta=new Buseta();
		miBuseta.setCodigo(miBuseta.generarCodigo());
		JOptionPane.showMessageDialog(null, "Se ha creado un nuevo Objeto Buseta  ");
		return miBuseta;
	}



}
