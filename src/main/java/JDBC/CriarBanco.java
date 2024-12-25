package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {
  public static void main(String[] args) throws SQLException {
    final String db_host = "jdbc:postgresql://localhost:5432/postgres";
    final String db_user = "java";
    final String db_pass = "123";

    Connection conexao = DriverManager.getConnection(db_host, db_user, db_pass);

    Statement sql = conexao.createStatement();

    sql.execute("CREATE DATABASE IF NOT EXISTS java");

    System.out.println("Base de dados criada com sucesso!");
    conexao.close();
  }
}
