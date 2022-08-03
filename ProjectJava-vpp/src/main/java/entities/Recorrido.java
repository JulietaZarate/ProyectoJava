package entities;

public class Recorrido {
	
	int idReco;
	int hsSalida;
	int hsLlegada;
	
	
	public Recorrido(int idReco, int hsSalida, int hsLlegada) {
		super();
		this.idReco = idReco;
		this.hsSalida = hsSalida;
		this.hsLlegada = hsLlegada;
	}
	
	public int getIdReco() {
		return idReco;
	}
	public void setIdReco(int idReco) {
		this.idReco = idReco;
	}
	public int getHsSalida() {
		return hsSalida;
	}
	public void setHsSalida(int hsSalida) {
		this.hsSalida = hsSalida;
	}
	public int getHsLlegada() {
		return hsLlegada;
	}
	public void setHsLlegada(int hsLlegada) {
		this.hsLlegada = hsLlegada;
	}
	


}
