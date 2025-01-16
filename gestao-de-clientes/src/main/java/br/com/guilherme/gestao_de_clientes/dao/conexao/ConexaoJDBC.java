package br.com.guilherme.gestao_de_clientes.dao.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConexaoJDBC {

	private static final String URL = "jdbc:postgresql://localhost:5432/gestao_de_clientes";
	private static final String USUARIO = "postgres";
	private static final String SENHA = "Guirn$1491";

	private static Connection conn;

	public static Connection getConexao() {
		try {
			if (conn == null) {
				conn = DriverManager.getConnection(URL, USUARIO, SENHA);
				return conn;
			} else {
				return conn;
			}

		} catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Houve um erro ao tentar conectar ao banco de dados.");
			return null;
		}

	}
	
	public static Connection fecharConexao() {
		try {			
			if(!conn.isClosed()) {
				conn.close();
			}
		} catch(SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Houve um erro ao tentar fechar conexão com o banco de dados.");
			return null;
		}
		return conn;
	}
}
