package Exercicios;

public class Constants {
    private static final String labelCondicaoNaoAceita = "Condição Não Aceita!\n";
    private static final String labelCondicaoAceita = "Condição Aceita\n";
    private static final String labelSaida = "----------------------Saída----------------------\n\n";
    
    private static final String alfaE1 = "E1={a, b}\n";
    private static final String alfaE2 = "E2={a, b, c, ..., z}\n";
    private static final String alfaE3 = "E3={0, 1, 2, ..., 9}\n";
    
    private static final String enumExerA = "Exercício A\n" + alfaE1 + "L1 = { w e E1* | w começa com a e termina com b }\n";
    private static final String enumExerB = "Exercício B\n" + alfaE1 + "L2 = { w e E1* | w possui aaa como subcadeia}\n";
    private static final String enumExerC = "Exercício C\n" + alfaE1 + "L3 = { w e E1* | w possui baba como prefixo e abab como sufixo }\n";
    private static final String enumExerD = "Exercício D\n" + alfaE1 + "L4 = { w e E1* | w possui no máximo uma ocorrência da cadeia baba }\n";
    private static final String enumExerE = "Exercício E\n" + alfaE1 + "L5 = { w e E1* | w não possui ocorrência da cadeia baba }\n";
    private static final String enumExerF = "Exercício F\n" + alfaE1 + "L6 = { w e E1* | w possui ocorrência par de a 's seguida por ocorrência impar de b 's}\n";
    private static final String enumExerG = "Exercício G\n" + alfaE2 + "L7 = { w e E2* | w começa com a e possui ocorrência par de a 's ou começa com b e possui ocorrência impar de b 's }\n";
    private static final String enumExerH = "Exercício H\n" + alfaE3 + "L8 = { w e E3* | w inicia-se com 0 e a soma de todos os seus dígitos é par, ou inicia-se com 1 e a soma de todos os seus dígitos é impar}\n";
    private static final String enumExerI = "Exercício I\n" + alfaE2 + "L9 = { w e (E2 U E3)* | w inicia-se com uma letra, possuindo a seguir qualquer combinação de letras e dígitos}\n";
    private static final String enumExerJ = "Exercício J\n" + alfaE3 + "L10 = { w e E3* U {+,-, e, ‘,’}| w é um número inteiro, um número decimal ou um número representado em notação científica}\n";
 
    public static String getLabelCondicaoNaoAceita() {
        return labelCondicaoNaoAceita;
    }

    public static String getLabelCondicaoAceita() {
        return labelCondicaoAceita;
    }

    public static String getLabelSaida() {
        return labelSaida;
    }
    
    public static String getEnumExerA() {
        return enumExerA;
    }

    public static String getEnumExerB() {
        return enumExerB;
    }

    public static String getEnumExerC() {
        return enumExerC;
    }

    public static String getEnumExerD() {
        return enumExerD;
    }

    public static String getEnumExerE() {
        return enumExerE;
    }

    public static String getEnumExerF() {
        return enumExerF;
    }

    public static String getEnumExerG() {
        return enumExerG;
    }

    public static String getEnumExerH() {
        return enumExerH;
    }

    public static String getEnumExerI() {
        return enumExerI;
    }

    public static String getEnumExerJ() {
        return enumExerJ;
    }
    
    
}
