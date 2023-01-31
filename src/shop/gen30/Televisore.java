package shop.gen30;

public class Televisore extends Prodotto {
	private String size;
	private boolean smart;

	public Televisore(String name, String brand, String size, boolean smart) {
		// TODO Auto-generated constructor stub
		super(name, brand);
		setSize(size);
		setSmart(smart);
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public boolean isSmart() {
		return smart;
	}

	public void setSmart(boolean smart) {
		this.smart = smart;
	}
	@Override
	public String toString() {
	  return super.toString() + 
	         ", size = " + this.getSize() +
	         ", is Smart = " + (this.isSmart() ? "yes":"no");
	}
}
