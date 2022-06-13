package Ventas;

import java.util.Date;

public class Venta {


	public Detalle detalle;
	public Date fecha;
	
	public Venta(String texto) {
		this.detalle = new Detalle(texto);
		this.fecha = new Date();
	}

}


