package pkg;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class CalculadoraComplejaTest extends CalculadoraCompleja {

	@Test
	void testTotalDscto() {
         
		CalculadoraCompleja cc = new CalculadoraCompleja();
	        assertEquals(4300, cc.totalDscto(Arrays.asList(30000)));
	    }	
}
