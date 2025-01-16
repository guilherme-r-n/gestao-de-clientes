package br.com.guilherme.gestao_de_clientes.dao;

import br.com.guilherme.gestao_de_clientes.dao.conexao.ConexaoJDBC;
import br.com.guilherme.gestao_de_clientes.entity.ClientePessoaFisicaEntity;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class ClientePessoaFisicaDAO {

	public void cadastrarClienteCPF(ClientePessoaFisicaEntity clienteCPF) {
		String sql = "INSERT INTO \"CLIENTE_CPF\" (ID, NOME, CPF, EMAIL, TELEFONE, ENDERECO, CIDADE, ESTADO) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

		PreparedStatement ps;

		try {
			ps = ConexaoJDBC.getConexao().prepareStatement(sql);
			ps.setLong(1, clienteCPF.getId());
			ps.setString(2, clienteCPF.getNome());
			ps.setString(3, clienteCPF.getCpf());
			ps.setString(4, clienteCPF.getEmail());
			ps.setString(5, clienteCPF.getTelefone());
			ps.setString(6, clienteCPF.getEndereco());
			ps.setString(7, clienteCPF.getCidade());
			ps.setString(8, clienteCPF.getEstado());

			ps.execute();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Erro ao cadastrar cliente.");
		}
		ConexaoJDBC.fecharConexao();

	}

	public void deletarClienteCPF(int id) {
		String sql = "DELETE FROM \"CLIENTE_CPF\" WHERE ID = ?";

		PreparedStatement ps;

		try {
			ps = ConexaoJDBC.getConexao().prepareStatement(sql);
			ps.setInt(1, id);

			ps.execute();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Erro ao deletar cliente.");
		}
		ConexaoJDBC.fecharConexao();

	}

	public void atualizar(int id, ClientePessoaFisicaEntity clienteCPF) {
		String sql = "UPDATE \"CLIENTE_CPF\" SET ID = ?, NOME = ?, CPF = ?, EMAIL = ?, TELEFONE = ?, ENDERECO = ?, CIDADE = ?, ESTADO = ? WHERE ID = ?";

		PreparedStatement ps;

		try {
			ps = ConexaoJDBC.getConexao().prepareStatement(sql);
			ps.setLong(1, clienteCPF.getId());
			ps.setString(2, clienteCPF.getNome());
			ps.setString(3, clienteCPF.getCpf());
			ps.setString(4, clienteCPF.getEmail());
			ps.setString(5, clienteCPF.getTelefone());
			ps.setString(6, clienteCPF.getEndereco());
			ps.setString(7, clienteCPF.getCidade());
			ps.setString(8, clienteCPF.getEstado());
			ps.setInt(9, id);

			ps.execute();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Erro ao atualizar dados do cliente.");
		}
		ConexaoJDBC.fecharConexao();

	}

	public List<ClientePessoaFisicaEntity> listar() {
		String sql = "SELECT * FROM \"CLIENTE_CPF\" ";
		ArrayList<ClientePessoaFisicaEntity> clienteCpf = new ArrayList<ClientePessoaFisicaEntity>();

		PreparedStatement ps;

		try {
			ps = ConexaoJDBC.getConexao().prepareStatement(sql);
			ResultSet dados = ps.executeQuery();
			while (dados.next()) {
				Long id = dados.getLong("ID");
				String nome = dados.getString("NOME");
				String cpf = dados.getString("CPF");
				String email = dados.getString("EMAIL");
				String telefone = dados.getString("TELEFONE");
				String endereco = dados.getString("ENDERECO");
				String cidade = dados.getString("CIDADE");
				String estado = dados.getString("ESTADO");

				ClientePessoaFisicaEntity cliente = new ClientePessoaFisicaEntity(id, nome, cpf, email, telefone,
						endereco, cidade, estado);
				clienteCpf.add(cliente);

			}
			JOptionPane.showMessageDialog(null, clienteCpf);
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Erro ao listar clientes.");
		}
		ConexaoJDBC.fecharConexao();
		return clienteCpf;

	}
}