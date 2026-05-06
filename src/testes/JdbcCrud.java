/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author u08538003160
 */
public class JdbcCrud {
    public static void main(String[] args) {
        try {            
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
                    url = "jdbc:mysql://10.7.0.51:33062/db_vinicius_dorneles";
                    user = "vinicius_dorneles";
                    password = "vinicius_dorneles";
                    Connection cnt;
                    cnt = DriverManager.getConnection(url, user, password);
                    String sql = "insert into "
                            + "vpd_usuarios(vpd_id_usuario,vpd_nome, vpd_apelido, vpd_cpf)"
                            + " values (?, ?, ?, ?)";
                    PreparedStatement pst = cnt.prepareStatement(sql);
                    pst.setInt(1, 503);
                    pst.setString(2, "Vinicius Peres Dorneles");
                    pst.setString(3, "vpd");
                    pst.setString(4, "56893262666");
                    pst.executeUpdate();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JdbcCrud.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JdbcCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Conectou");
    }
}
