package Exercicios;

//e. L5 = { w e E1* | w não possui ocorrência da cadeia baba }
public class LetraE implements Automato {
    private String cadeia;
    private String console;
    private int index;

    public LetraE(String cadeia) {
        this.cadeia = cadeia;
        this.console = "";
        this.index = 0;
    }

    @Override
    public String resolverAutomato() {
        this.console = Constants.getEnumExerE() + Constants.getLabelSaida() + this.estado0();
        return this.console;
    }
    
    private String estado0() {
        if(this.index < this.cadeia.length()){
            char c = this.cadeia.charAt(this.index);
            this.index++;
            
            if(c == 'a')
                return  c + ", q0 -> q0\n" + this.estado0();
            else if(c == 'b') 
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
            
            if(c == 'a')
                return  c + ", q1 -> q2\n" + this.estado2();
            else if(c == 'b') 
                return  c + ", q1 -> q1\n" + this.estado1();
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
            
            if(c == 'a')
                return  c + ", q2 -> q0\n" + this.estado0();
            else if(c == 'b') 
                return  c + ", q2 -> q3\n" + this.estado3();
            else
                return "Erro em q2 (" + c + ")\n" + Constants.getLabelCondicaoNaoAceita();
        } else if (this.index == this.cadeia.length())
            return Constants.getLabelCondicaoAceita();
        else return "Erro em q2\n" + Constants.getLabelCondicaoNaoAceita();
    }
    
    private String estado3() {
        if(this.index < this.cadeia.length()){
            char c = this.cadeia.charAt(this.index);
            this.index++;
            
            if(c == 'a')
                return  c + ", q3 -> q4\n" + this.estado4();
            else if(c == 'b') 
                return  c + ", q3 -> q0\n" + this.estado0();
            else
                return "Erro em q3 (" + c + ")\n" + Constants.getLabelCondicaoNaoAceita();
        } else if (this.index == this.cadeia.length())
            return Constants.getLabelCondicaoAceita();
        else return "Erro em q3\n" + Constants.getLabelCondicaoNaoAceita();
    }
    
    private String estado4() {
        if(this.index < this.cadeia.length()){
            char c = this.cadeia.charAt(this.index);
            this.index++;
            
            if(c == 'a' || c == 'b')
                return c + ", q4 -> q4\n" + this.estado4();
            else
                return "Erro em q4 (" + c + ")\n" + Constants.getLabelCondicaoNaoAceita();
        } else if (this.index == this.cadeia.length()){
            return Constants.getLabelCondicaoNaoAceita();
        } else 
            return "Erro em q4\n" + Constants.getLabelCondicaoNaoAceita();
    }
}