/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author 04590876060
 */
public class Doenca {
    private int id_doenca;
    private String nome;
    private String descricao;
    
    public int getId(){
        return id_doenca;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getDescricao(){
        return descricao;
    }
    
    public void setId(int id_doenca){
        this.id_doenca=id_doenca;
    }
    
    public void setNome(String nome){
        this.nome=nome;
    }
    
    public void setDescricao(String descricao){
        this.descricao=descricao;
    }
}
