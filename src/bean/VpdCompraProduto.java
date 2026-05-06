/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

/**
 *
 * @author u08538003160
 */
public class VpdCompraProduto {
    private int vpd_id_compras_produto;
    private int vpd_fk_compra;
    private int vpd_fk_produto;
    private int vpd_quantidade;
    private int vpd_custoUnitario;
    private int vpd_custoTotalItem;
    private String vpd_loteFabricacao;
    
    public int getVpdIdComprasProd(){
        return vpd_id_compras_produto;
    }
    
    public void setVpdIdComprasProd(int vpd_id_compras_produto){
        this.vpd_id_compras_produto = vpd_id_compras_produto;
    }
    
    public int getVpdFkCompra(){
        return vpd_fk_compra;
    }
    
    public void setVpdFkCompra(int vpd_fk_compra){
        this.vpd_fk_compra = vpd_fk_compra;
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
    
    public int getVpdCustoUni(){
        return vpd_custoUnitario;
    }
    
    public void setVpdCustoUni(int vpd_custoUnitario){
        this.vpd_custoUnitario = vpd_custoUnitario;
    }
    
    public int getVpdCustoTotal(){
        return vpd_custoTotalItem;
    }
    
    public void setVpdCustoTotal(int vpd_custoTotalItem){
        this.vpd_custoTotalItem = vpd_custoTotalItem;
    }
    
    public String getVpdLoteFabri(){
        return vpd_loteFabricacao;
    }
    
    public void setVpdLoteFabri(String vpd_loteFabricacao){
        this.vpd_loteFabricacao = vpd_loteFabricacao;
    }
}
