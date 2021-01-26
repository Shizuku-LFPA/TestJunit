package com.fca.calidad.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {
	private Calculadora cal,cal2,cal3,cal4;	
	@Before
	public void inizializar() {
		cal = new Calculadora();
		cal2 = new Calculadora();
		cal3 = new Calculadora();
		cal4 = new Calculadora();
	}
		@Test
	public void SumaTest() {
		float resultadoEjecucion = cal.suma(2,2);
		float resultadoEsperado=4.0f;
		//fail("Not yet implemented");
		assertEquals(resultadoEsperado,resultadoEjecucion,0.01);
	}	
	@Test
	public void RestaTest() {
		float resultadoEjecucion = cal2.resta(2,2);
		float resultadoEsperado=0.0f;
		assertEquals(resultadoEsperado,resultadoEjecucion,0.01);
	}
	@Test
	public void MultiplicaTest() {
		float resultadoEjecucion = cal3.multiplica(3,2);
		float resultadoEsperado=6.0f;
		assertEquals(resultadoEsperado,resultadoEjecucion,0.01);
	}
	
	@Test
	public void DivideTest() {
		float resultadoEjecucion = cal4.divide(2,2);
		float resultadoEsperado=0.0f;
		assertEquals(resultadoEsperado,resultadoEjecucion,0.01);
	}
}
