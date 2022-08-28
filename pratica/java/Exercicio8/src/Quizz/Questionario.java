package Quizz;

import java.util.Scanner;

public class Questionario {

	public static void main(String[] args) {
		
		String nome;		
		Scanner leitura;  
		int acertos = 0;
		int erros = 0;
		
		leitura = new Scanner(System.in);
		System.out.println("Qual o seu nome:");		
		nome = leitura.nextLine();
		
		System.out.println("Escolha a opção correta: [1] [2] [3]:");
		Perguntas perguntas = new Perguntas();
		perguntas.perguntar();
		System.out.println("\nJogador: " + nome);
		System.out.println("Acertos: " + perguntas.getAcertou());
		System.out.println("Errou: " + perguntas.getErrou());
	}

}
