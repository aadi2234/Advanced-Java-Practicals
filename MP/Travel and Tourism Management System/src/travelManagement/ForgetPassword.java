package travelManagement;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.*;

public class ForgetPassword extends JFrame implements ActionListener{

	private JPanel p1;
    private JTextField t1,t2,t3,t4,t5;
    private JButton b1,b2,b3;
	public ForgetPassword() {
		setBounds(350, 200, 850, 380);
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		JPanel p1=new JPanel();
		p1.setLayout(null);
		
		p1.setBounds(30,30,500,280);
		add(p1);
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/forgotpassword.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(580, 50, 250, 250);
        add(image);
		
        JLabel l1 = new JLabel("Username");
        l1.setBounds(30, 20, 150, 25);
        l1.setFont(new Font("Matura MT Script Capitals", Font.BOLD, 25));
        p1.add(l1);
        
        t1 = new JTextField();
        t1.setBounds(200, 20, 180, 25);
        t1.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t1);
        
        b1 = new JButton("Search");
    	b1.addActionListener(this);
    	b1.setFont(new Font("Matura MT Script Capitals", Font.BOLD, 25));
    	b1.setBounds(380,20,120,25);
    	b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        p1.add(b1);
        
        JLabel l2 = new JLabel("Name");
        l2.setBounds(40, 60, 100, 25);
        l2.setFont(new Font("Matura MT Script Capitals", Font.BOLD, 25));
        p1.add(l2);
        
        t2 = new JTextField();
        t2.setBounds(200, 60, 180, 25);
        t2.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t2);
        
        JLabel l3 = new JLabel("Your Security Que");
        l3.setBounds(2, 100, 280, 25);
        l3.setFont(new Font("Matura MT Script Capitals", Font.BOLD, 20));
        p1.add(l3);
        
        t3 = new JTextField();
        t3.setBounds(200, 100, 180, 25);
        t3.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t3);
	
        JLabel l4 = new JLabel("Answer");
        l4.setBounds(40,140,150, 25);
        l4.setFont(new Font("Matura MT Script Capitals", Font.BOLD, 25));
        p1.add(l4);
        
        t4 = new JTextField();
        t4.setBounds(200, 140, 180, 25);
        t4.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t4);
        
        b2 = new JButton("Retrieve");
    	b2.addActionListener(this);
    	b2.setFont(new Font("Matura MT Script Capitals", Font.BOLD, 25));
    	b2.setBounds(360, 140, 150, 25);
    	b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
    	p1.add(b2);
    	
    	JLabel l5 = new JLabel("Password");
        l5.setBounds(40,180,150, 25);
        l5.setFont(new Font("Matura MT Script Capitals", Font.BOLD, 25));
        p1.add(l5);
        
        t5 = new JTextField();
        t5.setBounds(200, 180, 180, 25);
        t5.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t5);
        
        b3 = new JButton("Back");
    	b3.addActionListener(this);
    	b3.setFont(new Font("Matura MT Script Capitals", Font.BOLD, 25));
    	b3.setBounds(150,230,120,25);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
    	p1.add(b3);
    	
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1)
		{
			try{
				String query="select * from account where username='"+t1.getText()+"'";
				Connection con = MysqlCon.getCon();
                PreparedStatement ps1 = con.prepareStatement(query);
                ResultSet rs = ps1.executeQuery();
                while (rs.next()) {
                	t2.setText(rs.getString("name"));
                	t3.setText(rs.getString("security"));
                }
			}catch(Exception e1)
			{
				e1.printStackTrace();
			}
		}
		else if(e.getSource()==b2)
		{
			try{
				String query="select * from account where username='"+t1.getText()+"' AND answer='"+t4.getText()+"'";
				Connection con = MysqlCon.getCon();
                PreparedStatement ps1 = con.prepareStatement(query);
                ResultSet rs = ps1.executeQuery();
                while (rs.next()) {
                	t5.setText(rs.getString("password"));
                }
			}catch(Exception e1)
			{
				e1.printStackTrace();
			}
		}
		else
		{
			setVisible(false);
			new Login();
		}
	}
	public static void main(String[] args) {
		new ForgetPassword();

	}
}
