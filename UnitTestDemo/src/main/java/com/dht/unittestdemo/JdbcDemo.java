/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.unittestdemo;

import com.dht.pojo.Question;
import com.dht.services.QuestionService;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author admin
 */
public class JdbcDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //Nap Driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        //Mo ket noi
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/englishdb", "root", "Admin@123");
        
        //Thuc thi truy van
        Statement stm = conn.createStatement();
        //Truy van du lieu: select
        ResultSet rs = stm.executeQuery("SELECT * FROM category");
        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            System.out.printf("%d - %s\n", id, name);
        }
        //Dinh nghia du lieu: insert, update, delete,...
        int r = stm.executeUpdate("INSERT INTO category(name) VALUES('Prep')");
        System.out.println(r);
        
        //Dong ket noi
        conn.close();
        
//        QuestionService s = new QuestionService();
//        
//        Question q = new Question("I am ... engineer", 1);
//        s.addQuestion(q);
    }
}
