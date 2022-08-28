package Corpora��o;

public class Funcionario {
	
	private String nome;
	private double salario = 0;
	private double salarioLiquido = 0;
	
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public void Dados() {
		System.out.println("Funcionário " + this.nome + "\n" + "Salário: " + this.salario);
		if(salario <2000) {
			this.salarioLiquido = salario + Bonificação(salario);
			System.out.println("B�nus: " + Bonificação(salario));
		}else {
			this.salarioLiquido = salario + Desconto(salario);
			System.out.println("Desconto: " + Desconto(salario));
		}		
			System.out.println("Sal�rio Liquido: " + this.salarioLiquido + "\n");
	}
	
	private double Bonificação(double salario) {
		if(salario <= 1000)
			return salario*20/100;
		else
			return  salario*10/100;
		
	}
	
	private double Desconto(double salario) {
		return salario*10/100;
	}
}
