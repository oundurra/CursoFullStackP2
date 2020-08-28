package pkg;

import java.util.ArrayList;
import java.util.List;

public class DemoConsola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculadoraSimple cs;
		CalculadoraCompleja cc;
		List<Integer> productos;
		
		productos = new ArrayList<>();
		cs = new CalculadoraSimple();
		cc = new CalculadoraCompleja();

		for (int i = 0; i < 5; i++) {
			productos.add((int) Math.floor(Math.random()*10000+1000));
		}
		
		System.out.println("--------------------------------------");
		System.out.println("Demostración Calculadora de Descuentos");
		System.out.println("--------------------------------------");
		System.out.println("");
		System.out.println("Tomando 5 precios aleatorios...");
		System.out.println(productos);
		System.out.println("");
		System.out.println("Descuento con Algoritmo Simple: " + cs.totalDscto(productos).toString());
		System.out.println("Descuento con Algoritmo Complejo: " + cc.totalDscto(productos).toString());


		
	}

}
