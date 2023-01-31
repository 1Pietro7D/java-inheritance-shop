package shop.gen30;

public class Smartphone extends Prodotto {
	private String codIMEI; // 15 cifre
	private int memory;

	public Smartphone(String name, String brand, String codIMEI, int capacity) {
		super(name, brand);
		setCodIMEI(codIMEI);
		setMemory(capacity);
		// TODO Auto-generated constructor stub

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

	public void setMemory(int capacity) {
		this.memory = capacity;
	}
	@Override
	public String toString() {
	  return super.toString() + 
	         ", IMEI = " + this.getCodIMEI() +
	         ", Memoria = " + this.getMemory();
	}

}
