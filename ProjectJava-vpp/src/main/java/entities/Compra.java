package entities;

public class Compra {

		int idCom;
		String fechaHora;
		
		
		public Compra(int idCom, String fechaHora) {
			super();
			this.idCom = idCom;
			this.fechaHora = fechaHora;
		}
		
		public int getIdCom() {
			return idCom;
		}
		public void setIdCom(int idCom) {
			this.idCom = idCom;
		}
		public String getFechaHora() {
			return fechaHora;
		}
		public void setFechaHora(String fechaHora) {
			this.fechaHora = fechaHora;
		}
		
		
}
