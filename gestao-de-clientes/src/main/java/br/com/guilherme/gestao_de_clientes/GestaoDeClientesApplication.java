package br.com.guilherme.gestao_de_clientes;

import br.com.guilherme.gestao_de_clientes.entity.ClientePessoaFisicaEntity;
import br.com.guilherme.gestao_de_clientes.service.ClientePessoaFisicaService;

public class GestaoDeClientesApplication {

	public static void main(String[] args) {

		ClientePessoaFisicaEntity cliente1 = new ClientePessoaFisicaEntity();
		ClientePessoaFisicaService cadCliente = new ClientePessoaFisicaService();

		cliente1.setId((long) 6);
		cliente1.setNome("Aparecida Conceição");
		cliente1.setCpf("03788514721");
		cliente1.setEmail("aparecidacsr@gmail.com");
		cliente1.setTelefone("064992748896");
		cliente1.setEndereco("Rua 21 Qd 11 Lt 15, Centro");
		cliente1.setCidade("Mineiros");
		cliente1.setEstado("Goiás");

		// cadCliente.cadastrarClientePessoaFisica(cliente1);
		// cadCliente.atualizar(6, cliente1);
		cadCliente.listar();

		// cadCliente.deletarClientePessoaFisica(3);
		// cadCliente.deletarClientePessoaFisica(4);

	}

}
