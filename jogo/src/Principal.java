import java.util.Scanner;

public class Principal {
	
	
	
	 public static void main(String[] args) {

		 
		
		Scanner ler = new Scanner(System.in);
		int repetir = 1;
		int opcao;
		
		
		System.out.println("Bem Vindo ao Jogo da velha feito pela equipe ADE!!");
		
		do
		{
			
			
			System.out.println();
			System.out.println();
			System.out.println("Escolha uma opção: ");
			System.out.println("1 - Jogar contra um amigo");
			System.out.println("2 - Jogar contra a maquina");
			System.out.println("3 - ver uma partida maquina contra maquina");
			System.out.println("4 - Sair");
			
			System.out.println("Digite a opção correspondente: ");
			opcao = ler.nextInt();
			
			
			if(opcao == 1)
			{
				JogoEmDupla.jogar();
			}
			else if(opcao == 2)
			{
				JogoContraMaquina.jogar();
			}
			else if(opcao==3)
			{
				JogoMaquinaXMaquina.jogar();
				
			}
			else if(opcao==4)
			{
				repetir=0;
			}
			else 
			{
				System.out.println("Opção invalida!!");
			}
			
			System.out.println("Deseja jogar novamente?? (1 = sim / 0 = não)");
			repetir=ler.nextInt();
			
					
			
		}
		while(repetir==1);
		
	} 
	 


}
