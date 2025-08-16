package POO_Sistema_lav;

public class Carro {
	private String placa, marca, modelo, chassi, cor;
	
	public Carro(String placa, String marca, String modelo, String chassi, String cor) {
		this.marca = marca;
		this.chassi = chassi;
		this.placa = placa;
		this.modelo = modelo;
		this.cor = cor;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public String getChassi(){
		return chassi;
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public String getCor() {
		return cor;
	}

}
