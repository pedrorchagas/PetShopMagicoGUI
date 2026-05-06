/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.psgd.petshop;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author pedrorchagas
 */
public class PetShopMagico {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(PetShopMagico::criarTela);
    }

    private static void criarTela() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            // Fallback: segue com o tema padrao do Swing.
        }

        JFrame frame = new JFrame("Pet Shop Magico");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(720, 420);
        frame.setLocationRelativeTo(null);

        JLabel titulo = new JLabel("Bem-vindo ao Pet Shop Magico", SwingConstants.CENTER);
        titulo.setFont(new Font("SansSerif", Font.BOLD, 24));

        JButton botao = new JButton("Agendar banho e tosa");

        JPanel painel = new JPanel(new BorderLayout(0, 16));
        painel.add(titulo, BorderLayout.CENTER);
        painel.add(botao, BorderLayout.SOUTH);

        frame.setContentPane(painel);
        frame.setVisible(true);
    }
}
