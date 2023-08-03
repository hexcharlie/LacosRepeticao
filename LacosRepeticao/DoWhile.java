package LacosRepeticao;
// Escreva um algoritmo em Java, que leia números inteiros via teclado,
// até que o número zero seja digitado.Ao final, mostre na tela a soma de todos
// os números digitados, que sejam positivos.
import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		
		  Scanner leia = new Scanner(System.in);
	        int numero;
	        int somaPositivos = 0;

	        System.out.println("Digite números inteiros (digite 0 para sair):");

	        do {
	            numero = leia.nextInt();

	            if (numero > 0) {
	                somaPositivos += numero;
	            }
	        } while (numero != 0);

	        System.out.println("A soma dos números positivos digitados é: " + somaPositivos);

	}

}
