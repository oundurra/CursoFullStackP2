package pkg;

import java.util.List;

public class CalculadoraCompleja implements CalculadoraDescuentos {
	public Integer totalDscto(List<Integer> pIn) {
		Integer totalprecios = 0;
		Integer totaldescuento = 0;

		
		//Calcula la suma
		for (Integer precio : pIn) {
			totalprecios = totalprecios + (int)(precio);
		}
		
		//Realiza el descuento
		for (Integer precio : pIn) {
			if (precio <= 3500) {
				totaldescuento = totaldescuento + (int)(precio*0.05);
			} else {
				if(precio > 5000) {
					if(totalprecios > 20000) {
						totaldescuento = totaldescuento + (int)(precio*0.15);
					} else { 
						totaldescuento = totaldescuento + (int)(precio*0.1);
					}
				}
			}
		}
		
		return totaldescuento;
	}
}
