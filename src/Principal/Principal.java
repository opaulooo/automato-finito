package Principal;

import Interface.UI;

public class Principal {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        UI ui = new UI();
        ui.setTitle("Trabalho Implementação de Autômatos de Estado Finito");
        ui.setLocationRelativeTo(null);
        ui.setVisible(true);
        
    }
}
