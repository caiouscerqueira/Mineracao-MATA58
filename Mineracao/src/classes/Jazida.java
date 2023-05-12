package classes;

import java.util.concurrent.Semaphore;

public class Jazida {
  private int minerioDisponivel;
  public int getMinerioDisponivel() {
	return minerioDisponivel;
}

public void setMinerioDisponivel(int minerioDisponivel) {
	this.minerioDisponivel = minerioDisponivel;
}

public Semaphore getSemaforo() {
	return semaforo;
}

public void setSemaforo(Semaphore semaforo) {
	this.semaforo = semaforo;
}

private Semaphore semaforo;
  
  public Jazida(int qtdMinerio) {
    this.minerioDisponivel = qtdMinerio;
    this.semaforo = new Semaphore(1, true);
  }
  
  public int minerar(int qtd) {
    int minerioMinerado = 0;
    
    try {
      semaforo.acquire();
      if(this.minerioDisponivel >= qtd) {
        this.minerioDisponivel -= qtd;
        minerioMinerado = qtd;
      }
    } catch (InterruptedException ex) {
     System.out.println(ex);
    } finally {
      semaforo.release();
    }
    
    return minerioMinerado;
  }
}