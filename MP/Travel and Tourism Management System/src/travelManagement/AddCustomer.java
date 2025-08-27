package travelManagement;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.*;

import javafx.scene.control.RadioButton;

public class AddCustomer extends JFrame implements ActionListener{

	JLabel lblusername,lblname;
	JComboBox<String> comboid;
	JTextField tfnumber,tfname,tfcountry,tfadd,tfphone,tfemail;
	JRadioButton jmale,jfemale;
	JButton add,back;
	String username;
	public AddCustomer(String username) {
		this.username=username;
		setBounds(350,150,850,550);
		setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		
		
		JLabel username1=new JLabel("Username");
		username1.setBounds(30, 50, 150, 25);
		username1.setFont(new Font("Matura MT Script Capitals",Font.BOLD,20));
		add(username1);
		
		lblusername=new JLabel();
		lblusername.setBounds(220, 50, 200, 25);
		lblusername.setFont(new Font("Matura MT Script Capitals",Font.BOLD,20));
		add(lblusername);
		
		JLabel lbid=new JLabel("Id");
		lbid.setBounds(30, 90, 150, 25);
		lbid.setFont(new Font("Matura MT Script Capitals",Font.BOLD,20));
		add(lbid);
		
		comboid = new JComboBox<String>(new String[] {"Passport","Aadhar Card","Pan Card","Ration Card"}); // Specify the type parameter for JComboBox
		comboid.setBounds(220, 90, 150, 25);
		comboid.setBackground(Color.WHITE);
		add(comboid);
        
		JLabel lbno=new JLabel("Number");
		lbno.setBounds(30, 130, 150, 25);
		lbno.setFont(new Font("Matura MT Script Capitals",Font.BOLD,20));
		add(lbno);
		
		tfnumber=new JTextField();
		tfnumber.setBounds(220,130,150,25);
		add(tfnumber);
		
		JLabel lbname=new JLabel("Name");
		lbname.setBounds(30, 170, 150, 25);
		lbname.setFont(new Font("Matura MT Script Capitals",Font.BOLD,20));
		add(lbname);
		
		tfname=new JTextField();
		tfname.setBounds(220,130,150,25);
		add(tfname);
		
		lblname=new JLabel();
		lblname.setBounds(220, 170, 150, 25);
		lblname.setFont(new Font("Matura MT Script Capitals",Font.BOLD,20));
		add(lblname);
		
		JLabel lbgender=new JLabel("Gender");
		lbgender.setBounds(30, 210, 150, 25);
		lbgender.setFont(new Font("Matura MT Script Capitals",Font.BOLD,20));
		add(lbgender);
		
		jmale=new JRadioButton("Male");
		jmale.setBounds(220,210,70,25);
		jmale.setBackground(Color.WHITE);
		add(jmale);
		
		jfemale=new JRadioButton("Female");
		jfemale.setBounds(300,210,70,25);
		jfemale.setBackground(Color.WHITE);
		add(jfemale);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(jmale);
		bg.add(jfemale);
		
		JLabel lbcountry=new JLabel("Country");
		lbcountry.setBounds(30, 250, 150, 25);
		lbcountry.setFont(new Font("Matura MT Script Capitals",Font.BOLD,20));
		add(lbcountry);
		
		tfcountry=new JTextField();
		tfcountry.setBounds(220,250,150,25);
		add(tfcountry);
		
		JLabel lbadd=new JLabel("Address");
		lbadd.setBounds(30, 290, 150, 25);
		lbadd.setFont(new Font("Matura MT Script Capitals",Font.BOLD,20));
		add(lbadd);
		
		tfadd=new JTextField();
		tfadd.setBounds(220,290,150,25);
		add(tfadd);
		
		JLabel lbphone=new JLabel("Phone");
		lbphone.setBounds(30, 330, 150, 25);
		lbphone.setFont(new Font("Matura MT Script Capitals",Font.BOLD,20));
		add(lbphone);
		
		tfphone=new JTextField();
		tfphone.setBounds(220,330,150,25);
		add(tfphone);
		
		JLabel lbemail=new JLabel("Email");
		lbemail.setBounds(30, 370, 150, 25);
		lbemail.setFont(new Font("Matura MT Script Capitals",Font.BOLD,20));
		add(lbemail);
		
		tfemail=new JTextField();
		tfemail.setBounds(220,370,150,25);
		add(tfemail);
		
		add=new JButton("Add");
		add.setBackground(Color.BLACK);
		add.setForeground(Color.WHITE);
		add.setBounds(70,430,100,25);
		add.addActionListener(this);
		add(add);
		
		back=new JButton("Back");
		back.setBackground(Color.BLACK);
		back.setForeground(Color.WHITE);
		back.setBounds(220,430,100,25);
		back.addActionListener(this);
		add(back);
		
		ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icons/newcustomer.jpg"));
        Image i21 = i11.getImage().getScaledInstance(400, 500, Image.SCALE_DEFAULT);
        ImageIcon i31 = new ImageIcon(i21);
        JLabel image = new JLabel(i31);
        image.setBounds(400,40,450,420);
        add(image);
        
        try{
        	Connection con = MysqlCon.getCon();
            PreparedStatement ps1 = con.prepareStatement("select * from account where username=?");
            ps1.setString(1, username); // Set the username parameter
            ResultSet rs = ps1.executeQuery();
            if (rs.next()) {
                lblusername.setText(rs.getString("username"));
                lblname.setText(rs.getString("name"));
            }
        }catch(Exception e)
        {
        	e.printStackTrace();
        }
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == add) {
		   String username=lblusername.getText();
     	   String id=(String)comboid.getSelectedItem();
     	   String number=tfnumber.getText();
     	   String name=lblname.getText();
     	   String gender=null;
     	   if(jmale.isSelected())
     	   {
     		   gender="Male";
     	   }
     	   else
     	   {
     		   gender="Female";
     	   }
     	   String country=tfcountry.getText();
     	   String address=tfadd.getText();
     	   String phone=tfphone.getText();
     	   String email=tfemail.getText();
	           try{
	        	   String query="insert into customer values(?,?,?,?,?,?,?,?,?)";
	        	   Connection con = MysqlCon.getCon();
	               PreparedStatement ps1 = con.prepareStatement(query);
	                ps1.setString(1, username);
	                ps1.setString(2, id);
	                ps1.setString(3, number);
	                ps1.setString(4, name);
	                ps1.setString(5, gender);
	                ps1.setString(6, country);
	                ps1.setString(7, address);
	                ps1.setString(8, phone);
	                ps1.setString(9, email);
	               int i = ps1.executeUpdate();
	                if (i > 0) {
	                    JOptionPane.showMessageDialog(null, "Customer Details Added Successfully..");
	                    setVisible(false);
	                } else {
	                    JOptionPane.showMessageDialog(null, "Error while Adding Customer Details");
	                }
	            } catch (Exception e1) {
	                e1.printStackTrace();
	            }
	        } else if (e.getSource() == back) {
	            setVisible(false);
	            new Signup();
	        }
		}
	public static void main(String[] args) {
		new AddCustomer("The Unique One !");
	}

	

}
