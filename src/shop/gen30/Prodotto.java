package shop.gen30;

import java.util.Random;

public class Prodotto {
	private final int COD; // final constant want uppercase
	private String name;
	private String brand;
	private double price;
	private double iva = 22;

	public Prodotto(String name, String brand, double price) {
		this.COD = new Random().nextInt(100000000);
		this.name = name;
		this.brand = brand;
		this.price = price;
	}

	public Prodotto(String name, String brand) {
		this.COD = new Random().nextInt(100000000);
		this.name = name;
		this.brand = brand;

	}

	public int getCod() {
		return COD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price > 0) {
			this.price = price;
		} else {
			this.price = 0.01;
		}
	}

	public double getIva() {
		return iva;
	}

	public double postIva(double price) {
		double priceMoreIva = (100 + getIva()) * price / 100;
		return priceMoreIva;
	};
	@Override
	public String toString() {
	  return "Informazioni sul prodotto: " +
	         "Codice = " + this.getCod() +
	         ", Nome = " + this.getName() +
	         ", Marca = " + this.getBrand() +
	         ", Prezzo = " + this.postIva(getPrice()) + "€" +
	         ", IVA = " + this.getIva();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Prodotto productTest = new Prodotto("marco", "nike", -1);
		Prodotto productTest = new Prodotto("marco", "nike");
		productTest.setPrice(-1);
		System.out.print("prezzo base " + String.format("%.2f", productTest.price) + "€ --");
		System.out.println(" prezzo con iva " + String.format("%.2f", productTest.postIva(productTest.price)) + "€");
		System.out.println(productTest.getName());
		System.out.println(productTest.name);
	}

}
