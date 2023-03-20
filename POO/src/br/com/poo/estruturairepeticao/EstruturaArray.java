package br.com.poo.estruturairepeticao;

public class EstruturaArray {
	
	public static void main (String[] args) {
		
		String[] cidades = {"Leme","Campinas","Atibaia","Vinhedo"};
		
		System.out.println(cidades[1]);
		
		for(int i = 0 ; i <= cidades.length -1 ; i++) {
			System.out.println(cidades[i]);
		}
		
		System.out.println(cidades.length);
	}
}
