package pkg;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class CalculadoraSimpleTest extends CalculadoraSimple {

	@Test
	void testTotalDscto() {
         
	        CalculadoraSimple cs = new CalculadoraSimple();
	        assertEquals(10, cs.totalDscto(Arrays.asList(100)));
	    }	
}
