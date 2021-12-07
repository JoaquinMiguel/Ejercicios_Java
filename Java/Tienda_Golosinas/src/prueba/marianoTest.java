package prueba;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import golosinas.*;

class marianoTest {
	
	@Test
	void cantidadGolosinas() {
		Mariano.crearGolosina(new Bombon());
		Mariano.crearGolosina(new Alfajor());
		Mariano.crearGolosina(new Oblea());
		
		Assertions.assertEquals(3, Mariano.cantidadDeGolosinas());
		Mariano.desechar("Oblea");
		Assertions.assertEquals(2, Mariano.cantidadDeGolosinas());
		
		Assertions.assertTrue(Mariano.tieneLaGolosina("Bombon"));

	}

	@Test
	void probarGolosina() {
		Mariano.probarGolosina(); // Mordisco a bombon y alfajor
		
		Assertions.assertEquals(251, Mariano.pesoGolosinas());
	}
	
	@Test
	void precios() {	
		//Mariano.crearGolosina(new Caramelo());
		Assertions.assertTrue( Mariano.hayGolosinaSinTACC());
		
	}
		
	@Test
	void sabores() {
		List<String> res = Arrays.asList("Bombon");
		Set<String> res2 = new HashSet<>(Arrays.asList("frutilla", "chocolate"));
		
		Assertions.assertEquals("Bombon", Mariano.golosinaDeSabor("frutilla"));
		
		Assertions.assertEquals(res, Mariano.golosinasDeSabor("frutilla"));
		Assertions.assertEquals(res2, Mariano.sabores());
	}
	
	@Test
	void tiposGolosinas() {
		List<String> miLista = Arrays.asList("Oblea","Chupetin","Bombon");
		List<String> res1 = Arrays.asList("Oblea","Chupetin");
		
		Assertions.assertEquals("Alfajor", Mariano.golosinaMasCara());
		Assertions.assertEquals(res1, Mariano.golosinasFaltantes(miLista));
	}
	
	@Test
	void gasto() {
		Assertions.assertEquals(5, Mariano.gastoEn("frutilla"));
	}
}
