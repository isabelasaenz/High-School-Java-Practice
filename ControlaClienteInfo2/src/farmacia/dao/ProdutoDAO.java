package farmacia.dao;

import farmacia.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import farmacia.bean.Produto;

public class ProdutoDAO {
    public void create(Produto p) {
        
        Connection con = ConnectionFactory.getConexao();
        
        PreparedStatement ps = null;
           try {
            ps = con.prepareStatement("INSERT INTO produto (descricao,qtd,preco)VALUES(?,?,?)");
            ps.setString(1, p.getDescricao());
            ps.setInt(2, p.getQtd());
            ps.setDouble(3, p.getPreco());

            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Produto salvo com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConexao(con, ps);
        }

    }

    public List<Produto> read() {

        Connection con = ConnectionFactory.getConexao();
        
        PreparedStatement ps = null;
        ResultSet rs = null;

        List<Produto> produtos = new ArrayList<>();

        try {
            ps = con.prepareStatement("SELECT * FROM produto");
            rs = ps.executeQuery();

            while (rs.next()) {

                Produto produto = new Produto();

                produto.setId(rs.getInt("id"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setQtd(rs.getInt("qtd"));
                produto.setPreco(rs.getDouble("preco"));
                produtos.add(produto);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConexao(con, ps, rs);
        }

        return produtos;

    }
    public List<Produto> readForDesc(String desc) {

        Connection con = ConnectionFactory.getConexao();
        
        PreparedStatement ps = null;
        ResultSet rs = null;

        List<Produto> produtos = new ArrayList<>();

        try {
            ps = con.prepareStatement("SELECT * FROM produto WHERE descricao LIKE ?");
            ps.setString(1, "%"+desc+"%");
            
            rs = ps.executeQuery();

            while (rs.next()) {

                Produto produto = new Produto();

                produto.setId(rs.getInt("id"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setQtd(rs.getInt("qtd"));
                produto.setPreco(rs.getDouble("preco"));
                produtos.add(produto);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConexao(con, ps, rs);
        }

        return produtos;

    }

    public void update(Produto p) {

        Connection con = ConnectionFactory.getConexao();
        
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement("UPDATE produto SET descricao = ? ,qtd = ?,preco = ? WHERE id = ?");
            ps.setString(1, p.getDescricao());
            ps.setInt(2, p.getQtd());
            ps.setDouble(3, p.getPreco());
            ps.setInt(4, p.getId());

            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Produto atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConexao(con, ps);
        }

    }
    public void delete(Produto p) {

        Connection con = ConnectionFactory.getConexao();
        
        PreparedStatement ps = null;

        try {
           ps = con.prepareStatement("DELETE FROM produto WHERE id = ?");
            ps.setInt(1, p.getId());

            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Produto excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConnectionFactory.closeConexao(con, ps);
        }
    }
}
