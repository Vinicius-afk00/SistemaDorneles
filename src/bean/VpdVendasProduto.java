/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

/**
 *
 * @author u08538003160
 */
public class VpdVendasProduto {
    private int vpd_id_vendas_produto;
    private int vpd_fk_vendas;
    private int vpd_fk_produto;
    private int vpd_quantidade;
    private double vpd_valor_unitario;
    private double vpd_sub_total;
    private String vpd_observacoes_item;
    
    public int getVpdIdVendasProduto(){
        return vpd_id_vendas_produto;
    }
    
    public void setVpdIdVendasProduto(int vpd_id_vendas_produto){
        this.vpd_id_vendas_produto = vpd_id_vendas_produto;
    }
    
    public int getVpdFkVendas(){
        return vpd_fk_vendas;
    }
    
    public void setVpdFkVendas(int vpd_fk_vendas){
        this.vpd_fk_vendas = vpd_fk_vendas;
    }
    
    public int getVpdFkProduto(){
        return vpd_fk_produto;
    }
    
    public void setVpdFkProduto(int vpd_fk_produto){
        this.vpd_fk_produto = vpd_fk_produto;
    }
    
    public int getVpdQuantidade(){
        return vpd_quantidade;
    }
    
    public void setVpdQuantidade(int vpd_quantidade){
        this.vpd_quantidade = vpd_quantidade;
    }
    
    public double getVpdIdValorUnitario(){
        return vpd_valor_unitario;
    }
    
    public void setVpdValorUnitario(double vpd_valor_unitario){
        this.vpd_valor_unitario = vpd_valor_unitario;
    }
    
    public double getVpdSubTotal(){
        return vpd_sub_total;
    }
    
    public void setVpdSubTotal(double vpd_sub_total){
        this.vpd_sub_total = vpd_sub_total;
    }
    
    public String getVpdObservacoesItem(){
        return vpd_observacoes_item;
    }
    
    public void setVpdObservacoesItem(String vpd_observacoes_item){
        this.vpd_observacoes_item = vpd_observacoes_item;
    }
}
