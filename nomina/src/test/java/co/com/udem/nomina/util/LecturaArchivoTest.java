package co.com.udem.nomina.util;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LecturaArchivoTest {
	
	private final LecturaArchivo lecturaArchivo = new LecturaArchivo();
	
	@Test
	public void leerArchivo() {
		String lectura = lecturaArchivo.leerArchivo();
		assertEquals("", lectura);
	}
	
	//@Test
	public void leerRegistro() {
		String registro = "Walter Armando,Llano Suarez,111111111,TECNICO,5000000";
		lecturaArchivo.leerRegistro(registro);
		assertEquals("Walter Armando,Llano Suarez,111111111,TECNICO,5000000", registro);
	}

}
