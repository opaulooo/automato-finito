package Exercicios;

//e. L5 = { w e E1* | w não possui ocorrência da cadeia baba }

import java.util.ArrayList;

public class LetraH implements Automato {
    private String cadeia;
    private String console;
    private int index;

    public LetraH(String cadeia) {
        
        this.cadeia = cadeia;
        this.console = "";
        this.index = 0;
    }

    @Override
    public String resolverAutomato() {
        this.console = Constants.getEnumExerH() + Constants.getLabelSaida() + this.estado0();
        return this.console;
    }
    
    private String estado0() {
        if(this.index < this.cadeia.length()){
            char c = this.cadeia.charAt(this.index);
            this.index++;
            
            if(this.EhImpar(c) || this.EhPar(c))
                return  c + ", q0 -> q1\n" + this.estado1();
            else
                return "Erro em q0 (" + c + ")\n" + Constants.getLabelCondicaoNaoAceita();
        } else if (this.index == this.cadeia.length())
            return Constants.getLabelCondicaoAceita();
        else return "Erro em q0\n" + Constants.getLabelCondicaoNaoAceita();
    }
    
    private String estado1() {
        if(this.index < this.cadeia.length()){
            char c = this.cadeia.charAt(this.index);
            this.index++;
            
            if(this.EhPar(c))
                return  c + ", q1 -> q1\n" + this.estado1();
            else if(this.EhImpar(c)) 
                return  c + ", q1 -> q2\n" + this.estado2();
            else
                return "Erro em q1 (" + c + ")\n" + Constants.getLabelCondicaoNaoAceita();
        } else if (this.index == this.cadeia.length())
            return Constants.getLabelCondicaoAceita();
        else return "Erro em q1\n" + Constants.getLabelCondicaoNaoAceita();
    }
    
    private String estado2() {
        if(this.index < this.cadeia.length()){
            char c = this.cadeia.charAt(this.index);
            this.index++;
            
            if(this.EhImpar(c))
                return  c + ", q2 -> q1\n" + this.estado1();
            else if(this.EhPar(c)) 
                return  c + ", q2 -> q2\n" + this.estado2();
            else
                return "Erro em q2 (" + c + ")\n" + Constants.getLabelCondicaoNaoAceita();
        } else if (this.index == this.cadeia.length())
            return Constants.getLabelCondicaoNaoAceita();
        else return "Erro em q2\n" + Constants.getLabelCondicaoNaoAceita();
    }    
    
    private boolean EhPar(char num){
       if(num == '0' || num == '2' || num == '4' || num == '6' || num == '8')
           return true;
       
       return false;
    }
    
    private boolean EhImpar(char num){
       if(num == '1' || num == '3' || num == '5' || num == '7' || num == '9')
           return true;
       
       return false;
    }
}
