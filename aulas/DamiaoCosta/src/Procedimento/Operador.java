/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Procedimento;

import javax.swing.JOptionPane;

public class Operador {

    void soma() {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor A: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor B: "));
        int soma = a + b;
        JOptionPane.showMessageDialog(null, "O valor da soma" + soma);
    }

    void subtracao() {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor A: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor B: "));
        int subtracao = a - b;
        JOptionPane.showMessageDialog(null, "O valor da soma" + subtracao);
    }

    void divisao() {
        Double a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor A: "));
        Double b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor B: "));
        Double divisao = a / b;
        JOptionPane.showMessageDialog(null, "O valor da soma" + divisao);
    }

     void multiplicacao() {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor A: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor B: "));
        int multiplicacao = a * b;
        JOptionPane.showMessageDialog(null, "O valor da soma" + multiplicacao);
    }

}
