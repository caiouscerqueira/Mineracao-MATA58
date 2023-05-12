package classes;

public class Jogador {
	  private String nome;
	  private int minerioMinerado;
	  
	  public Jogador(String nome) {
	    this.nome = nome;
	    this.minerioMinerado = 0;
	  }
	  
	  public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMinerioMinerado() {
		return minerioMinerado;
	}

	public void setMinerioMinerado(int minerioMinerado) {
		this.minerioMinerado = minerioMinerado;
	}

	public void minerarNaJazida(Jazida jazida, int qtd) {
	    int minerioMinerado = jazida.minerar(qtd);
	    
	    if (minerioMinerado > 0) {
	      this.minerioMinerado += minerioMinerado;
	    } else {
	      System.out.println("Jogador " + this.nome + " perdeu a vez.");
	    }
	  }
	}
