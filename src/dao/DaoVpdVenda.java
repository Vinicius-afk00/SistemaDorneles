/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.VpdVenda;
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
public class DaoVpdVenda extends DaoAbstract{

    @Override
    public void insert(Object object) {
        VpdVenda vpdVenda = (VpdVenda) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_vinicius_dorneles";
            user = "vinicius_dorneles";
            password = "vinicius_dorneles";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "insert into vpd_vendas values(?,?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, vpdVenda.getVpdIdVenda());
            pst.setInt(2, vpdVenda.getVpdFkClientes());
            pst.setInt(3, vpdVenda.getVpdFkUsuarios());
            pst.setInt(4, vpdVenda.getVpdFkVendedor());
            pst.setDate(5, null);//vpd_data_venda
            pst.setDate(6, null);//vpd_data_inicio
            pst.setDate(7, null);//vpd_data_final
            pst.setDouble(8, vpdVenda.getVpdValorTotal());
            pst.setDouble(9, vpdVenda.getVpdValorDesconto());
            pst.setString(10, vpdVenda.getVpdStatusPaga());
            pst.setString(11, vpdVenda.getVpdStatusVenda());
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
