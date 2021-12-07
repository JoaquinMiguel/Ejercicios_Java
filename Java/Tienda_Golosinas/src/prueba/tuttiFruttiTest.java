package prueba;

//import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import golosinas.TuttiFrutti;


class tuttiFruttiTest {

	@Test
	void test() {
		TuttiFrutti tuttiFrutti = new TuttiFrutti();
		
		tuttiFrutti.mordisco(); // de frutilla a chocolate
		Assertions.assertEquals("chocolate", tuttiFrutti.sabor); 
		
		tuttiFrutti.mordisco(); // de chocolate a naranja
		Assertions.assertEquals("naranja", tuttiFrutti.sabor); 
	}

}
