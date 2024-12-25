package JDBC;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabela {
  public static void main(String[] args) throws SQLException {
    Connection conexao = ConexaoFactory.getConexao();

    String sql = "CREATE TABLE pessoas (";

    Statement postgres = conexao.createStatement();
    postgres.execute(sql);

    postgres.close();
  }
}
