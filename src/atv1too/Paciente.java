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
public class Paciente extends Pessoa {
    private int codPaciente;
    private String senhaPaciente;

    @Override
    public boolean logar(String senha) {
        boolean result;
        if(senha == this.senhaPaciente){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
    
    //método get para codPaciente
    public int getCodPaciente(){
        return this.codPaciente;
    }
    
    //método set para codPaciente
    public void setCodPaciente(int codPaciente){
        if(this.codPaciente != 0){
            this.codPaciente = codPaciente;
        }
    }
    
    //método get para senhaPaciente
    public String getSenhaPaciente(){
        return this.senhaPaciente;
    }
    
    //métrodo set para senhaPacientre
    
    //O método no diagrama esta como setSenhaFuncionario
    public void setSenhaPaciente(String senhaPaciente){
        if(this.senhaPaciente !=""){
            this.senhaPaciente = senhaPaciente;
        }
    }
    
}
