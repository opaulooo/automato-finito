package Exercicios;

public class LetraG implements Automato{
	private String cadeia;
    private String console;
    private int index;
    private String alfabeto;

    public LetraG(String cadeia) {
        this.cadeia = cadeia;
        this.console = "";
        this.index = 0;
        this.alfabeto = "abcdefghijklmnopqrstuvxyzw";
    }

    @Override
    public String resolverAutomato() {
    	this.console = Constants.getEnumExerG() + Constants.getLabelSaida() + this.estado0();
        return this.console;
    }
    
    public String estado0() {
    	if (this.index < this.cadeia.length()) {
    		char c = this.cadeia.charAt(this.index);
            this.index++;
            
            if (c == 'a') {
            	return  c + ", q0 -> q1\n" + this.estado1();
            } else if (c == 'b') {
            	return  c + ", q0 -> q3\n" + this.estado3();
            } else if (this.alfabeto.indexOf(c) != -1) {
            	return  c + ", q0 -> q5\n" + this.estado5();
            } else {
            	return "Erro em q0 (" + c + ")\n" + Constants.getLabelCondicaoNaoAceita();
            }
    	} else return "Erro em q0\n" + Constants.getLabelCondicaoNaoAceita();
    }
    
    public String estado1() {
    	if (this.index < this.cadeia.length()) {
    		char c = this.cadeia.charAt(this.index);
            this.index++;
            
            if (c == 'a') {
            	return  c + ", q1 -> q2\n" + this.estado2();
            } else if (c == 'b') {
            	return  c + ", q1 -> q1\n" + this.estado1();
            } else if (this.alfabeto.indexOf(c) != -1) {
            	return  c + ", q1 -> q2\n" + this.estado2();
            } else {
            	return "Erro em q1 (" + c + ")\n" + Constants.getLabelCondicaoNaoAceita();
            }
    	} else return "Erro em q1\n" + Constants.getLabelCondicaoNaoAceita();
    }
    
    public String estado2() {
    	if (this.index < this.cadeia.length()) {
    		char c = this.cadeia.charAt(this.index);
            this.index++;
            
            if (c == 'a') {
            	return  c + ", q2 -> q1\n" + this.estado1();
            } else if (c == 'b') {
            	return  c + ", q2 -> q2\n" + this.estado2();
            } else if (this.alfabeto.indexOf(c) != -1) {
            	return  c + ", q2 -> q2\n" + this.estado2();
            } else {
            	return "Erro em q2 (" + c + ")\n" + Constants.getLabelCondicaoNaoAceita();
            }
    	} else if (this.index == this.cadeia.length()){
            return Constants.getLabelCondicaoAceita();
    	} else return "Erro em q2\n" + Constants.getLabelCondicaoNaoAceita();
    }
    
    public String estado3() {
    	if (this.index < this.cadeia.length()) {
    		char c = this.cadeia.charAt(this.index);
            this.index++;
            
            if (c == 'a') {
            	return  c + ", q3 -> q3\n" + this.estado3();
            } else if (c == 'b') {
            	return  c + ", q3 -> q4\n" + this.estado4();
            } else if (this.alfabeto.indexOf(c) != -1) {
            	return  c + ", q3 -> q3\n" + this.estado3();
            } else {
            	return "Erro em q3 (" + c + ")\n" + Constants.getLabelCondicaoNaoAceita();
            }
    	} else if (this.index == this.cadeia.length()){
            return Constants.getLabelCondicaoAceita();
    	}
    	else return "Erro em q3\n" + Constants.getLabelCondicaoNaoAceita();
    }
    
    public String estado4() {
    	if (this.index < this.cadeia.length()) {
    		char c = this.cadeia.charAt(this.index);
            this.index++;
            
            if (c == 'a') {
            	return  c + ", q4 -> q4\n" + this.estado4();
            } else if (c == 'b') {
            	return  c + ", q4 -> q3\n" + this.estado3();
            } else if (this.alfabeto.indexOf(c) != -1) {
            	return  c + ", q4 -> q4\n" + this.estado4();
            } else {
            	return "Erro em q4 (" + c + ")\n" + Constants.getLabelCondicaoNaoAceita();
            }
    	} else return "Erro em q4\n" + Constants.getLabelCondicaoNaoAceita();
    }
    
    public String estado5() {
    	if (this.index < this.cadeia.length()) {
    		char c = this.cadeia.charAt(this.index);
            this.index++;
            
            if (c == 'a') {
            	return  c + ", q5 -> q5\n" + this.estado5();
            } else if (c == 'b') {
            	return  c + ", q5 -> q5\n" + this.estado5();
            } else if (this.alfabeto.indexOf(c) != -1) {
            	return  c + ", q5 -> q5\n" + this.estado5();
            } else {
            	return "Erro em q5 (" + c + ")\n" + Constants.getLabelCondicaoNaoAceita();
            }
    	} else return "Erro em q5\n" + Constants.getLabelCondicaoNaoAceita();
    }
}
