package shop.gen30;

public class Smartphone extends Prodotto {
	private String codIMEI; // 15 cifre
	private int memory;

	public Smartphone(String name, String brand, String codIMEI, int capacity) {
		super(name, brand);
		this.setCodIMEI(codIMEI);
		this.setMemory(capacity);
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

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memoria) {
		this.memory = memoria;
	}
	@Override
	public String toString() {
	  return super.toString() + 
	         ", IMEI = " + this.getCodIMEI() +
	         ", Memoria = " + this.getMemory();
	}

}
