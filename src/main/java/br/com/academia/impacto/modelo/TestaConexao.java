package br.com.academia.impacto.modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaConexao {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection conn = connectionFactory.iniciaConexao();
		
		Statement stm = conn.createStatement();
		stm.execute("SELECT NOME, CPF, IDADE, ALTURA, PESO  FROM  PESSOA");
		ResultSet rs = stm.getResultSet();
		
		
		
		while(rs.next()) {
			String nome = rs.getString("NOME");
			System.out.println(nome);
			int cpf = rs.getInt("CPF");
			System.out.println(cpf);
		}

	}

}
