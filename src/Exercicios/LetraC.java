/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios;

/**
 *
 * @author paulo
 */
public class LetraC implements Automato {
    
    private String cadeia;
    private String console;
    private int index;

    public LetraC(String cadeia) {
        this.cadeia = cadeia;
        this.console = "";
        this.index = 0;
    }

    @Override
    public String resolverAutomato() {
        this.console = Constants.getEnumExerB() + Constants.getLabelSaida() + this.estado0();
        return this.console;
    }
    
    private String estado0() {
        if(this.index < this.cadeia.length()){
            char c = this.cadeia.charAt(this.index);
            this.index++;
            
            if(c == 'a')
                return  c + ", q0 -> q8\n" + this.estado8();
            else if(c == 'b') 
                return  c + ", q0 -> q1\n" + this.estado1();
            else
                return "Erro em q0 (" + c + ")\n" + Constants.getLabelCondicaoNaoAceita();
        } else return "Erro em q0\n" + Constants.getLabelCondicaoNaoAceita();
    }
    
    private String estado1() {
        if(this.index < this.cadeia.length()){
            char c = this.cadeia.charAt(this.index);
            this.index++;
            
            if(c == 'a')
                return c + ", q1 -> q2\n" + this.estado2();
            else if(c == 'b') 
                return  c + ", q1 -> q8\n" + this.estado8();
            else
                return "Erro em q1 (" + c + ")\n" + Constants.getLabelCondicaoNaoAceita();
        } else 
            return "Erro em q1\n" + Constants.getLabelCondicaoNaoAceita();
    }
    
    private String estado2() {
        if(this.index < this.cadeia.length()){
            char c = this.cadeia.charAt(this.index);
            this.index++;
            
            if(c == 'a')
                return c + ", q2 -> q8\n" + this.estado8();
            else if(c == 'b') 
                return  c + ", q2 -> q3\n" + this.estado3();
            else
                return "Erro em q2 (" + c + ")\n" + Constants.getLabelCondicaoNaoAceita();
        } else 
            return "Erro em q2\n" + Constants.getLabelCondicaoNaoAceita();
    }
    
    private String estado3() {
        if(this.index < this.cadeia.length()){
            char c = this.cadeia.charAt(this.index);
            this.index++;
            
            if(c == 'a')
                return c + ", q3 -> q4\n" + this.estado4();
            else if(c == 'b')
                return c + ", q3 -> q8\n" + this.estado8();
            else
                return "Erro em q3 (" + c + ")\n" + Constants.getLabelCondicaoNaoAceita();
        } else if (this.index == this.cadeia.length()){
            return "Erro em q8\n" + Constants.getLabelCondicaoNaoAceita();
        } else 
            return "Erro em q3\n" + Constants.getLabelCondicaoNaoAceita();
    }
    
    private String estado4() {
        if(this.index < this.cadeia.length()){
            char c = this.cadeia.charAt(this.index);
            this.index++;
            
            if(c == 'a')
                return c + ", q4 -> q4\n" + this.estado4();
            else if(c == 'b')
                return c + ", q4 -> q5\n" + this.estado5();
            else
                return "Erro em q4 (" + c + ")\n" + Constants.getLabelCondicaoNaoAceita();
        } else if (this.index == this.cadeia.length()){
            return "Erro em q8\n" + Constants.getLabelCondicaoNaoAceita();
        } else 
            return "Erro em q4\n" + Constants.getLabelCondicaoNaoAceita();
    }
    
    private String estado5() {
        if(this.index < this.cadeia.length()){
            char c = this.cadeia.charAt(this.index);
            this.index++;
            
            if(c == 'a')
                return c + ", q5 -> q6\n" + this.estado6();
            else if(c == 'b')
                return c + ", q5 -> q4\n" + this.estado4();
            else
                return "Erro em q5 (" + c + ")\n" + Constants.getLabelCondicaoNaoAceita();
        } else if (this.index == this.cadeia.length()){
            return "Erro em q8\n" + Constants.getLabelCondicaoNaoAceita();
        } else 
            return "Erro em q5\n" + Constants.getLabelCondicaoNaoAceita();
    }
    
    private String estado6() {
        if(this.index < this.cadeia.length()){
            char c = this.cadeia.charAt(this.index);
            this.index++;
            
            if(c == 'a')
                return c + ", q6 -> q4\n" + this.estado4();
            else if(c == 'b')
                return c + ", q6 -> q7\n" + this.estado7();
            else
                return "Erro em q6 (" + c + ")\n" + Constants.getLabelCondicaoNaoAceita();
        } else if (this.index == this.cadeia.length()){
            return "Erro em q8\n" + Constants.getLabelCondicaoNaoAceita();
        } else 
            return "Erro em q6\n" + Constants.getLabelCondicaoNaoAceita();
    }
    
    private String estado7() {
        if(this.index < this.cadeia.length()){
            char c = this.cadeia.charAt(this.index);
            this.index++;
            
            if(c == 'a')
                return c + ", q7 -> q6\n" + this.estado6();
            else if(c == 'b')
                return c + ", q7 -> q5\n" + this.estado5();
            else
                return "Erro em q7 (" + c + ")\n" + Constants.getLabelCondicaoNaoAceita();
        } else if (this.index == this.cadeia.length()){
            return Constants.getLabelCondicaoAceita();
        } else 
            return "Erro em q7\n" + Constants.getLabelCondicaoNaoAceita();
    }
    
    private String estado8() {
        if(this.index < this.cadeia.length()){
            char c = this.cadeia.charAt(this.index);
            this.index++;
            
            if(c == 'a' || c == 'b')
                return c + ", q8 -> q8\n" + this.estado8();
            else
                return "Erro em q8 (" + c + ")\n" + Constants.getLabelCondicaoNaoAceita();
        } else if (this.index == this.cadeia.length()){
            return Constants.getLabelCondicaoAceita();
        } else 
            return "Erro em q8\n" + Constants.getLabelCondicaoNaoAceita();
    }
}
