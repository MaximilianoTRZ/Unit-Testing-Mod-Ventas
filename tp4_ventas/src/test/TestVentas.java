package test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import Ventas.Venta;

public class TestVentas {

	@Test
	public void ValidarDetalleNoNuloEnVenta() {
		Venta venta = new Venta("Venta 1");
		assertNotNull(venta.detalle);
	}
	
	@Test
	public void ValidarFechaEnVenta() {
		Venta venta = new Venta("Venta 1");
		assertNotNull(venta.fecha);
	}
}
