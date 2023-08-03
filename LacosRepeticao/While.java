package LacosRepeticao;
//Escreva um algoritmo em Java, que leia a idade de várias pessoas (números inteiros)
//via teclado e mostre na tela o total de pessoas cuja idade seja menor que 21 anos 
//e o total de pessoas cuja idade seja maior que 50 anos. A leitura dos dados deve 
//ser finalizada ao digitar uma idade negativa

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
	   
		Scanner leia = new Scanner(System.in);
        int idade;
        int countMenorQue21 = 0;
        int countMaiorQue50 = 0;

        System.out.println("Digite as idades das pessoas (ou uma idade negativa para sair):");

        idade = leia.nextInt();
        while (idade >= 0) {
            if (idade < 21) {
                countMenorQue21++;
            } else if (idade > 50) {
                countMaiorQue50++;
            }

            idade = leia.nextInt();
        }

        System.out.println("Total de pessoas com menos de 21 anos: " + countMenorQue21);
        System.out.println("Total de pessoas com mais de 50 anos: " + countMaiorQue50);
		
		

	}

}
