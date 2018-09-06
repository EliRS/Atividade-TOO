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
public class Enfermeiro extends Pessoa {

    private int corem;
    private double salario;
    private String senhaEnfermeiro;
    
    @Override
    public boolean logar(String senha) {
       boolean result;
       if(senha == this.senhaEnfermeiro){
           result = true;
       }else{
           result = false;
       }
       return result;
    }
    
    public int getCorem(){
        return this.corem;
    }
    
    public void setCorem(int corem){
        this.corem = corem;
    }
    
    public String getSenhaEnfermeiro(){
        return this.senhaEnfermeiro;
    }
    
    public void setSenhaEnfermeiro(String senhaEnfermeiro){
        this.senhaEnfermeiro = senhaEnfermeiro;
    }
}
