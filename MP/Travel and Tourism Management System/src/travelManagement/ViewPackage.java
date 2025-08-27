package travelManagement;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class ViewPackage extends JFrame implements ActionListener{
	JLabel cusername,cuname,id,number,name,gender,country,address,phone,email,txt;
	JButton back;
	public ViewPackage(String username) {
		
		setBounds(300, 100, 900, 450); 
		setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		
		txt=new JLabel("VIEW PACKAGE DETAILS");
		txt.setFont(new Font("Forte",Font.BOLD,30));
		txt.setBounds(60,0,500,30);
		add(txt);
		
		cusername=new JLabel("Username");
		cusername.setFont(new Font("Matura MT Script Capitals",Font.BOLD,20));
		cusername.setBounds(30,50,150,25);
		add(cusername);
		
		cuname=new JLabel();
		cuname.setBounds(220,50,150,25);
		add(cuname);
		
		id=new JLabel("Package");
		id.setFont(new Font("Matura MT Script Capitals",Font.BOLD,20));
		id.setBounds(30,90,150,25);
		add(id);
		
		JLabel uid=new JLabel();
		uid.setBounds(220,90,150,25);
		add(uid);
		
		number=new JLabel("Total Persons");
		number.setFont(new Font("Matura MT Script Capitals",Font.BOLD,20));
		number.setBounds(30,130,150,25);
		add(number);
		
		JLabel num=new JLabel();
		num.setBounds(220,130,150,25);
		add(num);
		
		name=new JLabel("Id");
		name.setFont(new Font("Matura MT Script Capitals",Font.BOLD,20));
		name.setBounds(30,170,150,25);
		add(name);
		
		JLabel nm=new JLabel();
		nm.setBounds(220,170,150,25);
		add(nm);
		
		gender=new JLabel("Number");
		gender.setFont(new Font("Matura MT Script Capitals",Font.BOLD,20));
		gender.setBounds(30,210,150,25);
		add(gender);
		
		JLabel gdr=new JLabel();
		gdr.setBounds(220,210,150,25);
		add(gdr);
		
		country=new JLabel("Phone");
		country.setFont(new Font("Matura MT Script Capitals",Font.BOLD,20));
		country.setBounds(30,250,150,25);
		add(country);
		
		JLabel cty=new JLabel();
		cty.setBounds(220,250,150,25);
		add(cty);
		
		address=new JLabel("Price");
		address.setFont(new Font("Matura MT Script Capitals",Font.BOLD,20));
		address.setBounds(30,290,150,25);
		add(address);
		
		JLabel adde=new JLabel();
		adde.setBounds(220,290,150,25);
		add(adde);
		
		back=new JButton("Back");
		back.setBackground(Color.BLACK);
		back.setForeground(Color.WHITE);
		back.setBounds(130,360,100,25);
		back.addActionListener(this);
		add(back);
		
		ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icons/bookedDetails.jpg"));
        Image i21 = i11.getImage().getScaledInstance(500, 400, Image.SCALE_DEFAULT);
        ImageIcon i31 = new ImageIcon(i21);
        JLabel image = new JLabel(i31);
        image.setBounds(450,20,500,400);
        add(image);
        
        
        try {
            Connection con = MysqlCon.getCon();
            PreparedStatement ps1 = con.prepareStatement("select * from bookpackage where username = ?");
            ps1.setString(1, username); // Set the username parameter
            ResultSet rs = ps1.executeQuery();
            while (rs.next()) {
                cuname.setText(rs.getString("username"));
                uid.setText(rs.getString("package"));
                num.setText(rs.getString("persons"));
                nm.setText(rs.getString("id"));
                gdr.setText(rs.getString("number"));
                cty.setText(rs.getString("phone"));
                adde.setText(rs.getString("price"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
		setVisible(true);
	}

	public static void main(String[] args) {
		new ViewPackage("The Unique One !");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		setVisible(false);
		
	}

}
