package farmacia.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConnectionFactory {

    private static final String urlBase = "jdbc:derby://localhost:1527/dbfarmacia";
    private static final String usuario = "root";
    private static final String senha = "root";

public static Connection getConexao() {
    Connection conexao = null;
    try {
        conexao = DriverManager.getConnection(urlBase, usuario, senha);
            if (conexao != null)
                System.out.println("Conexão feita com sucesso");
    } catch (SQLException ex) {
        Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
    }
        return conexao;
}

    /**
     *
     * @param con
     */
    public static void closeConexao(Connection con) {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void closeConexao(Connection con, PreparedStatement ps) {

        closeConexao(con);

        try {

            if (ps != null) {
                ps.close();
            }

        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void closeConexao(Connection con, PreparedStatement ps, ResultSet rs) {

        closeConexao(con, ps);

        try {

            if (rs != null) {
                rs.close();
            }

        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}