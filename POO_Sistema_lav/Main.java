package POO_Sistema_lav;

import java.util.Scanner;

public class Main {

	static int clientes = 0;
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		OrdemDeServico ordem = new OrdemDeServico();
		
		System.out.println("Quantos clientes serão atendidos?: ");
		int clientes = input.nextInt();
		int cont = 0;
		
		while (cont < clientes) {
			input.nextLine();
			System.out.println("Qual seu nome?: ");
			String nome = input.nextLine();
			System.out.println("Qual seu endereço?: ");
			String endereco = input.nextLine();
			System.out.println("Qual seu telefone?: ");
			long telefone = input.nextLong();
			System.out.println("Qual seu CPF/CNPJ?: ");
			long cpf_cnpj = input.nextLong();
			
			input.nextLine();
			System.out.println("Qual a placa de seu carro?: ");
			String placa = input.nextLine();
			System.out.println("Qual a chassi de seu carro?: ");
			String marca = input.nextLine();
			System.out.println("Qual o marca de seu carro?: ");
			String modelo = input.nextLine();
			System.out.println("Qual o modelo de seu carro?: ");
			String chassi = input.nextLine();
			System.out.println("Qual a cor de seu carro?: ");
			String cor = input.nextLine();
			
			System.out.println("--------------------------");
			System.out.println("--------------------------");
			System.out.println("Ordem Registrada, aperte ENTER para continuar!!");
			
			Pessoa registro_pessoa = new Pessoa(nome, endereco, telefone, cpf_cnpj);
			Carro registro_carro = new Carro(placa, marca, modelo, chassi, cor);
			ordem.registrarPessoa(registro_pessoa);
			ordem.registrarCarro(registro_carro);
			cont++;
		}
		
		ordem.mostrarOrdem(cont);
		
		input.close();
	}

}
