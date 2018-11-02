import java.util.Random;
import java.util.Scanner;

public class JogoMaquinaXMaquina {
	
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
		

		System.out.println();
		
		Jogador jogador1 = new Jogador("MAQUINA MORTIFERA", "X");
		Jogador jogador2 = new Jogador("MAQUINA DO MAL", "O");
		jogador1.adicionarObservadores(jogo);
		jogador2.adicionarObservadores(jogo);
	
		
		System.out.println();
		
		
		 jogo.jogar();
		
		do {
			
		
			 
			 if(repetir%2==1)
			 {
				 
				 
				 
				 linha = random.nextInt(3);
				 coluna = random.nextInt(3);
				 
				 if(jogo.jogada(jogador1, linha, coluna)==false)
					 continue;
				 
			
				 
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
