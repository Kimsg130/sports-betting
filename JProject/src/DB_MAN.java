
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mukim
 */
public class DB_MAN {
    String strDriver = "com.mysql.cj.jdbc.Driver";
//    String strURL = "jdbc:oracle:thin:@//localhost:1521";
    String strURL = "jdbc:mysql://sports-betting.crolzzw8zi7u.ap-northeast-2.rds.amazonaws.com:3306/sports-vetting?characterEncoding=UTF-8&serverTimezone=UTC";
    String strUser = "admin";
    String strPWD = "wkqkvmfhwprxm2019";
    
    Connection DB_con;
    Statement DB_stmt;
    ResultSet DB_rs;
    /**
     * Creates new form DB_MAN
     */
    public void dbOpen() throws IOException{
        try {
            Class.forName(strDriver);
            DB_con = DriverManager.getConnection(strURL, strUser, strPWD);
            DB_stmt = DB_con.createStatement();
        } catch (Exception e) {
            System.out.println("SQLException : "+e.getMessage());
        }
    }
    public void dbClose() throws IOException{
        try {
            DB_stmt.close();
            DB_con.close();
        } catch (SQLException e) {
            System.out.println("SQLException : "+e.getMessage());
        }
    }
}
