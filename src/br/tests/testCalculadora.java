package br.tests;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import br.codigo.Calculadora;

public class testCalculadora {
	Calculadora calc;
	
	@Before
	public void inicializa() {
		calc = new Calculadora();
		calc.setOperador1(3);
		calc.setOperador2(9);
	}
	
	@Test
	public void testaSoma() {
		assertEquals(12, calc.soma());
	}
	
	@Test
	public void testaSubtracao() {
		assertEquals(-6, calc.subtracao());
	}
	
	@Test
	public void testaMultiplicacao() {
		assertEquals(27, calc.produto());
	}
	
	@Test
	public void testaDivisao() {
		assertEquals(1.0 / 3, calc.divisao(), 0.00001);
	}
	
	@Test
	public void testaPotencia() {
		assertEquals(19683, calc.potencia());
	}
}
