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
public class VpdClientes {
    private int vpd_id_cliente;
    private String vpd_nome;
    private String vpd_cpf;
    private Date vpd_data_nascimento;
    private String vpd_email;
    private String vpd_endereco;
    private String vpd_telefone;
    private String vpd_ativo;
    private Date vpd_data_cadastro;
    private int vpd_quantidade_maquinas;
    private String vpd_contrato;
    private String vpd_problemas_anteriores;
    private String vpd_tipo_perfil;
    private String vpd_genero_favorito;
    private String vpd_plataforma_preferida;
    
    public int getVpdIdClientes(){
        return vpd_id_cliente;
    }
    
    public void setVpdIdClientes(int vpd_id_cliente){
        this.vpd_id_cliente = vpd_id_cliente;
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
    
    public Date getVpdNascimento(){
        return vpd_data_nascimento;
    }
    
    public void setVpdNascimento(Date vpd_data_nascimento){
        this.vpd_data_nascimento = vpd_data_nascimento;
    }
    
    public String getVpdEmail(){
        return vpd_email;
    }
    
    public void setVpdEmail(String vpd_email){
        this.vpd_email = vpd_email;
    }
    
    public String getVpdEndereco(){
        return vpd_endereco;
    }
    
    public void setVpdEndereco(String vpd_endereco){
        this.vpd_endereco = vpd_endereco;
    }
    
    public String getVpdTelefone(){
        return vpd_telefone;
    }
    
    public void setVpdTelefone(String vpd_telefone){
        this.vpd_telefone = vpd_telefone;
    }
    
    public String getVpdAtivo(){
        return vpd_ativo;
    }
    
    public void setVpdAtivo(String vpd_ativo){
        this.vpd_ativo = vpd_ativo;
    }
    
    public Date getVpdCadastro(){
        return vpd_data_cadastro;
    }
    
    public void setVpdCadastro(Date vpd_data_cadastro){
        this.vpd_data_cadastro = vpd_data_cadastro;
    }
    
    public int getVpdQuantidade(){
        return vpd_quantidade_maquinas;
    }
    
    public void setVpdQuantidade(int vpd_quantidade_maquinas){
        this.vpd_quantidade_maquinas = vpd_quantidade_maquinas;
    }
    
    public String getVpdContrato(){
        return vpd_contrato;
    }
    
    public void setVpdContrato(String vpd_contrato){
        this.vpd_contrato = vpd_contrato;
    }
    
    public String getVpdProblemas(){
        return vpd_problemas_anteriores;
    }
    
    public void setVpdProblemas(String vpd_problemas_anteriores){
        this.vpd_problemas_anteriores = vpd_problemas_anteriores;
    }
    
    public String getVpdPerfil(){
        return vpd_tipo_perfil;
    }
    
    public void setVpdPerfil(String vpd_tipo_perfil){
        this.vpd_tipo_perfil = vpd_tipo_perfil;
    }
    
    public String getVpdGeneroFav(){
        return vpd_genero_favorito;
    }
    
    public void setVpdGeneroFav(String vpd_genero_favorito){
        this.vpd_genero_favorito = vpd_genero_favorito;
    }
    
    public String getVpdPlataformaPref(){
        return vpd_plataforma_preferida;
    }
    
    public void setVpdPlataformaPref(String vpd_plataforma_preferida){
        this.vpd_plataforma_preferida = vpd_plataforma_preferida;
    }
}
