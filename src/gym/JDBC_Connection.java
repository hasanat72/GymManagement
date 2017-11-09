package gym;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC_Connection{
    private Connection con=null;
    public Connection GetConnection()  throws SQLException {
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/member_db", "root", "1234");
        System.out.println("Database has been connected successfully!");
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    public static void main(String[] args) throws SQLException {
        JDBC_Connection con=new JDBC_Connection();
        con.GetConnection();
    }
    
}
