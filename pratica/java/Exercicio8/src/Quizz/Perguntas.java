package Quizz;

import java.util.Scanner;

public class Perguntas{
	
	private int escolha;
	private int acertou = 0;
	private int errou = 0;
	private String[] perguntas = new String[10];
	private Alternativas alternativas = new Alternativas();
	Respostas respostas = new Respostas();
	
	Scanner leitura = new Scanner(System.in);
	
	{
	perguntas[0] = "O que é hardware?";
	perguntas[1] = "O que é software?";
	perguntas[2] = "São exemplos de sistemas operacionais:";
	perguntas[3] = "Podemos definir informática, como:";
	perguntas[4] = "O que são periféricos de entrada?";
	perguntas[5] = "Quantos bytes tem um 'char'?";
	perguntas[6] = "Site exemplos de periféricos de saida:";
	perguntas[7] = "Componentes presente num gabinete:";
	perguntas[8] = "O que é Navegador?";
	perguntas[9] = "Qual das alternativas todos os componentes são tangíveis??";
	}

	
	public int getAcertou() {
		return acertou;
	}


	public int getErrou() {
		return errou;
	}

		
	public void perguntar() {
		for(int i = 0; i< perguntas.length ; i++) {
			System.out.println();
			System.out.println(perguntas[i]);
			System.out.println(alternativas.alternativa[i]);
			escolha = leitura.nextInt();
			if(respostas.resposta[i].equals(escolha)) {
				acertou++;
			}else
				errou++;			
			
		}
	}
	
}