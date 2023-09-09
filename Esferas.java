package Actividad2;

import java.util.Scanner;
public class Esferas {
	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		int d;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese peso de esfera A:");
		a = entrada.nextInt();
		
		Scanner entrada1 = new Scanner(System.in);
		System.out.println("Ingrese peso de esfera B:");
		b = entrada1.nextInt();
		
		Scanner entrada2 = new Scanner(System.in);
		System.out.println("Ingrese peso de esfera C:");
		c = entrada2.nextInt();
		
		Scanner entrada3 = new Scanner(System.in);
		System.out.println("Ingrese peso de esfera D:");
		d = entrada3.nextInt();
		
		if(a==b&&a==c) {
			if(d<a) {
				System.out.println("La esfera d es la diferente y es de menor peso");
			}
			else {
				System.out.println("La esfera d es la diferente y es de mayor peso");
			}
		}
		else if(a==b&&a==d) {
			if(c<a) {
				System.out.println("La esfera c es la diferente y es de menor peso");
			}
			else {
				System.out.println("La esfera c es la diferente y es de mayor peso");
			}
		}
		else if(a==c&&a==d) {
			if(b<a) {
				System.out.println("La esfera b es la diferente y es de menor peso");
			}
			else {
				System.out.println("La esfera b es la diferente y es de mayor peso");
			}
		}
		else {
			if(a<b) {
				System.out.println("La esfera a es la diferente y es de menor peso");
			}
			else {
				System.out.println("La esfera a es la diferente y es de mayor peso");
			}
		}
		entrada.close();
		entrada1.close();
		entrada2.close();
		entrada3.close();
	}
}
