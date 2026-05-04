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
public class VpdUsuarios {
    private int vpd_id_usuario;
    private String vpd_nome;
    private String vpd_apelido;
    private String vpd_cpf;
    private Date vpd_dataNascimento;
    private String vpd_senha;
    private int vpd_nivel;
    private String vpd_ativo;
    
    public int getVpdIdUsuarios() {
        return vpd_id_usuario;
    }
    
    public void setVpdIdUsuarios(int vpd_id_usuario){
        this.vpd_id_usuario = vpd_id_usuario;
    }
    
    public String getVpdNome() {
        return vpd_nome;
    }
    
    public void setVpdNome(String vpd_nome){
        this.vpd_nome = vpd_nome;
    }
    
    public String getVpdApelido() {
        return vpd_apelido;
    }
    
    public void setVpdApelido(String vpd_apelido){
        this.vpd_apelido = vpd_apelido;
    }
    
    public String getVpdCpf() {
        return vpd_cpf;
    }
    
    public void setVpdIdCpf(String vpd_cpf){
        this.vpd_cpf = vpd_cpf;
    }
    
    public Date getVpdNascimento() {
        return vpd_dataNascimento;
    }
    
    public void setVpdNascimento(Date vpd_dataNascimento){
        this.vpd_dataNascimento = vpd_dataNascimento;
    }
    
    public String getVpdSenha() {
        return vpd_senha;
    }
    
    public void setVpdIdSenha(String vpd_senha){
        this.vpd_senha = vpd_senha;
    }
    
    public int getVpdNivel() {
        return vpd_nivel;
    }
    
    public void setVpdIdNivel(int vpd_nivel){
        this.vpd_nivel = vpd_nivel;
    }
    
    public String getVpdAtivo() {
        return vpd_ativo;
    }
    
    public void setVpdIdAtivo(String vpd_ativo){
        this.vpd_ativo = vpd_ativo;
    }
}
