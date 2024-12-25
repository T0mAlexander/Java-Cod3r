package JDBC;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConexaoFactory {
  public static Connection getConexao() {
    try {
      Properties prop = getProperties();
      final String db_host = prop.getProperty("db.url");
      final String db_user = prop.getProperty("db.user");
      final String db_pass = prop.getProperty("db.password");

      return DriverManager.getConnection(db_host, db_user, db_pass);
    } catch (SQLException | IOException error) {
      throw new RuntimeException(error);
    }
  }

  private static Properties getProperties () throws IOException {
    Properties prop = new Properties();
    String dbConnection = "/db.properties";
    prop.load(ConexaoFactory.class.getResourceAsStream(dbConnection));
    return prop;
  }
}
