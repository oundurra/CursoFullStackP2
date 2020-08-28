package pkg;

import java.util.List;

public class CalculadoraSimple implements CalculadoraDescuentos {
	public Integer totalDscto(List<Integer> pIn) {
		Integer totalprecios = 0;
		
		for (Integer precio : pIn) {
			totalprecios = totalprecios + (int)(precio);
		}
		
		return (int) (totalprecios*0.1);
	};
}
