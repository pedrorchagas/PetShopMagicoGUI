package org.psgd.petshop.controller;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class InterfaceController {
    private JFrame frame = new JFrame("Pet Shop Mágico");

    public InterfaceController() {
        abrirTelaInicial();
    }

    private void abrirTelaInicial() {
        // Lógica para criar a tela principal do petshop
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        JLabel label = new JLabel("Bem-vindo ao Pet Shop Mágico!", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 18));
        frame.add(label, BorderLayout.CENTER);

        JButton button = new JButton("Configurar seu perfil");
        button.addActionListener(e -> {
            frame.setVisible(false);
            abrirTelaUsuario();
        });
        frame.add(button, BorderLayout.SOUTH);
        frame.setVisible(true);
    }

    // Criar a tela de usuários
    private void abrirTelaUsuario() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        JLabel label = new JLabel("Seu perfil", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 18));
        frame.add(label, BorderLayout.CENTER);

        frame.add(new JLabel("Nome:"));
        JTextField nomeField = new JTextField();
        frame.add(nomeField);

        frame.add(new JLabel("Email:"));
        JTextField emailField = new JTextField();
        frame.add(emailField);

        frame.add(new JLabel("Telefone:"));
        JTextField telefoneField = new JTextField();
        frame.add(emailField);

        JButton salvarButton = new JButton("Salvar");
        frame.add(salvarButton);

            salvarButton.addActionListener(e -> {
            String nome = nomeField.getText();
            String email = emailField.getText();
            String telefone = telefoneField.getText();

            JOptionPane.showMessageDialog(frame,
                "Nome: " + nome + "\nEmail: " + email + "\nTelefone: " + telefone);
        });

        frame.setVisible(true);
    }
    // Criar a tela de animais

    // Criar a tela do petshop
}