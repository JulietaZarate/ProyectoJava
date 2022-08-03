package entities;

public class Usuario {
	
	int idUsu;
	int dni;
	String mail;
	
	public Usuario(int idUsu, int dni, String mail) {
		super();
		this.idUsu = idUsu;
		this.dni = dni;
		this.mail = mail;
	}
	public int getIdUsu() {
		return idUsu;
	}
	public void setIdUsu(int idUsu) {
		this.idUsu = idUsu;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
	
	
	

}
