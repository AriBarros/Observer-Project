
public class Jogo {
	
String [][] matriz = new String [3][3];
int quantidadeDeJogadas = 0;



	public void jogar ()
	{
		int k = 1 ;
		
		 for(int i = 0; i<3;i++)
		 {
			 for(int j=0;j<3;j++)
			 { 
				 
				 matriz[i][j] = Integer.toString(k) ;
				 k++;
			 }
			 
			 
		 }
		 
		 exibirTabela();	 
		 
	}
	
	public void exibirTabela()
	{
		 System.out.println();
		 System.out.println();
		 System.out.printf("\t\t %s %s %s %s %s \n",matriz[0][0],"║",matriz[0][1],"║",matriz[0][2]);
		 System.out.printf("\t\t%s%s%s%s%s%s%s%s%s%s%s \n","═","═","═","╬","═","═","═","╬","═","═","═");
		 System.out.printf("\t\t %s %s %s %s %s \n",matriz[1][0],"║",matriz[1][1],"║",matriz[1][2]);
		 System.out.printf("\t\t%s%s%s%s%s%s%s%s%s%s%s \n","═","═","═","╬","═","═","═","╬","═","═","═");
		 System.out.printf("\t\t %s %s %s %s %s \n",matriz[2][0],"║",matriz[2][1],"║",matriz[2][2]);
	}
	
	public boolean VerificarVitoria(String simbolo)
	{

		
		return(matriz[0][0]== simbolo && matriz[0][1]== simbolo  && matriz[0][2]== simbolo) ||
        (matriz[1][0]== simbolo && matriz[1][1]== simbolo  && matriz[1][2]== simbolo) ||
        (matriz[2][0]== simbolo && matriz[2][1]== simbolo  && matriz[2][2]== simbolo) ||
        (matriz[0][0]== simbolo && matriz[1][0]== simbolo  && matriz[2][0]== simbolo) ||
        (matriz[0][1]== simbolo && matriz[1][1]== simbolo  && matriz[2][1]== simbolo) ||
        (matriz[0][2]== simbolo && matriz[1][2]== simbolo  && matriz[2][2]== simbolo) ||
        (matriz[0][0]== simbolo && matriz[1][1]== simbolo  && matriz[2][2]== simbolo) ||
        (matriz[0][2]== simbolo && matriz[1][1]== simbolo  && matriz[2][0]== simbolo); 
		
			
			
		
		
	}
	
	public void jogada ( Jogador jogador,int linha,int coluna)
	{
	
			matriz[linha][coluna] = jogador.getSimbolo();	
	}

	public void empate() {

		
		System.out.println("Deu velha!!");
		System.out.println("Boa sorte na proxima ^^");
		
	}
	
	public void MensagemVitoria(Jogador jogador)
	{
		System.out.println("Parabens "+jogador.getNome());
		System.out.println("Você venceu!!");
		
	}
	
	

}
