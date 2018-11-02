import java.util.Scanner;
import java.util.Random;

public class JogoContraMaquina {
	
	
	
	public static void jogar()
	{
		
		
		Jogo jogo = new Jogo();
		Scanner ler = new Scanner(System.in);
		Scanner ler1 = new Scanner(System.in);
		Random random = new Random();
		int linha;
		int coluna;
		

		int repetir=1;
		int numero; 
		String nome;
		

		System.out.println();
		System.out.println("digite seu nome desafiante: ");
		nome = ler.nextLine();
		
		
		
		Jogador jogador1 = new Jogador(nome, "X");
		Jogador jogador2 = new Jogador("MAQUINA DO MAL", "O");
		jogador1.adicionarObservadores(jogo);
		jogador2.adicionarObservadores(jogo);
	
		
		System.out.println(" "+jogador1.getNome()+ " Seu simbolo será: "+jogador1.getSimbolo());
		System.out.println("O simbolo da maquina será: "+jogador2.getSimbolo());
		
		System.out.println();
		
		
		 jogo.jogar();
		
		do {
			
		
			 
			 if(repetir%2==1)
			 {
				 System.out.printf("\n\n");
				 System.out.println("Escolha um número " + jogador1.getNome() + ":");
				 numero = ler1.nextInt();
				 
				 if(numero==1)
				 {
					 if(jogo.jogada(jogador1, 0, 0) == false)
						 continue;
	
				 }
				 else if(numero==2)
				 {
					 
					 if(jogo.jogada(jogador1, 0, 1)== false)
						 continue;
					 
				 }
				 else if(numero==3)
				 {
					 if(jogo.jogada(jogador1, 0, 2)==false)
						 continue;
					
				 }
				 else if(numero==4)
				 {
					 if(jogo.jogada(jogador1, 1, 0)==false)
						 continue;
				 }
				 else if(numero==5)
				 {
					 if(jogo.jogada(jogador1, 1, 1)==false)
						 continue;
					
				 }
				 else if(numero==6)
				 {
					 if(jogo.jogada(jogador1, 1, 2)==false)
						 continue;
					
				 }
				 else if(numero==7)
				 {
					 if(jogo.jogada(jogador1, 2, 0)==false)
						 continue;
					
				 }
				 else if(numero==8)
				 {
					 if(jogo.jogada(jogador1, 2, 1)==false)
						 continue;
					
				 }
				 else if(numero==9)
				 {
					 if(jogo.jogada(jogador1, 2, 2)==false)
						 continue;
					
				 }
				 else
				 {
					 System.out.println("Opção inválida, digite outro número!");
					 continue;
					 
				 }
				 
			
				 
				 System.out.println();
				 System.out.println();
				 System.out.println();
				 jogador1.notificacao();
				 if(jogo.VerificarVitoria(jogador1.getSimbolo()) == true)
				 {
				 System.out.println();
				 System.out.println();
				 System.out.println();
				 jogo.MensagemVitoria(jogador1);
				 break;
				 }
			 }
			 else
			 {
				 
				 linha = random.nextInt(3);
				 coluna = random.nextInt(3);
				 
				 if(jogo.jogada(jogador2, linha, coluna)==false)
					 continue;
				 
				
				 
				 System.out.println();
				 System.out.println();
				 System.out.println();
				 jogador2.notificacao();
				 if(jogo.VerificarVitoria(jogador2.getSimbolo()) == true)
				 {
				 System.out.println();
			     System.out.println();
				 System.out.println();
				 jogo.MensagemVitoria(jogador2);
				 break;
				 }
				 
				 
				 
			 }
			 
			
			 repetir++;
			
		}
		while(repetir<10);
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		if(repetir>9)
		jogo.empate();
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		
		
		
	}


}
