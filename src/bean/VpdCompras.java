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
public class VpdCompras {
    private int vpd_id_compras;
    private int vpd_fk_fornecedor;
    private int vpd_fk_usuario;
    private Date vpd_dataCompra;
    private String vpd_numeroNotaFiscal;
    private double vpd_valorToal;
    private String vpd_formaPagamento;
    private String vpd_observacoes;
    
    public int getVpdIdCompras(){
        return vpd_id_compras;
    }
    
    public void setVpdIdCompras(int vpd_id_compras){
        this.vpd_id_compras = vpd_id_compras;
    }
    
    public int getVpdFkFornecedor(){
        return vpd_fk_fornecedor;
    }
    
    public void setVpdFkFornecedor(int vpd_fk_fornecedor){
        this.vpd_fk_fornecedor = vpd_fk_fornecedor;
    }
    
    public int getVpdFkUsuario(){
        return vpd_fk_usuario;
    }
    
    public void setVpdFkUsuario(int vpd_fk_usuario){
        this.vpd_fk_usuario = vpd_fk_usuario;
    }
    
    public Date getVpdDataCompra(){
        return vpd_dataCompra;
    }
    
    public void setVpdDataCompra(Date vpd_dataCompra){
        this.vpd_dataCompra = vpd_dataCompra;
    }
    
    public String getVpdNotaFiscal(){
        return vpd_numeroNotaFiscal;
    }
    
    public void setVpdNotaFiscal(String vpd_numeroNotaFiscal){
        this.vpd_numeroNotaFiscal = vpd_numeroNotaFiscal;
    }
    
    public double getVpdValorTotal(){
        return vpd_valorToal;
    }
    
    public void setVpdValorTotal(double vpd_valorToal){
        this.vpd_valorToal = vpd_valorToal;
    }
    
    public String getVpdFormaPagamento(){
        return vpd_formaPagamento;
    }
    
    public void setVpdFormaPagamento(String vpd_formaPagamento){
        this.vpd_formaPagamento = vpd_formaPagamento;
    }
    
    public String getVpdObservacoes(){
        return vpd_observacoes;
    }
    
    public void setVpdObservacoes(String vpd_observacoes){
        this.vpd_observacoes = vpd_observacoes;
    }
}
