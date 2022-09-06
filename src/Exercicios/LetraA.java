package Exercicios;

public class LetraA implements Automato {
    private String cadeia;
    private String console;

    public LetraA(String cadeia) {
        this.cadeia = cadeia;
        this.console = "";
    }

    @Override
    public String resolverAutomato() {
        this.console = this.cadeia + " Passou!";
        return this.console;
    }
    
}
