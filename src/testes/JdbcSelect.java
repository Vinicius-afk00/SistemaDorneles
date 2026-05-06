/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author u08538003160
 */
public class JdbcSelect {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_vinicius_dorneles";
            user = "vinicius_dorneles";
            password = "vinicius_dorneles";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "select * from vpd_usuarios";
            PreparedStatement pst = cnt.prepareStatement(sql);
            //pst.setInt(1, 503);
            ResultSet rs = pst.executeQuery();
            while (rs.next() == true) {
                System.out.println("codigo:" + rs.getInt("vpd_id_usuario"));
                System.out.println("nome:" + rs.getString("vpd_nome"));;
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JdbcSelect.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JdbcSelect.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Conectou");
    }
}
