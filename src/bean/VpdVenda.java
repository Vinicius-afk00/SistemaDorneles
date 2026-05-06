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
public class VpdVenda {
    private int vpd_id_venda;
    private int vpd_fk_clientes;
    private int vpd_fk_usuarios;
    private int vpd_fk_vendedor;
    private Date vpd_data_venda;
    private Date vpd_data_inicio;
    private Date vpd_data_final;
    private int vpd_valor_total;
    private int vpd_valor_desconto;
    private String vpd_status_pagamento;
    private String vpd_status_venda;
    
    public int getVpdIdVenda(){
        return vpd_id_venda;
    }
    
    public void setVpdIdVenda(int vpd_id_venda){
        this.vpd_id_venda = vpd_id_venda;
    }
    
    public int getVpdFkClientes(){
        return vpd_fk_clientes;
    }
    
    public void setVpdFkClientes(int vpd_fk_clientes){
        this.vpd_fk_clientes = vpd_fk_clientes;
    }
    
    public int getVpdFkUsuarios(){
        return vpd_fk_usuarios;
    }
    
    public void setVpdFkUsuarios(int vpd_fk_usuarios){
        this.vpd_fk_usuarios = vpd_fk_usuarios;
    }
    
    public int getVpdFkVendedor(){
        return vpd_fk_vendedor;
    }
    
    public void setVpdFkVendedor(int vpd_fk_vendedor){
        this.vpd_fk_vendedor = vpd_fk_vendedor;
    }
    
    public Date getVpdDataVenda(){
        return vpd_data_venda;
    }
    
    public void setVpdDataVenda(Date vpd_data_venda){
        this.vpd_data_venda = vpd_data_venda;
    }
    
    public Date getVpdDataInicio(){
        return vpd_data_inicio;
    }
    
    public void setVpdDataInicio(Date vpd_data_inicio){
        this.vpd_data_inicio = vpd_data_inicio;
    }
    
    public Date getVpdDataFinal(){
        return vpd_data_final;
    }
    
    public void setVpdDataFinal(Date vpd_data_final){
        this.vpd_data_final = vpd_data_final;
    }
    
    public int getVpdValorTotal(){
        return vpd_valor_total;
    }
    
    public void setVpdValorTotal(int vpd_valor_total){
        this.vpd_valor_total = vpd_valor_total;
    }
    
    public int getVpdValorDesconto(){
        return vpd_valor_desconto;
    }
    
    public void setVpdValorDesconto(int vpd_valor_desconto){
        this.vpd_valor_desconto = vpd_valor_desconto;
    }
    
    public String getVpdStatusPaga(){
        return vpd_status_pagamento;
    }
    
    public void setVpdStatusPaga(String vpd_status_pagamento){
        this.vpd_status_pagamento = vpd_status_pagamento;
    }
    
    public String getVpdStatusVenda(){
        return vpd_status_venda;
    }
    
    public void setVpdStatusVenda(String vpd_status_venda){
        this.vpd_status_venda = vpd_status_venda;
    }
}
