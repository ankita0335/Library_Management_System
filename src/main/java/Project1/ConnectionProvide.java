/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project1;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ankita chaturvedi
 */
public class ConnectionProvide {
    public static Connection getCon() {
        //Making Database Connection once & using multiple times whenever required.
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "123456");
            return con;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
