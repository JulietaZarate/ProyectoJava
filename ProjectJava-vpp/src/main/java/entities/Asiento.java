package entities;

public class Asiento {
	
	int fila;
	int numAsiento;
	
	public Asiento(int fila, int numAsiento) {
		super();
		this.fila = fila;
		this.numAsiento = numAsiento;
	}

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public int getNumAsiento() {
		return numAsiento;
	}

	public void setNumAsiento(int numAsiento) {
		this.numAsiento = numAsiento;
	}
	
	

}
