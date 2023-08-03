package LacosRepeticao;
// Escreva um algoritmo em Java, que leia 2 números inteiros via teclado, onde o 
// primeiro número deve ser menor do que o segundo número. Caso contrário, deve ser
//exibida uma mensagem na tela informando que o intervalo é inválido e sair do programa.
// Dentro do intervalo informado, mostre na tela todes os números que são múltiplos de 3 e 5.

import java.util.Scanner;

public class For1 {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);

		System.out.print("Digite o primeiro número inteiro (menor): ");
        int primeiroNumero = leia.nextInt();

        System.out.print("Digite o segundo número inteiro (maior): ");
        int segundoNumero = leia.nextInt();
		
        if (primeiroNumero >= segundoNumero) {
            System.out.println("Intervalo inválido. O primeiro número deve ser menor que o segundo.");
            System.exit(0); 
        }

        System.out.println("Números múltiplos de 3 e 5 no intervalo:");
        for (int i = primeiroNumero; i <= segundoNumero; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
	}

}
