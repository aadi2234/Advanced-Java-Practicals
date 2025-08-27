package travelManagement;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.web.WebView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Paytm extends JFrame implements ActionListener {
    JButton back;

    public Paytm() {
        setBounds(300, 100, 800, 600);
        setLayout(null);

        JFXPanel jfxPanel = new JFXPanel();
        jfxPanel.setBounds(0, 0, 800, 560);
        add(jfxPanel);

        Platform.runLater(() -> {
            WebView webView = new WebView();
            jfxPanel.setScene(new Scene(webView));
            webView.getEngine().load("https://paytm.com/rent-payment"); // Replace with the Google Pay URL
        });

        back = new JButton("Back");
        back.setBounds(700, 0, 80, 40);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        jfxPanel.add(back);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new Payment();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Paytm());
    }
}
