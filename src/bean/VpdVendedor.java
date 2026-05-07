/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

import java.util.Date;


/**
 *
 * @author u08538003160
 */
public class VpdVendedor {
    private int vpd_idVendedor;
    private String vpd_nome;
    private String vpd_cpf;
    private String vpd_email;
    private String vpd_telefone;
    private double vpd_salario;
    private String vpd_contrato;
    private Date vpd_data_contratacao;
    private String vpd_ativo;
    
    public int getVpdIdVendedor(){
        return vpd_idVendedor;
    }
    
    public void setVpdIdVendedor(int vpd_idVendedor){
        this.vpd_idVendedor = vpd_idVendedor;
    }
    
    public String getVpdNome(){
        return vpd_nome;
    }
    
    public void setVpdNome(String vpd_nome){
        this.vpd_nome = vpd_nome;
    }
    
    public String getVpdCpf(){
        return vpd_cpf;
    }
    
    public void setVpdCpf(String vpd_cpf){
        this.vpd_cpf = vpd_cpf;
    }
    
    public String getVpdEmail(){
        return vpd_email;
    }
    
    public void setVpdEmail(String vpd_email){
        this.vpd_email = vpd_email;
    }
    
    public String getVpdTelefone(){
        return vpd_telefone;
    }
    
    public void setVpdTelefone(String vpd_telefone){
        this.vpd_telefone = vpd_telefone;
    }
    
    public double getVpdSalario(){
        return vpd_salario;
    }
    
    public void setVpdSalario(double vpd_salario){
        this.vpd_salario = vpd_salario;
    }
    
    public String getVpdContrato(){
        return vpd_contrato;
    }
    
    public void setVpdContrato(String vpd_contrato){
        this.vpd_contrato = vpd_contrato;
    }
    
    public Date getVpdDataContratacao(){
        return vpd_data_contratacao;
    }
    
    public void setVpdDataContratacao(Date vpd_data_contratacao){
        this.vpd_data_contratacao = vpd_data_contratacao;
    }
    
    public String getVpdAtivo(){
        return vpd_ativo;
    }
    
    public void setVpdAtivo(String vpd_ativo){
        this.vpd_ativo = vpd_ativo;
    }
}
