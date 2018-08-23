package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {
    static  Connection cn = null;
    public static Connection conectar(){
       
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cn = DriverManager.getConnection("jdbc:sqlserver://LAPTOP-PVFQ2RI8\\SQLEXPRESS;"
                    + "databaseName=ProjectResidencial;integratedSecurity=true;");
            System.out.println("Conexion Exitosa");
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return cn;
    }
}
