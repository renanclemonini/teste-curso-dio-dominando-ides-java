package com.dio;

import com.dio.model.Gato;

public class PrimeiroPrograma {

	
	public static void main(String[] args) {
		/*int a = 2;
		int b = 39;
		System.out.println("Soma entre A = "+a+" e B = "+b+" igual a: "+(a+b));*/
		
		Gato gato = new Gato();
		Livros livro = new Livros();
		
		System.out.println(gato);
		System.out.println(livro);
		
	}

}

class Livros {
	private String nome;
	private String autor;
}
