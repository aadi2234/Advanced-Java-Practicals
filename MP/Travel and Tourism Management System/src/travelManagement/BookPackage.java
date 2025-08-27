package travelManagement;
import java.awt.*;
import java.sql.*;	
import javax.swing.*;
import java.awt.event.*;

public class BookPackage extends JFrame implements ActionListener{
	JLabel cusername,cuname,id,person,lpack,tprice,number,price,phone,lid,num,phn;
	JTextField tfpersons;
	Choice cpackage;
	JButton checkprice,bookpackage,back;
	private String username; 
	 
	public BookPackage(String username) {
		this.username = username;
		setBounds(140, 120, 1100, 500);
		setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		
		JLabel txt=new JLabel("BOOK PACKAGE");
		txt.setFont(new Font("Forte",Font.BOLD,30));
		txt.setBounds(100,10,300,25);
		add(txt);
		
		cusername=new JLabel("Username");
		cusername.setFont(new Font("Matura MT Script Capitals",Font.PLAIN,20));
		cusername.setBounds(40,70,100,20);
		add(cusername);
		
		cuname=new JLabel();
		cuname.setBounds(250,70,200,20);
		add(cuname);
		
		lpack=new JLabel("Select Package");
		lpack.setFont(new Font("Matura MT Script Capitals",Font.PLAIN,20));
		lpack.setBounds(40,110,150,20);
		add(lpack);
		
		cpackage=new Choice();
		cpackage.add("Gold Package");
		cpackage.add("Silver Package");
		cpackage.add("Bronze Package");
		cpackage.setBounds(250, 110, 200, 20);
		add(cpackage);
		
		person=new JLabel("Total Persons");
		person.setFont(new Font("Matura MT Script Capitals",Font.PLAIN,20));
		person.setBounds(40,150,150,25);
		add(person);
		
		tfpersons=new JTextField("1");
		tfpersons.setBounds(250,150,200,25);
		add(tfpersons);
		
		id=new JLabel("Id");
		id.setFont(new Font("Matura MT Script Capitals",Font.PLAIN,20));
		id.setBounds(40,190,150,25);
		add(id);
		
		lid=new JLabel();
		lid.setBounds(250,190,200,25);
		add(lid);
		
		number=new JLabel("Number");
		number.setFont(new Font("Matura MT Script Capitals",Font.PLAIN,20));
		number.setBounds(40,230,150,25);
		add(number);
		
		num=new JLabel();
		num.setBounds(250,230,150,25);
		add(num);
		
		phone=new JLabel("Phone");
		phone.setFont(new Font("Matura MT Script Capitals",Font.PLAIN,20));
		phone.setBounds(40,270,200,25);
		add(phone);
		
		phn=new JLabel();
		phn.setBounds(250,270,200,25);
		add(phn);
		
		tprice=new JLabel("Total Price");
		tprice.setFont(new Font("Matura MT Script Capitals",Font.PLAIN,20));
		tprice.setBounds(40,310,150,25);
		add(tprice);
		
		price=new JLabel();
		price.setBounds(250,310,150,25);
		add(price);
		
		 try {
	            Connection con = MysqlCon.getCon();
	            PreparedStatement ps1 = con.prepareStatement("select * from customer where username = ?");
	            ps1.setString(1, username); // Set the username parameter
	            ResultSet rs = ps1.executeQuery();
	            while (rs.next()) {
	                cuname.setText(rs.getString("username"));
	                lid.setText(rs.getString("id"));
	                num.setText(rs.getString("number"));
	                phn.setText(rs.getString("phone"));
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
		
		 checkprice=new JButton("Check Price");
		 checkprice.setBounds(60, 380, 120, 25);
		 checkprice.setBackground(Color.BLACK);
		 checkprice.setForeground(Color.WHITE);
		 checkprice.addActionListener(this);
         add(checkprice);
         
         bookpackage=new JButton("Book Package");
         bookpackage.setBounds(200, 380, 120, 25);
         bookpackage.setBackground(Color.BLACK);
         bookpackage.setForeground(Color.WHITE);
         bookpackage.addActionListener(this);
         add(bookpackage);
         
         back=new JButton("Back");
         back.setBounds(340, 380, 120, 25);
         back.setBackground(Color.BLACK);
         back.setForeground(Color.WHITE);
         back.addActionListener(this);
         add(back);
         
         ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/bookpackage.jpg"));
         Image i3 = i1.getImage().getScaledInstance(500, 300,Image.SCALE_DEFAULT);
         ImageIcon i2 = new ImageIcon(i3);
         JLabel la1 = new JLabel(i2);
         la1.setBounds(450,50,700,300);
         add(la1);
         
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		 if (e.getSource() == checkprice) {
			 String pack=cpackage.getSelectedItem();
			 int cost = 0;
             if(pack.equals("Gold Package")) 
             {
                 cost += 12000;
             }else if(pack.equals("Silver Package"))
             {
                 cost += 25000;
             }else
             {
                 cost += 32000;
             }
             int persons=Integer.parseInt(tfpersons.getText());
             cost *= persons;
             price.setText("Rs. "+cost);
		 }else if (e.getSource() == bookpackage)
		 {
			 Connection con = MysqlCon.getCon();

		        try {
                    
		            String query = "INSERT INTO bookPackage VALUES (?, ?, ?, ?, ?, ?, ?)";
		            PreparedStatement ps1 = con.prepareStatement(query);
		            ps1.setString(1, username);
		            ps1.setString(2, cpackage.getSelectedItem());
		            ps1.setString(3, tfpersons.getText());
		            ps1.setString(4, lid.getText());
		            ps1.setString(5, num.getText());
		            ps1.setString(6, phn.getText());
		            ps1.setString(7, price.getText());

		            int i = ps1.executeUpdate();
		            if (i > 0) {
		                JOptionPane.showMessageDialog(null, "Package Booked Successfully");
		                setVisible(false);
		            } else {
		                JOptionPane.showMessageDialog(null, "Error while Booking Package");
		            }
		        } catch (Exception ee) {
		            ee.printStackTrace();
		        }
		 }else{
			 setVisible(false);
		 }
		
	}
	public static void main(String[] args) 
	{
		new BookPackage("The Unique One !");
	}
	
}