import java.util.Scanner;

public class JogoEmDupla {
	

	public static void jogar()
	{
		
		
		Jogo jogo = new Jogo();
		Scanner ler = new Scanner(System.in);
		Scanner ler1 = new Scanner(System.in);

		int repetir=1;
		int numero;
		String nome1;
		String nome2;

		System.out.println();
		System.out.println("Jogador 1 digite seu nome: ");
		nome1 = ler.nextLine();
		
		System.out.println();
		System.out.println("Jogador 2 digite seu nome: ");
		nome2 = ler.nextLine();
		
		Jogador jogador1 = new Jogador(nome1, "X");
		Jogador jogador2 = new Jogador(nome2, "O");
		
		System.out.println(" "+jogador1.getNome()+ " Seu simbolo ser�: "+jogador1.getSimbolo());
		System.out.println(" "+jogador2.getNome()+ " Seu simbolo ser�: "+jogador2.getSimbolo());
		
		System.out.println();
		
		
		 jogo.jogar();
		
		do {
			
		
			 
			 if(repetir%2==1)
			 {
				 System.out.println("Escolha um numero: ");
				 numero = ler1.nextInt();
				 
				 if(numero==1)
				 {
					 jogo.jogada(jogador1, 0, 0);
					 
				 }
				 else if(numero==2)
				 {
					 jogo.jogada(jogador1, 0, 1);
				 }
				 else if(numero==3)
				 {
					 jogo.jogada(jogador1, 0, 2);
				 }
				 else if(numero==4)
				 {
					 jogo.jogada(jogador1, 1, 0);
				 }
				 else if(numero==5)
				 {
					 jogo.jogada(jogador1, 1, 1);
				 }
				 else if(numero==6)
				 {
					 jogo.jogada(jogador1, 1, 2);
				 }
				 else if(numero==7)
				 {
					 jogo.jogada(jogador1, 2, 0);
				 }
				 else if(numero==8)
				 {
					 jogo.jogada(jogador1, 2, 1);
				 }
				 else if(numero==9)
				 {
					 jogo.jogada(jogador1, 2, 2);
				 }
				 else
				 {
					 System.out.println("op��o invalida, perdeu a vez!!");
				 }
				 
				 
				 System.out.println();
				 System.out.println();
				 System.out.println();
				 jogo.exibirTabela();
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
				 
				 System.out.println("Escolha um numero: ");
				 numero = ler1.nextInt();
				 
				 if(numero==1)
				 {
					 jogo.jogada(jogador2, 0, 0);
					 
				 }
				 else if(numero==2)
				 {
					 jogo.jogada(jogador2, 0, 1);
				 }
				 else if(numero==3)
				 {
					 jogo.jogada(jogador2, 0, 2);
				 }
				 else if(numero==4)
				 {
					 jogo.jogada(jogador2, 1, 0);
				 }
				 else if(numero==5)
				 {
					 jogo.jogada(jogador2, 1, 1);
				 }
				 else if(numero==6)
				 {
					 jogo.jogada(jogador2, 1, 2);
				 }
				 else if(numero==7)
				 {
					 jogo.jogada(jogador2, 2, 0);
				 }
				 else if(numero==8)
				 {
					 jogo.jogada(jogador2, 2, 1);
				 }
				 else if(numero==9)
				 {
					 jogo.jogada(jogador2, 2, 2);
				 }
				 else
				 {
					 System.out.println("op��o invalida, perdeu a vez!!");
				 }
				 
				 System.out.println();
				 System.out.println();
				 System.out.println();
				 jogo.exibirTabela();
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
		if(repetir>=9)
		jogo.empate();
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		
		
		
	}

}
