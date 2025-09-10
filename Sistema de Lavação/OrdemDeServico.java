package POO;

import java.util.ArrayList;
import java.util.HashMap;

public class OrdemDeServico {
	private ArrayList<Cliente> clientes;
	private ArrayList<Carro> carros;
	private HashMap <Cliente, Carro> ordens;
	
	private situacaoOrdemDeServico situacao = situacaoOrdemDeServico.ABERTA;
	
	public OrdemDeServico() {
		clientes = new ArrayList<>();
		carros = new ArrayList<>();
		ordens = new HashMap<>();
		
	}
	
	public void registrarCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public void registrarCarro(Carro carro) {
		carros.add(carro);
	}
	
	public void registrarOrdem(Cliente cliente, Carro carro) {
		ordens.put(cliente, carro);
	}
	
	public void mostrarOrdemDeServico() {
		for (Cliente cliente : clientes) {
			System.out.println("-----------------");
			System.out.println("Nome do Cliente: "+cliente.getNome());
			for (Carro carro : carros) {
				System.out.println("-----------------");
				System.out.println("Placa de seu carro: "+carro.getPlaca()+""
								+ "\nMarca de seu carro: "+carro.getMarca()+""
								+ "\nModelo de seu carro: "+carro.getModelo()+""
								+ "\nChassi de seu carro: "+carro.getChassi()+""
								+ "\nCor de seu carro: "+carro.getCor()+""
								+ "\nSituação da Ordem: "+situacao);
			}
			System.out.println("-------------------");
		}
	}
}
