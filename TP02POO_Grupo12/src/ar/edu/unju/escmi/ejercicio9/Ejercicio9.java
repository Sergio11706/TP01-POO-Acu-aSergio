package ar.edu.unju.escmi.ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		int anio;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese un año: ");
		anio = sc.nextShort();
		
		if(anio%4 == 0 && anio%100 != 0) System.out.println("El año "+anio+" es bisiesto");
		else System.out.println("El año "+anio+" NO es bisiesto");
		
		sc.close();
	}

}
