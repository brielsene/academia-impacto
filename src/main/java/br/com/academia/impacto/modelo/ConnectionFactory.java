package br.com.academia.impacto.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection iniciaConexao() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost/academia?useTimezone=true&serverTimezone=UTC", "root", "root");
	}

}
