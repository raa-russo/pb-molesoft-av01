package Acesso;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		
		String login;
		String senha;
		String LoginSistema = "admin";
		String SenhaSistema = "123";
		
		
		Date hora = Calendar.getInstance().getTime();
		SimpleDateFormat formatarHora = new SimpleDateFormat("HH");
		int horario = Integer.parseInt(formatarHora.format(hora));
		
		
		String[] mensagem = new String[5];
		mensagem[0] = "Bom dia, voc� se logou ao nosso sistema.";
		mensagem[1] = "Boa tarde, voc� se logou ao nosso sistema.";
		mensagem[2] = "Boa noite, voc� se logou ao nosso sistema.";
		mensagem[3] = "Boa madrugada, voc� se logou ao nosso sistema.";
		mensagem[4] = "Usu�rio e/ou senha incorretos.";
				
				
		Scanner leitura;        
		leitura = new Scanner(System.in);
		
		
		System.out.println("Digite seu login:");
		login = leitura.next();
		
		
		System.out.println("Digite sua senha:");
		senha = leitura.next();

		
		if(login.equals(LoginSistema) && senha.equals(SenhaSistema)) {
			if(horario >= 6 && horario < 12)
				System.out.println(mensagem[0]);
			if(horario >= 12 && horario < 18)
				System.out.println(mensagem[1]);
			if(horario >= 18 && horario < 24)
				System.out.println(mensagem[2]);
			if(horario >= 0 && horario < 6)
				System.out.println(mensagem[3]);			
			
		}else
			System.out.println(mensagem[4]);
	}

}
