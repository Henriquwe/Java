package dao;

import java.sql.*;

public class Conexao {
    private static final String usuario = "root";
    private static final String senha = "";
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String banco = "jdbc:mysql:127.0.0.1:3307/teste";

    public void conectaDB() {
        try {
            Class.forName(driver);

            Connection connection = DriverManager.getConnection(banco, usuario, senha);
            String query = "INSERT INTO TABELA";
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet result = ps.executeQuery();

        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

}
