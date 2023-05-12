package classes;

import java.util.ArrayList;
import java.util.Random;

public class Jogo {
	  private ArrayList<Jazida> jazidas;
	  private ArrayList<Jogador> jogadores;

	  public Jogo(ArrayList<Jazida> jazidas, ArrayList<Jogador> jogadores) {
	    this.jazidas = jazidas;
	    this.jogadores = jogadores;
	  }

	  public void jogar() {
	    while (jazidas.size() > 0) {
	      for (Jogador jogador : jogadores) {
	        int jazidaEscolhida = (int) (Math.random() * jazidas.size());
	        Jazida jazida = jazidas.get(jazidaEscolhida);
	        int qtdMinerio = (int) (new Random().nextInt(100) + 1);
	        jogador.minerarNaJazida(jazida, qtdMinerio);

	        if (jazida.getMinerioDisponivel() == 0) {
	          jazidas.remove(jazida);
	        }
	        if (jazidas.size() == 0) {
	          break;
	        }
	      }
	    }
	  }

	  public ArrayList<Jogador> getJogadores() {
	    return jogadores;
	  }
	}