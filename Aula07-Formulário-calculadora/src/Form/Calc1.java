/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Form;

/**
 *
 * @author CAMARGO
 */
public class Calc1 extends javax.swing.JFrame {

    /**
     * Creates new form Calc1
     */
    public Calc1() {
        initComponents();
        Desabilitar();
    }

    void Desabilitar() {
        txt_N1.setEditable(false);
        txt_N2.setEditable(false);
        txt_Resultado.setEditable(false);

    }

    void Habilitar() {
        txt_N1.setEditable(true);
        txt_N2.setEditable(true);
        txt_Resultado.setEditable(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        jColorChooser2 = new javax.swing.JColorChooser();
        txt_N2 = new javax.swing.JTextField();
        txt_Resultado = new javax.swing.JTextField();
        btn_Soma = new javax.swing.JButton();
        btn_Subtracao = new javax.swing.JButton();
        btn_Multiplica = new javax.swing.JButton();
        btn_Divide = new javax.swing.JButton();
        btn_Novo = new javax.swing.JButton();
        btn_Limpar = new javax.swing.JButton();
        btn_Sair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_N1 = new javax.swing.JTextField();
        btn_Retornar = new javax.swing.JButton();
        btn_Comparar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 102));

        txt_N2.setToolTipText("");

        txt_Resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ResultadoActionPerformed(evt);
            }
        });

        btn_Soma.setText("+");
        btn_Soma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SomaActionPerformed(evt);
            }
        });

        btn_Subtracao.setText("-");
        btn_Subtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SubtracaoActionPerformed(evt);
            }
        });

        btn_Multiplica.setText("*");
        btn_Multiplica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MultiplicaActionPerformed(evt);
            }
        });

        btn_Divide.setText("/");
        btn_Divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DivideActionPerformed(evt);
            }
        });

        btn_Novo.setText("Novo");
        btn_Novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NovoActionPerformed(evt);
            }
        });

        btn_Limpar.setText("Limpar");
        btn_Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LimparActionPerformed(evt);
            }
        });

        btn_Sair.setText("Sair");
        btn_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SairActionPerformed(evt);
            }
        });

        jLabel1.setText("N1");

        jLabel2.setText("N2");

        jLabel3.setText("Resultado");

        btn_Retornar.setText("Retornar");
        btn_Retornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RetornarActionPerformed(evt);
            }
        });

        btn_Comparar.setText("Comparar");

        jLabel4.setText("Programação de computadores");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(52, 52, 52))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(16, 16, 16)))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_N2)
                            .addComponent(txt_N1)
                            .addComponent(txt_Resultado))
                        .addGap(168, 168, 168))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_Soma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Subtracao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Multiplica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Divide))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(btn_Novo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Limpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Sair)))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Comparar)
                    .addComponent(btn_Retornar))
                .addContainerGap(71, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_N1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_N2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Resultado))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Soma)
                    .addComponent(btn_Subtracao)
                    .addComponent(btn_Multiplica)
                    .addComponent(btn_Divide)
                    .addComponent(btn_Retornar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Novo)
                    .addComponent(btn_Limpar)
                    .addComponent(btn_Sair)
                    .addComponent(btn_Comparar)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SomaActionPerformed

        int x, y, z; // Variáveis de apoio
        String r; // R string para receber valor

        x = Integer.parseInt(txt_N1.getText()); //Mesclando o Campo com a variável
        y = Integer.parseInt(txt_N2.getText());

        z = x + y;//operação
        r = String.valueOf(z); // passando a variável para String para que o campo de texto seja

        txt_Resultado.setText(r);// Camppo de resposta recebendo valor
    }//GEN-LAST:event_btn_SomaActionPerformed

    private void btn_SubtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SubtracaoActionPerformed
        int x, y, z; // Variáveis de apoio
        String r; // R string para receber valor

        x = Integer.parseInt(txt_N1.getText()); //Mesclando o Campo com a variável
        y = Integer.parseInt(txt_N2.getText());

        z = x - y;//operação
        r = String.valueOf(z); // passando a variável para String para que o campo de texto seja

        txt_Resultado.setText(r);// Camppo de resposta recebendo valor
    }//GEN-LAST:event_btn_SubtracaoActionPerformed

    private void btn_MultiplicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MultiplicaActionPerformed
        // TODO add your handling code here:

        int x, y, z; // Variáveis de apoio
        String r; // R string para receber valor

        x = Integer.parseInt(txt_N1.getText()); //Mesclando o Campo com a variável
        y = Integer.parseInt(txt_N2.getText());

        z = x * y;//operação
        r = String.valueOf(z); // passando a variável para String para que o campo de texto seja

        txt_Resultado.setText(r);// Camppo de resposta recebendo valor
    }//GEN-LAST:event_btn_MultiplicaActionPerformed

    private void btn_DivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DivideActionPerformed
        // TODO add your handling code here:

        int x, y, z; // Variáveis de apoio
        String r; // R string para receber valor

        x = Integer.parseInt(txt_N1.getText()); //Mesclando o Campo com a variável
        y = Integer.parseInt(txt_N2.getText());

        z = x / y;//operação
        r = String.valueOf(z); // passando a variável para String para que o campo de texto seja

        txt_Resultado.setText(r);// Camppo de resposta recebendo valor
    }//GEN-LAST:event_btn_DivideActionPerformed

    private void btn_NovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NovoActionPerformed
        Habilitar();
    }//GEN-LAST:event_btn_NovoActionPerformed

    private void btn_LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LimparActionPerformed
        txt_N1.setText("");
        txt_N2.setText("");
        txt_Resultado.setText("");
    }//GEN-LAST:event_btn_LimparActionPerformed

    private void btn_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_SairActionPerformed

    private void txt_ResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ResultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ResultadoActionPerformed

    private void btn_RetornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RetornarActionPerformed
        Abertura Frame1 = new Abertura();

        Frame1.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_RetornarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calc1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calc1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calc1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calc1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calc1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Comparar;
    private javax.swing.JButton btn_Divide;
    private javax.swing.JButton btn_Limpar;
    private javax.swing.JButton btn_Multiplica;
    private javax.swing.JButton btn_Novo;
    private javax.swing.JButton btn_Retornar;
    private javax.swing.JButton btn_Sair;
    private javax.swing.JButton btn_Soma;
    private javax.swing.JButton btn_Subtracao;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JColorChooser jColorChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txt_N1;
    private javax.swing.JTextField txt_N2;
    private javax.swing.JTextField txt_Resultado;
    // End of variables declaration//GEN-END:variables
}
