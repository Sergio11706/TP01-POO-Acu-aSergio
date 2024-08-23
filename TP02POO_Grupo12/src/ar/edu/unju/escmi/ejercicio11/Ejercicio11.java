package ar.edu.unju.escmi.ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {
	
	public static void main(String[] args) {
		
		byte i=5;
		Scanner sc = new Scanner(System.in);
		
		while(i>0) {
			
			int n;
			
			System.out.print("Ingrese un numero entero: ");
			n = sc.nextInt();
			
			if(n%2 == 0) System.out.println("El numero "+n+" es PAR");
			else System.out.println("El numero "+n+" es IMPAR");
			
			i--;
		}
		
		sc.close();
		
	}
	
}
