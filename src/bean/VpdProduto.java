/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

/**
 *
 * @author u08538003160
 */
public class VpdProduto {
    private int vpd_id_produto;
    private int vpd_fk_fornecedores;
    private String vpd_nome;
    private String vpd_ficha_tecnica;
    private int vpd_valor_diaria;
    private String vpd_disponivel;
    private String vpd_processador;
    private String vpd_placaVideo;
    private String vpd_memoriaRam;
    private String vpd_armazenamento;
    
    public int getVpdIdProduto(){
        return vpd_id_produto;
    }
    
    public void setVpdIdProduto(int vpd_id_produto){
        this.vpd_id_produto = vpd_id_produto;
    }
    
    public int getVpdFkFornecedor(){
        return vpd_fk_fornecedores;
    }
    
    public void setVpdFkFornecedor(int vpd_fk_fornecedores){
        this.vpd_fk_fornecedores = vpd_fk_fornecedores;
    }
    
    public String getVpdNome(){
        return vpd_nome;
    }
    
    public void setVpdNome(String vpd_nome){
        this.vpd_nome = vpd_nome;
    }
    
    public String getVpdFichaTecnica(){
        return vpd_ficha_tecnica;
    }
    
    public void setVpdFichaTecnica(String vpd_ficha_tecnica){
        this.vpd_ficha_tecnica = vpd_ficha_tecnica;
    }
    
    public int getVpdValorDiaria(){
        return vpd_valor_diaria;
    }
    
    public void setVpdValorDiaria(int vpd_valor_diaria){
        this.vpd_valor_diaria = vpd_valor_diaria;
    }
    
    public String getVpdDisponivel(){
        return vpd_disponivel;
    }
    
    public void setVpdDisponivel(String vpd_disponivel){
        this.vpd_disponivel = vpd_disponivel;
    }
    
    public String getVpdProcessador(){
        return vpd_processador;
    }
    
    public void setVpdProcessador(String vpd_processador){
        this.vpd_processador = vpd_processador;
    }
    
    public String getVpdPlacaVideo(){
        return vpd_placaVideo;
    }
    
    public void setVpdPlacaVideo(String vpd_placaVideo){
        this.vpd_placaVideo = vpd_placaVideo;
    }
    
    public String getVpdMemoriaRam(){
        return vpd_memoriaRam;
    }
    
    public void setVpdMemoriaRam(String vpd_memoriaRam){
        this.vpd_memoriaRam = vpd_memoriaRam;
    }
    
    public String getVpdArmazenamento(){
        return vpd_armazenamento;
    }
    
    public void setVpdArmazenamento(String vpd_armazenamento){
        this.vpd_armazenamento = vpd_armazenamento;
    }
}
