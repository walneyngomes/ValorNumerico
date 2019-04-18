package PooU;

import java.util.Scanner;

public class MainAppProgram {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double raio = teclado.nextDouble();
		// valor na circuferencia do circulo
		System.out.print(Circulo.calculoCircuferencia(raio));
		// valor do volume da esfera
		System.out.print(Esfera.calcularVolume(2.3, raio));
		teclado.close();
	}

}
