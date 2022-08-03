package entities;

public class TipoColectivo {

	int idColec;
	String desc;
	
	public TipoColectivo(int idColec, String desc) {
		super();
		this.idColec = idColec;
		this.desc = desc;
	}

	public int getIdColec() {
		return idColec;
	}

	public void setIdColec(int idColec) {
		this.idColec = idColec;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
}
