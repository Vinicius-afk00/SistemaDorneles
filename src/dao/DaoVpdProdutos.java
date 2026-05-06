/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.VpdProduto;
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
public class DaoVpdProdutos extends DaoAbstract{

    @Override
    public void insert(Object object) {
        VpdProduto vpdProduto = (VpdProduto) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_vinicius_dorneles";
            user = "vinicius_dorneles";
            password = "vinicius_dorneles";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "insert into vpd_produto values(?,?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, vpdProduto.getVpdIdProduto());
            pst.setInt(2, vpdProduto.getVpdFkFornecedor());
            pst.setString(3, vpdProduto.getVpdNome());
            pst.setString(4, vpdProduto.getVpdFichaTecnica());
            pst.setInt(5, vpdProduto.getVpdValorDiaria());
            pst.setString(6, vpdProduto.getVpdDisponivel());
            pst.setString(7, vpdProduto.getVpdProcessador());
            pst.setString(8, vpdProduto.getVpdPlacaVideo());
            pst.setString(9, vpdProduto.getVpdMemoriaRam());
            pst.setString(10, vpdProduto.getVpdArmazenamento());
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
