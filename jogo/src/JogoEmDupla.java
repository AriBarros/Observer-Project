import java.util.Scanner;

public class JogoEmDupla {
	

	public static void jogar()
	{
		
		
		Jogo jogo = new Jogo();
		Scanner ler = new Scanner(System.in);
		Scanner ler1 = new Scanner(System.in);

		int repetir=1;
		int numero;
		int one, two, three, four, five, six, seven, eight, nine;
		int um, dois, tres, quatro, cinco, seis, sete, oito, nove; 
		String nome1;
		String nome2;
		
		one =0;
		two = 0;
		three = 0;
		four = 0; 
		five = 0;
		six = 0;
		seven = 0;
		eight = 0;
		nine = 0;
		
		um = 0;
		dois = 0;
		tres = 0;
		quatro = 0;
		cinco = 0;
		seis = 0;
		sete = 0;
		oito = 0;
		nove = 0;

		System.out.println();
		System.out.println("Jogador 1 digite seu nome: ");
		nome1 = ler.nextLine();
		
		System.out.println();
		System.out.println("Jogador 2 digite seu nome: ");
		nome2 = ler.nextLine();
		
		Jogador jogador1 = new Jogador(nome1, "X");
		Jogador jogador2 = new Jogador(nome2, "O");
		
		System.out.println(" "+jogador1.getNome()+ " Seu simbolo será: "+jogador1.getSimbolo());
		System.out.println(" "+jogador2.getNome()+ " Seu simbolo será: "+jogador2.getSimbolo());
		
		System.out.println();
		
		
		 jogo.jogar();
		
		do {
			
		
			 
			 if(repetir%2==1)
			 {
				 System.out.println("Escolha um número " + jogador1.getNome() + ":");
				 numero = ler1.nextInt();
				 
				 if(numero==1 && one != 1 && um !=1)
				 {
					 jogo.jogada(jogador1, 0, 0);
					 um = 1;
					
				 }
				 else if(numero==2 && two != 1  && dois !=1)
				 {
					 jogo.jogada(jogador1, 0, 1);
					 dois = 1;
				 }
				 else if(numero==3 && three != 1  && tres !=1)
				 {
					 jogo.jogada(jogador1, 0, 2);
					 tres = 1;
				 }
				 else if(numero==4 && four != 1  && quatro !=1)
				 {
					 jogo.jogada(jogador1, 1, 0);
					 quatro = 1;
				 }
				 else if(numero==5 && five != 1  && cinco !=1)
				 {
					 jogo.jogada(jogador1, 1, 1);
					 cinco = 1;
				 }
				 else if(numero==6 && six != 1  && seis !=1)
				 {
					 jogo.jogada(jogador1, 1, 2);
					 seis = 1;
				 }
				 else if(numero==7 && seven != 1  && sete !=1)
				 {
					 jogo.jogada(jogador1, 2, 0);
					 sete = 1;
				 }
				 else if(numero==8 && eight != 1  && oito !=1)
				 {
					 jogo.jogada(jogador1, 2, 1);
					 oito = 1;
				 }
				 else if(numero==9 && nine != 1  && nove !=1)
				 {
					 jogo.jogada(jogador1, 2, 2);
					 nove = 1;
				 }
				 else
				 {
					 System.out.println("Opção inválida, digite outro número!");
					 repetir--;
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
				 
				 System.out.println("Escolha um número " + jogador2.getNome() + ":");
				 numero = ler1.nextInt();
				 
				 if(numero==1 && um!=1 && one !=1)
				 {
					 jogo.jogada(jogador2, 0, 0);
					 one = 1;
				 }
				 else if(numero==2 && dois!=1 && two !=1)
				 {
					 jogo.jogada(jogador2, 0, 1);
					 two = 1;
				 }
				 else if(numero==3 && tres!=1 && three !=1)
				 {
					 jogo.jogada(jogador2, 0, 2);
					 three = 1;
				 }
				 else if(numero==4 && quatro!=1 && four !=1)
				 {
					 jogo.jogada(jogador2, 1, 0);
					 four = 1;
				 }
				 else if(numero==5 && cinco!=1 && five !=1)
				 {
					 jogo.jogada(jogador2, 1, 1);
					 five = 1;
				 }
				 else if(numero==6 && seis!=1 && six !=1)
				 {
					 jogo.jogada(jogador2, 1, 2);
					 six = 1;
				 }
				 else if(numero==7 && sete!=1 && seven !=1)
				 {
					 jogo.jogada(jogador2, 2, 0);
					 seven = 1;
				 }
				 else if(numero==8 && oito!=1 && eight !=1)
				 {
					 jogo.jogada(jogador2, 2, 1);
					 eight = 1;
				 }
				 else if(numero==9 && nove!=1 && nine !=1)
				 {
					 jogo.jogada(jogador2, 2, 2);
					 nine = 1;
				 }
				 else
				 {
					 System.out.println("Opção inválida, digite outro número!");
					 repetir--;
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
