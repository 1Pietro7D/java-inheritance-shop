package shop.gen30;

import java.util.Random;

public class Prodotto {
	private final int codice;
	private String nome;
	private String marca;
	private double prezzo;
	private double iva = 22;

	public Prodotto(String nome, String marca, double prezzo) {
		this.codice = new Random().nextInt(100000000);
		this.nome = nome;
		this.marca = marca;
		this.prezzo = prezzo;
	}
	public Prodotto(String nome, String marca) {
		this.codice = new Random().nextInt(100000000);
		this.nome = nome;
		this.marca = marca;
	
	}
	public int getCodice() {
		return codice;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		if (prezzo > 0) {
			this.prezzo = prezzo;
		} else {
			this.prezzo = 0.01;
		}
	}

	public double getIva() {
		return iva;
	}

	public double postIva(double price) {
		double priceMoreIva = (100 + getIva()) * price / 100;
		return priceMoreIva;
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Prodotto productTest = new Prodotto("marco", "nike", -1);
		Prodotto productTest = new Prodotto("marco", "nike");
		productTest.setPrezzo(-1);
		System.out.print("prezzo base " + String.format("%.2f", productTest.prezzo) + "€ --");
		System.out.println(" prezzo con iva " + String.format("%.2f", productTest.postIva(productTest.prezzo)) + "€");
		System.out.println(productTest.getNome());
		System.out.println(productTest.nome);
	}

}
