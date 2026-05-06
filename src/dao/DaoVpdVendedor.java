/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.VpdVendedor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import testes.JdbcSelect;

/**
 *
 * @author u08538003160
 */
public class DaoVpdVendedor extends DaoAbstract{

    @Override
    public void insert(Object object) {
        VpdVendedor vpdVendedor = (VpdVendedor) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_vinicius_dorneles";
            user = "vinicius_dorneles";
            password = "vinicius_dorneles";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "insert into vpd_vendedor values(?,?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, vpdVendedor.getVpdIdVendedor());
            pst.setString(2, vpdVendedor.getVpdNome());
            pst.setString(3, vpdVendedor.getVpdCpf());
            pst.setString(4, vpdVendedor.getVpdEmail());
            pst.setString(5, vpdVendedor.getVpdTelefone());
            pst.setInt(6, vpdVendedor.getVpdSalario());
            pst.setString(7, vpdVendedor.getVpdContrato());
            pst.setDate(8, null);//vpd_data_contratacao
            pst.setString(9, vpdVendedor.getVpdAtivo());
            pst.executeUpdate();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JdbcSelect.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JdbcSelect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Object object) {
        
    }

    @Override
    public void delete(Object object) {
        
    }

    @Override
    public Object list(int id) {
        return null;
    }

    @Override
    public Object listAll() {
        return null;
    }
}
