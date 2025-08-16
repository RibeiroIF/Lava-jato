package POO_Sistema_lav;

import java.util.ArrayList;

public class OrdemDeServico {
	
	private ArrayList<Pessoa> pessoas;
	private ArrayList<Carro> carros;
	
	public OrdemDeServico() {
		pessoas = new ArrayList<>();
		carros = new ArrayList<>();
	}

	public void registrarPessoa(Pessoa pessoa) {
		pessoas.add(pessoa);
	}
	
	public void registrarCarro(Carro carro) {
		carros.add(carro);
	}
	
	public void mostrarOrdem(int cont) {
		for (Pessoa pessoa : pessoas) {
			System.out.println("Ordem de serviço: ");
			System.out.println("Nome: "+pessoa.getNome()
							+ "\nEndereço: "+pessoa.getEndereco()
							+ "\nTelefone: "+pessoa.getTelefone()
							+ "\nCPF/CNPJ: "+pessoa.getCpf_cnpj());
			System.out.println("--------------------------------");
		}
		for (Carro carro : carros) {
			System.out.println("Ordem de serviço: ");
			System.out.println("Placa: "+carro.getPlaca()
							+ "\nChassi: "+carro.getChassi()
							+ "\nMarca: "+carro.getMarca()
							+ "\nModelo: "+carro.getModelo()
							+ "\nCor: "+carro.getCor());
			System.out.println("--------------------------------");
		}
	}

}
