/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv1too;

/**
 *
 * @author User
 */
public abstract class Pessoa {
    private String nome;
    private String sobrenome;
    private String cpf;
    private String rg;
    
    
    //método get de nome
    public String getNome(){
        return this.nome;
    }
     //método set de nome
    public void setNome(String nome) {
        if (nome != "") {
            this.nome = nome;
        }
    }
    
    //método get de sobrenome
    public String getSobrenome(){
        return this.sobrenome;
    }
    
    //método set de sobrenome
    public void setSobrenome(String sobrenome){
        if(sobrenome !=""){
            this.sobrenome = sobrenome;
        }
    }
    
    //método get de cpf
    public String getCpf(){
        return this.cpf;
    }
    
    //método set de cpf
    public void setCpf(String cpf){
        if(this.cpf !=""){
            this.cpf = cpf;
        }
    }
    
    //método get de rg
    public String getRg(){
        return this.rg;
    }
    
    //método set de rg
    public void setRg(String rg){
        if(this.rg !=""){
            this.rg = rg; 
        }
    } 
    
    //método abstract de senha
    public abstract boolean logar(String senha);
}
