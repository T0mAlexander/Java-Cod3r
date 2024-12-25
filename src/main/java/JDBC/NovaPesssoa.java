package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPesssoa {
  public static void main(String[] args) throws SQLException {
    Scanner entrada = new Scanner(System.in);
    String nome = entrada.nextLine();

    Connection conexao = ConexaoFactory.getConexao();

    String sql = "INSERT INTO pessoas (nome, codigo) VALUES (?, ?)";
    PreparedStatement statement = conexao.prepareStatement(sql);
    statement.setString(1, nome);
    statement.execute();
    System.out.println(sql);
    entrada.close();
  }
}
