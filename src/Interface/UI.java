package Interface;

import Exercicios.*;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class UI extends javax.swing.JFrame {
    public UI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtp_Enunciado = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtp_console = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();
        jcb_exercicio = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtp_input = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1265, 675));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setText("Trabalho Implementação de Autômatos de Estado Finito");

        jtp_Enunciado.setEditable(false);
        jtp_Enunciado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtp_Enunciado.setText("E1 = {a, b}, \nE2 = {a, b, c, ... ,z}\nE3 = {0, 1, 2, ... , 9} \n\na. L1 = { w e E1* | w começa com a e termina com b } \nb. L2 = { w e E1* | w possui aaa como subcadeia}  \nc. L3 = { w e E1* | w possui baba como prefixo e abab como sufixo } \nd. L4 = { w e E1* | w possui no máximo uma ocorrência da cadeia baba } \ne. L5 = { w e E1* | w não possui ocorrência da cadeia baba } \nf. L6 = { w e E1* | w possui ocorrência par de a 's seguida por ocorrência impar de b 's} \ng. L7 = { w e E2* | w começa com a e possui ocorrência par de a 's ou começa com b e possui ocorrência impar de b 's }  \nh. L8 = { w e E3* | w inicia-se com 0 e a soma de todos os seus dígitos é par, ou inicia-se com 1 e a soma de todos os seus dígitos é impar} \ni. L9 = { w e (E2 U E3)* | w inicia-se com uma letra, possuindo a seguir qualquer combinação de letras e dígitos}\nj. L10 = { w e E3* U {+,-, e, ‘,’}| w é um número inteiro, um número decimal ou um número representado em notação científica} ");
        jtp_Enunciado.setMargin(new java.awt.Insets(6, 6, 6, 6));
        jScrollPane2.setViewportView(jtp_Enunciado);

        jtp_console.setEditable(false);
        jtp_console.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtp_console.setMargin(new java.awt.Insets(6, 6, 6, 6));
        jScrollPane3.setViewportView(jtp_console);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        jLabel2.setText("Exercício Escolhido:");

        jcb_exercicio.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jcb_exercicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Exercício A", "Exercício B", "Exercício C", "Exercício D", "Exercício E", "Exercício F", "Exercício G", "Exercício H", "Exercício I", "Exercício J" }));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        jButton1.setText("Validar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jtp_input.setColumns(20);
        jtp_input.setFont(new java.awt.Font("Monospaced", 0, 22)); // NOI18N
        jtp_input.setLineWrap(true);
        jtp_input.setRows(2);
        jtp_input.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jtp_input.setMinimumSize(new java.awt.Dimension(3, 3));
        jScrollPane5.setViewportView(jtp_input);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/help.png"))); // NOI18N
        jButton2.setMargin(new java.awt.Insets(4, 4, 4, 4));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(141, 141, 141)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jcb_exercicio, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 825, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcb_exercicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        switch(jcb_exercicio.getSelectedIndex()){
            case 0:{
                //EXERCICIO A
                LetraA letraA = new LetraA(jtp_input.getText());
                jtp_console.setText(letraA.resolverAutomato());
                break;
            }
            case 1:{
                //EXERCICIO B
                LetraB letraB = new LetraB(jtp_input.getText());
                jtp_console.setText(letraB.resolverAutomato());
                break;
            }
            case 3:{
                //EXERCICIO D
                LetraD letraD = new LetraD(jtp_input.getText());
                jtp_console.setText(letraD.resolverAutomato());
                break;
            }
            case 4:{
                //EXERCICIO E
                LetraE letraE = new LetraE(jtp_input.getText());
                jtp_console.setText(letraE.resolverAutomato());
                break;
            }
            case 6:{
                //EXERCICIO G
                LetraG letraG = new LetraG(jtp_input.getText());
                jtp_console.setText(letraG.resolverAutomato());
                break;
            }
            case 7:{
                //EXERCICIO H
                LetraH letraH = new LetraH(jtp_input.getText());
                jtp_console.setText(letraH.resolverAutomato());
                break;
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //JOptionPane.showMessageDialog(null,"Eggs are not supposed to be green.","",1,);
        JLabel label = new JLabel("Autores: Felipe Costa Godoi"
                + ", Guilherme Rodrigues de Melo, Paulo Victor Ferreira da Cruz.");
        label.setFont(new Font("Arial", Font.PLAIN, 22));
        JOptionPane.showMessageDialog(null,label,"Sobre o Aplicativo",
                JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton2ActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JComboBox<String> jcb_exercicio;
    private javax.swing.JTextPane jtp_Enunciado;
    private javax.swing.JTextPane jtp_console;
    private javax.swing.JTextArea jtp_input;
    // End of variables declaration//GEN-END:variables
}
