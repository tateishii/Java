package br.com.poo.estruturairepeticao;

public class EstruturaArray2 {

	public static void main(String[] args) {
		
		int[] numeros = {45,65,76,86,57,31,89,78,90,34,32,67};
		
		for(int i = 0 ; i < numeros.length ; i++) {
			if(i % 2 == 0) {
				System.out.println(numeros[i]);
			}
		}
		

	}

}
