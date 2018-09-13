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
public class Atv1TOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Medico m = new Medico();
        System.out.println("******* Médico *******");
        m.setNome("Elias");
        //System.out.println("Nome: " + m.getNome());
        m.setSobrenome("Rodrigues");
        m.setCpf("999.999.999-99");
        m.setRg("999.999.999-9");
        //m.logar("elias");
        m.setEspecialidade("Não sei");
        m.setCrm(89);
        m.setSenhaMedico("elias");
        m.logar("elias");
        
        //Paciente 
        System.out.println("******* Paciente *******");
        Paciente p = new Paciente();
        p.setNome("Elizeu");
        //System.out.println("Nome: " + p.getNome());
        p.setSobrenome("Rodrigues");
        p.setCpf("999.999.998-99");
        p.setRg("999.999.998-9");
        //p.logar("elizeu");
        p.setCodPaciente(1);
        p.setSenhaPaciente("elizeu");
        m.logar("elizeu");
        
        //Enfermeiro
        System.out.println("******* Enfermeiro *******");
        Enfermeiro e = new Enfermeiro();
        e.setNome("Bruno");
        //System.out.println("Nome: " + e.getNome());
        e.setSobrenome("Rodrigues");
        e.setCpf("999.999.997-99");
        e.setRg("999.999.997-9");
        e.setCorem(90);
        //e.logar("bruno");
        e.setSenhaEnfermeiro("bruno");
        e.logar("bruno");
    }
    
}
