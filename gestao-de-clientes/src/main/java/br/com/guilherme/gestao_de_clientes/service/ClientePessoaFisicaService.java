package br.com.guilherme.gestao_de_clientes.service;

import java.util.List;

import br.com.guilherme.gestao_de_clientes.dao.ClientePessoaFisicaDAO;
import br.com.guilherme.gestao_de_clientes.entity.ClientePessoaFisicaEntity;

public class ClientePessoaFisicaService {

	private ClientePessoaFisicaDAO clienteDao = new ClientePessoaFisicaDAO();

	public void cadastrarClientePessoaFisica(ClientePessoaFisicaEntity clienteCPF) {
		clienteDao.cadastrarClienteCPF(clienteCPF);
	}

	public void deletarClientePessoaFisica(int id) {
		clienteDao.deletarClienteCPF(id);
	}

	public void atualizar(int id, ClientePessoaFisicaEntity clienteCPF) {
		clienteDao.atualizar(id, clienteCPF);
	}

	public List<ClientePessoaFisicaEntity> listar() {
		return clienteDao.listar();
	}

}
