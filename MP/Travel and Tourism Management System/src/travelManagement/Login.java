package travelManagement;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.*;

public class Login extends JFrame implements ActionListener{
	JButton login,signup,fpass;
	JTextField tfuname,tfupass;
	Login() {
		setSize(900,400);
		setLocation(300,200);
		setLayout(null);
		getContentPane().setBackground(Color.RED);
		JPanel p1=new JPanel();
		p1.setBackground(new Color(0, 121, 255));
		p1.setBounds(0, 0, 400, 400);
		p1.setLayout(null);
		add(p1);
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
		Image i2=i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image=new JLabel(i3);
		image.setBounds(100, 90, 200, 200);
		p1.add(image);
		
		JPanel p2=new JPanel();
		p2.setBackground(new Color(0, 223, 162));
		p2.setLayout(null);
		p2.setBounds(400, 30, 450, 300);
		add(p2);
		JLabel username=new JLabel("Username");
		username.setBounds(60, 20, 100, 25);
		username.setFont(new Font("Matura MT Script Capitals",Font.BOLD,20));
		p2.add(username);
		
		tfuname=new JTextField();
		tfuname.setBounds(60, 60, 300, 30);
		tfuname.setBorder(BorderFactory.createEmptyBorder());
		p2.add(tfuname);
		
		JLabel pass=new JLabel("Password");
		pass.setBounds(60, 110, 100,25);
		pass.setFont(new Font("Matura MT Script Capitals",Font.BOLD,20));
		p2.add(pass);
		
		tfupass=new JTextField();
		tfupass.setBounds(60, 150, 300, 30);
		tfupass.setBorder(BorderFactory.createEmptyBorder());
		p2.add(tfupass);
		
		login=new JButton("Login");
		login.setFont(new Font("Matura MT Script Capitals", Font.BOLD, 20));
		login.setBounds(60, 200, 130,30);
		login.setBackground(new Color(133,193,233));
		login.setBackground(Color.BLACK);
		login.setForeground(Color.WHITE);
		login.setBorder(BorderFactory.createLineBorder(new Color(133,193,233)));
		login.addActionListener(this);
		p2.add(login);
		
		signup=new JButton("Signup");
		signup.setFont(new Font("Matura MT Script Capitals", Font.BOLD, 20));
		signup.setBounds(230, 200, 130,30);
		signup.setBackground(new Color(133,193,233));
		signup.setBackground(Color.BLACK);
		signup.setForeground(Color.WHITE);
		signup.setBorder(BorderFactory.createLineBorder(new Color(133,193,233)));
		signup.addActionListener(this);
		p2.add(signup);
		
		fpass=new JButton("Forget Password");
		fpass.setFont(new Font("Matura MT Script Capitals", Font.BOLD, 20));
		fpass.setBounds(90, 250, 200,30);
		fpass.setBackground(Color.BLACK);
		fpass.setForeground(Color.WHITE);
		fpass.setBorder(BorderFactory.createLineBorder(new Color(133,193,233)));
		fpass.addActionListener(this);
		p2.add(fpass);
		
		JLabel text=new JLabel("Trouble in Login...");
		text.setFont(new Font("Matura MT Script Capitals", Font.BOLD, 15));
		text.setBounds(300, 255, 250, 20);
		text.setForeground(Color.red);
		p2.add(text);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == login) {
           try{
        	   String username=tfuname.getText();
        	   String password=tfupass.getText();
        	   String query="select * from account where username='"+username+"' AND password='"+password+"'";
        	   Connection con = MysqlCon.getCon();
               PreparedStatement ps1 = con.prepareStatement(query);
               ResultSet rs = ps1.executeQuery();
               if(rs.next())
               {
            	   JOptionPane.showMessageDialog(null, "Login Successful..");
            	   setVisible(false);
            	   new Loading(username);
               }
               else{
            	   JOptionPane.showMessageDialog(null, "Incorrect Username or Password");
               }
           }catch(Exception e1)
           {
        	   e1.printStackTrace();
           }
        } else if (e.getSource() == signup) {
        	setVisible(false);
            new Signup();
        } else {
        	 setVisible(false);
             new ForgetPassword();
        }
	}

	public static void main(String args[])
	{
		new Login();
	}
}
