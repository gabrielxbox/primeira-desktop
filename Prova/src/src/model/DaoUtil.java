package src.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


public class DaoUtil {
    private Connection cx = null;
    
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        String usr="";
        String psw="";
        String url="jdbc:sqlite:C:\\Users\\Aluno\\Desktop\\gabriel_dos_santos_cunha\\Banco\\aula.db";
        Class.forName("org.sqlite.JDBC");
        this.cx = DriverManager.getConnection(url, usr, psw);
        return this.cx;
    }
    
    public void getFechaConnection() throws SQLException {
        if (this.cx !=null){
            this.cx.close();
            this.cx=null;
        }
    }
    
    public PreparedStatement getPreparedStatement(String sql) throws ClassNotFoundException, SQLException {
        return this.getConnection().prepareStatement(sql);
    }
    public Statement getStatement() throws ClassNotFoundException, SQLException{
        return this.getConnection().createStatement();
    }
}
