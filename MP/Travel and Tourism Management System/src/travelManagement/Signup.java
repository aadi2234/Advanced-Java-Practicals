package travelManagement;

import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.border.*;

public class Signup extends JFrame implements ActionListener {
    JButton b1, b2;
    JLabel username, name, pass, lblAnswer, lblSecurityQuestion;
    JTextField tfuname, tfupass, tans, tfname;
    JComboBox<String> security; // Specify the type parameter for JComboBox
    public Signup() {
        setBounds(350, 200, 900, 360);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(133, 193, 233));
        p1.setBounds(0, 0, 500, 400);
        p1.setLayout(null);
        add(p1);

        username = new JLabel("Username");
        username.setBounds(50, 20, 125, 25);
        username.setFont(new Font("Matura MT Script Capitals", Font.BOLD, 20));
        p1.add(username);

        tfuname = new JTextField();
        tfuname.setBounds(190, 20, 180, 25);
        tfuname.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfuname);

        name = new JLabel("Name");
        name.setBounds(50, 60, 125, 25);
        name.setFont(new Font("Matura MT Script Capitals", Font.BOLD, 20));
        p1.add(name);

        tfname = new JTextField();
        tfname.setBounds(190, 60, 180, 25);
        tfname.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfname);

        pass = new JLabel("Password");
        pass.setBounds(50, 100, 125, 25);
        pass.setFont(new Font("Matura MT Script Capitals", Font.BOLD, 20));
        p1.add(pass);

        tfupass = new JTextField();
        tfupass.setBounds(190, 100, 180, 25);
        tfupass.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfupass);

        lblSecurityQuestion = new JLabel("Security Question");
        lblSecurityQuestion.setFont(new Font("Matura MT Script Capitals", Font.BOLD, 20));
        lblSecurityQuestion.setBounds(5, 140, 200, 25);
        p1.add(lblSecurityQuestion);

        security = new JComboBox<String>(); // Specify the type parameter for JComboBox
        security.setModel(new DefaultComboBoxModel<String>(new String[] { "Your NickName?", "Your Lucky Number?",
                "Your child SuperHero?", "Your childhood Name ?" }));
        security.setBounds(190, 140, 180, 25);
        p1.add(security);

        lblAnswer = new JLabel("Answer");
        lblAnswer.setFont(new Font("Algerian", Font.BOLD, 20));
        lblAnswer.setBounds(50, 180, 125, 25);
        p1.add(lblAnswer);

        tans = new JTextField();
        tans.setBounds(190, 180, 180, 25);
        tans.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tans);

        b1 = new JButton("Create");
        b1.setFont(new Font("Matura MT Script Capitals", Font.BOLD, 20));
        b1.setBounds(80, 250, 100, 30);
        b1.addActionListener(this);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        p1.add(b1);

        b2 = new JButton("Back");
        b2.setFont(new Font("Matura MT Script Capitals", Font.BOLD, 20));
        b2.setBounds(250, 250, 100, 30);
        b2.addActionListener(this);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        p1.add(b2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/signup.png"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(580, 50, 250, 250);
        add(image);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            try {
                String sql = "INSERT INTO account (username, name, password, security, answer) VALUES (?, ?, ?, ?, ?)";
                Connection con = MysqlCon.getCon();
                PreparedStatement ps1 = con.prepareStatement(sql);
                ps1.setString(1, tfuname.getText());
                ps1.setString(2, tfname.getText());
                ps1.setString(3, tfupass.getText());
                ps1.setString(4, (String) security.getSelectedItem());
                ps1.setString(5, tans.getText());

                int i = ps1.executeUpdate();
                if (i > 0) {
                    JOptionPane.showMessageDialog(null, "Account Created Successfully");
                    setVisible(false);
                    new Login();
                }
            } catch (Exception iee) {
                iee.printStackTrace();
            }
        } else if (e.getSource() == b2) {
            setVisible(false);
            new Login();
        } else {
            // Handle other actions if needed
        }
    }

    public static void main(String[] args) {
        new Signup();
    }
}
