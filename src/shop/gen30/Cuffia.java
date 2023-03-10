package shop.gen30;

public class Cuffia extends Prodotto {
	private String color;
	private boolean wireless;

	public Cuffia(String name, String brand, String color, boolean wireless) {
		super(name, brand);
		setColor(color);
		setWireless(wireless);
		// TODO Auto-generated constructor stub
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isWireless() {
		return wireless;
	}

	public void setWireless(boolean wireless) {
		this.wireless = wireless;
	}
	@Override
	public String toString() {
	  return super.toString() + 
	         ", color = " + this.getColor() +
	         ", is wireless? = " + (this.isWireless()?"yes":"no");
	}

}
