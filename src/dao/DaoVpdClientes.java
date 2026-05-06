package dao;

import bean.VpdClientes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import testes.JdbcSelect;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author u08538003160
 */
public class DaoVpdClientes extends DaoAbstract{

    @Override
    public void insert(Object object) {
        VpdClientes vpdClientes = (VpdClientes) object;
       try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_vinicius_dorneles";
            user = "vinicius_dorneles";
            password = "vinicius_dorneles";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "insert into vpd_clientes values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, vpdClientes.getVpdIdClientes());
            pst.setString(2, vpdClientes.getVpdNome());
            pst.setString(3, vpdClientes.getVpdCpf());
            pst.setDate(4, null);//vpd_dataNascimento
            pst.setString(5, vpdClientes.getVpdEmail());
            pst.setString(6, vpdClientes.getVpdEndereco());
            pst.setString(7, vpdClientes.getVpdTelefone());
            pst.setString(8, vpdClientes.getVpdAtivo());
            pst.setDate(9, null);
            pst.setInt(10, vpdClientes.getVpdQuantidade());
            pst.setString(11, vpdClientes.getVpdContrato());
            pst.setString(12, vpdClientes.getVpdProblemas());
            pst.setString(13, vpdClientes.getVpdPerfil());
            pst.setString(14, vpdClientes.getVpdGeneroFav());
            pst.setString(15, vpdClientes.getVpdPlataformaPref());
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
