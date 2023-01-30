package shop.gen30;

public class Smarphone extends Prodotto {
	private String codIMEI; //15 cifre
	private int memoria;

	public Smarphone(String name, String brand, String codIMEI, int capacity) {
		super(name, brand);
		this.setCodIMEI(codIMEI);
	    this.setMemoria(capacity);
		// TODO Auto-generated constructor stub
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String getCodIMEI() {
		return codIMEI;
	}

	public void setCodIMEI(String codIMEI) {
		this.codIMEI = codIMEI;
	}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}

}
