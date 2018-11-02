import java.util.ArrayList;
import java.util.List;

public class Jogador {
	
	public List<Observer> observadores = new ArrayList<>();
	
	private String nome;
	private String simbolo;
	
	
	public Jogador(String nome, String simbolo) {
		super();
		this.nome = nome;
		this.simbolo = simbolo;
	}
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSimbolo() {
		return simbolo;
	}
	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}
	
	public void notificacao()
	{
		notificarObservadores();
	}

	public void adicionarObservadores(Observer observer)
	{
		this.observadores.add(observer);
	}

	private void notificarObservadores() {
		
		for (Observer observer : observadores) {
			observer.atualizarDados();
		}
		
	}
	

}
