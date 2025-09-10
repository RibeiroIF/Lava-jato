package POO;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
	
	int clientesAtendidos, carrosRegistrados;
	String nomeCliente;
	String placaCarro, marcaCarro, modeloCarro, chassiCarro, corCarro;
	
	
	Scanner input = new Scanner(System.in);
	Cliente cliente = new Cliente();
	Carro carro = new Carro();
	OrdemDeServico ordem = new OrdemDeServico();
		
	clientesAtendidos = Integer.parseInt(JOptionPane.showInputDialog("Quantos clientes serão 	atendidos?: "));
	
	for (int i = 0; i < clientesAtendidos; i++) {
		nomeCliente = JOptionPane.showInputDialog("Olá, seja bem vindo à Lava-Car, qual o seu 		nome?: ");
		cliente.setNome(nomeCliente);
		ordem.registrarCliente(cliente);
		carrosRegistrados = Integer.parseInt(JOptionPane.showInputDialog("Quantos carros você 		registrará "+cliente.getNome()+"?:"));
		for (int j = 0; j < carrosRegistrados; j++) {
			placaCarro = JOptionPane.showInputDialog("Qual a placa de seu carro?: ");
			carro.setPlaca(placaCarro);
			marcaCarro = JOptionPane.showInputDialog("Qual a marca de seu carro?: ");
			carro.setMarca(marcaCarro);
			modeloCarro = JOptionPane.showInputDialog("Qual o modelo de seu carro?: ");
			carro.setModelo(modeloCarro);
			chassiCarro = JOptionPane.showInputDialog("Qual o chassi do seu carro?: ");
			carro.setChassi(chassiCarro);
			corCarro = JOptionPane.showInputDialog("Qual a cor de seu carro: ");
			carro.setCor(corCarro);
			ordem.registrarCarro(carro);
		}
	}
	
	ordem.mostrarOrdemDeServico();
	
	input.close();
	}

}
