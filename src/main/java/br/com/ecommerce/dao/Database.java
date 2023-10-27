package br.com.ecommerce.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Database {

    public Connection GetConnection()
    {
        try{
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa","sa");

            System.out.println("success in database connection");

            return connection;

        }catch (Exception e) {

            System.out.println("fail in database connection");
        }
        return null;
    }
}
