package exJavaSwing;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Dimension;

public class JanelaSwing {
    public static void main(String[] args) {
        // Cria a janela
        JFrame janela = new JFrame("Minha Primeira Janela Swing");

        // Define o tamanho da janela (largura x altura em pixels)
        janela.setSize(400, 250);

        // Configura o encerramento da aplicação ao fechar a janela
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Centraliza a janela na tela
        janela.setLocationRelativeTo(null);

        // Adiciona um rótulo de texto simples no centro
        JLabel texto = new JLabel("Olá, mundo!", SwingConstants.CENTER);
        janela.add(texto);

        // Torna a janela visível
        janela.setVisible(true);
    }
}
