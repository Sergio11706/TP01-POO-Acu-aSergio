package ar.edu.unju.escmi.ejercicio10;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		int a=7, b=5, c=-14;
		boolean band=false;
		
		band = a>3;
		System.out.println("a) a>3 : "+band);
		
		band = a>c;
		System.out.println("b) a>c : "+band);
		
		band = a<c;
		System.out.println("c) a<c : "+band);
		
		band = b<c;
		System.out.println("d) b<c : "+band);
		
		band = b!=c;
		System.out.println("e) b!=c : "+band);
		
		band = a==3;
		System.out.println("f) a==3 : "+band);
		
		band = a*b == 15;
		System.out.println("g) a*b == 15 : "+band);
		
		band = a*b == -30;
		System.out.println("h) a*b == -30 : "+band);
		
		band = c/b < a;
		System.out.println("i) c/b < a : "+band);
		
		band = c/b == -10;
		System.out.println("j) c/b == -10 : "+band);
		
		band = c/b == -4;
		System.out.println("k) c/b == -4 : "+band);
		
		band = a+b+c == 5;
		System.out.println("l) a+b+c == 5 : "+band);
		
		band = (a+b == 8) && (a-b == 2);
		System.out.println("m) (a+b == 8) && (a-b == 2) : "+band);
		
		band = (a+b == 8) || (a-b == 6);
		System.out.println("n) (a+b == 8) || (a-b == 6) : "+band);
		
		band = a>3 && b>3 && c<3;
		System.out.println("o) a>3 && b>3 && c<3 : "+band);
		
		band = a>3 && b>=3 && c<-3;
		System.out.println("p) a>3 && b>=3 && c<-3 : "+band);
	}

}
