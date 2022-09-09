package Exercicios;

//b. L2 = { w e {a,b}* | w possui aaa como subcadeia}
public class LetraB implements Automato {
    private String cadeia;
    private String console;
    private int index;

    public LetraB(String cadeia) {
        this.cadeia = cadeia;
        this.console = "";
        this.index = 0;
    }

    @Override
    public String resolverAutomato() {
        this.console = Constants.getEnumExerA() + Constants.getLabelSaida() + this.estado0();
        return this.console;
    }
    
    private String estado0() {
        if(this.index < this.cadeia.length()){
            char c = this.cadeia.charAt(this.index);
            if(c == 'a'){
                this.index++;
                return  c + ", q0 -> q1\n" + this.estado1();
            }
            else if(c == 'b') {
                this.index++;
                return  c + ", q0 -> q0\n" + this.estado0();
            }
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
                return  c + ", q1 -> q0\n" + this.estado0();
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
                return c + ", q2 -> q3\n" + this.estado3();
            else if(c == 'b') 
                return  c + ", q2 -> q0\n" + this.estado0();
            else
                return "Erro em q2 (" + c + ")\n" + Constants.getLabelCondicaoNaoAceita();
        } else 
            return "Erro em q2\n" + Constants.getLabelCondicaoNaoAceita();
    }
    
    private String estado3() {
        if(this.index < this.cadeia.length()){
            char c = this.cadeia.charAt(this.index);
            this.index++;
            
            if(c == 'a' || c == 'b')
                return c + ", q3 -> q3\n" + this.estado3();
            else
                return "Erro em q3 (" + c + ")\n" + Constants.getLabelCondicaoNaoAceita();
        } else if (this.index == this.cadeia.length()){
            return Constants.getLabelCondicaoAceita();
        } else 
            return "Erro em q3\n" + Constants.getLabelCondicaoNaoAceita();
    }
}
