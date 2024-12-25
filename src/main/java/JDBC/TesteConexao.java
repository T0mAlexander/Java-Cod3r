package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
  public static void main(String[] args) throws SQLException {
    final String db_host = "jdbc:postgresql://localhost:5432/postgres";
    final String db_user = "java";
    final String db_pass = "123";

    Connection conexao = DriverManager.getConnection(db_host, db_user, db_pass);

    System.out.println("Conexão ao Postgres realizada com sucesso!");
    conexao.close();
  }
}
