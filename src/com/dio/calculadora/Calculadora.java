package com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double a, b;
		
		System.out.print("Digite um numero: ");
		a = scan.nextDouble();
		System.out.print("Digite outro numero: ");
		b = scan.nextDouble();
		
		double soma = soma(a,b);
		double subtrair = subtrair(a, b);
		double multiplicar = multiplicar(a, b);
		double dividir = dividir(a, b);
		
		System.out.println(a+" + "+b+" = "+soma);
		System.out.println(a+" - "+b+" = "+subtrair);
		System.out.println(a+" * "+b+" = "+multiplicar);
		System.out.println(a+"/ "+b+" = "+dividir);
		
		
		
	}
	
	public static double soma(double a, double b) {
		return a + b;
	}
	
	public static double subtrair(double a, double b) {
		return a - b;5
	}
	
	public static double dividir(double a, double b) {
		return a / b;
	}
	
	public static double multiplicar(double a, double b) {
		return a * b;
	}
	
	

}
