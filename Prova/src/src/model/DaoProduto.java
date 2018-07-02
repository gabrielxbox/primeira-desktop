package src.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import src.dto.DtoProduto;

public class DaoProduto extends DaoUtil {

    public DaoProduto() {
        super();
    }

    public boolean setAdicionar(DtoProduto prod) throws ClassNotFoundException,
            SQLException {
        String sql = "INSERT INTO tbproduto (nome, preco,"
                + "validade, descricao) VALUES(?,?,?,?)";

        PreparedStatement ps = super.getPreparedStatement(sql);
        ps.setString(1, prod.getNome());
        ps.setDouble(2, prod.getPreco());
        ps.setDate(3, new java.sql.Date(prod.getValidate().getTime()));
        ps.setString(4, prod.getDescricao());
        int ret = ps.executeUpdate();
        ps.close();
        super.getFechaConnection();
        return ret > 0;
    }

    public boolean setAlterar(DtoProduto prod) throws SQLException, ClassNotFoundException {
        String sql = "UPDATE tbproduto SET nome=?, preco=?,"
                + "validade=?, descricao=? WHERE idproduto=?";

        PreparedStatement ps = super.getPreparedStatement(sql);
        ps.setString(1, prod.getNome());
        ps.setDouble(2, prod.getPreco());
        ps.setDate(3, new java.sql.Date(prod.getValidate().getTime()));
        ps.setString(4, prod.getDescricao());
        ps.setInt(5, prod.getIdproduto());
        int ret = ps.executeUpdate();
        ps.close();
        super.getFechaConnection();
        return ret >0;
    }

    public int setDeletar(DtoProduto prod) throws ClassNotFoundException, SQLException {
        String sql = "tbproduto WHERE idproduto=?";
        PreparedStatement ps = super.getPreparedStatement(sql);
        ps.setInt(1, prod.getIdproduto());
        int ret = ps.executeUpdate();
        ps.close();
        super.getFechaConnection();
        return 0;
    }

    public ArrayList getTodos() throws ClassNotFoundException, SQLException {
        ArrayList lstret = new ArrayList();
        String sql = "SELECT idproduto, nome, preco, validade, descricao FROM tbproduto";
        PreparedStatement ps = super.getPreparedStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            lstret.add(new Object[]{rs.getInt("idproduto"),
                rs.getString("nome"),
                rs.getDouble("preco"),
                rs.getDate("validade"),
                rs.getString("descricao")}
            );
        }
        return lstret;
    }

}
