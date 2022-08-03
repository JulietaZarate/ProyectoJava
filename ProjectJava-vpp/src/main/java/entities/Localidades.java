package entities;

public class Localidades {
	
	int idLoc;
	String nomL;
	
	public Localidades(int idLoc, String nomL) {
		super();
		this.idLoc = idLoc;
		this.nomL = nomL;
	}

	public int getIdLoc() {
		return idLoc;
	}

	public void setIdLoc(int idLoc) {
		this.idLoc = idLoc;
	}

	public String getNomL() {
		return nomL;
	}

	public void setNomL(String nomL) {
		this.nomL = nomL;
	}
	
	
	
}
