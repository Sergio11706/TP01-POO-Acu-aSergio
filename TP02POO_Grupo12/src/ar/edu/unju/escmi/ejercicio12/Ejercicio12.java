package ar.edu.unju.escmi.ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for(byte i=0;i<5;i++) {
			
			byte edad=0;
			
			System.out.print("Ingrese su edad: ");
			edad = sc.nextByte();
			
			if(edad>=1 && edad<=12) {
				System.out.println("Es un niño");
				continue;
			}
			if(edad>=13 && edad<=20) {
				System.out.println("Es un joven");
				continue;
			}
			if(edad>=21 && edad<=100) {
				System.out.println("Es un adulto");
				continue;
			}
			
			System.out.println("Edad no permitida");
			
		}
		
		sc.close();
		
	}

}
