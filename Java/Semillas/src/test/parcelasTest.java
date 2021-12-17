package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import parcelas.Parcelas;
import semillas.*;

class parcelasTest {

		Quinoa unaQuinoa = new Quinoa(2015, 3, 8); // anio, altura, horas
		Parcelas unaParcela = new Parcelas(3, 4, 6); // ancho, largo, horas
	@Test
	void test() {
		
		unaParcela.plantar(new Menta(2018, 2)); // anio, altura
		
		Assertions.assertFalse(unaParcela.tieneComplicaiones());// 2<6
	}
	
	@Test
	void plantacion() {
		
	}

}
