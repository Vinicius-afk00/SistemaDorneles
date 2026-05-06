/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.VpdFornecedor;
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
public class DaoVpdFornecedor extends DaoAbstract{

    @Override
    public void insert(Object object) {
        VpdFornecedor vpdFornecedor = (VpdFornecedor) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_vinicius_dorneles";
            user = "vinicius_dorneles";
            password = "vinicius_dorneles";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "insert into vpd_fornecedor values(?,?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, vpdFornecedor.getVpdIdFornecedor());
            pst.setString(2, vpdFornecedor.getVpdRazaoSocial());
            pst.setString(3, vpdFornecedor.getVpdNomeFantasia());
            pst.setString(4, vpdFornecedor.getVpdCnpj());
            pst.setString(5, vpdFornecedor.getVpdInscricaoEst());
            pst.setString(6, vpdFornecedor.getVpdEmail());
            pst.setString(7, vpdFornecedor.getVpdEndereco());
            pst.setString(8, vpdFornecedor.getVpdTelefone());
            pst.setString(9, vpdFornecedor.getVpdContatoResp());
            pst.setString(10, vpdFornecedor.getVpdSite());
            pst.setString(11, vpdFornecedor.getVpdAtivo());
            pst.setString(12, vpdFornecedor.getVpdCategoriaHard());
            pst.setInt(13, vpdFornecedor.getVpdTempoGarantia());
            pst.setString(14, vpdFornecedor.getVpdSuporteRemoto());
            pst.setString(15, vpdFornecedor.getVpdObservacaoTec());
            pst.setString(16, vpdFornecedor.getVpdPrazoEntrega());
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
