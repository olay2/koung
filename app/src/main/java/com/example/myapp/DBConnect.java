package com.example.myapp;
import java.sql.*;

public class DBConnect {
    public static Connection getConnect() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String user ="koung";
            String pwd="koung99805975";
            String url="jdbc:mysql://192.168.43.88:3306/koung1?characterEncoding=utf8";//ip wifi
            Connection c = DriverManager.getConnection(url,user,pwd);
            return c;

        }catch (Exception ex){
            return null;
        }
    }


}
