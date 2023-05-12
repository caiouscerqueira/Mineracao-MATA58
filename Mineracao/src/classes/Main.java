package classes;

import java.util.ArrayList;

public class Main {
	  public static void main(String[] args) {
	    ArrayList<Jazida> jazidas = new ArrayList();
	    jazidas.add(new Jazida(30));
	    jazidas.add(new Jazida(20));
	    jazidas.add(new Jazida(15));
	    jazidas.add(new Jazida(25));

	    ArrayList<Jogador> jogadores = new ArrayList();
	    jogadores.add(new Jogador("Jogador 1"));
	    jogadores.add(new Jogador("Jogador 2"));
	    jogadores.add(new Jogador("Jogador 3"));
	    jogadores.add(new Jogador("Jogador 4"));
	    jogadores.add(new Jogador("Jogador 5"));

	    Jogo jogo = new Jogo(jazidas, jogadores);
	    jogo.jogar();

	    for (Jogador jogador : jogo.getJogadores()) {
	      System.out.println(jogador.getNome() + " minerou " + jogador.getMinerioMinerado() + "     unidades de minério.");
	    }
	  }
	}
