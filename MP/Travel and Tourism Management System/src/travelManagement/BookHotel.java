package travelManagement;
import java.awt.*;
import java.sql.*;	
import javax.swing.*;
import java.awt.event.*;

public class BookHotel extends JFrame implements ActionListener{
	JLabel cusername,cuname,id,person,lpack,tprice,number,price,phone,lid,num,phn,days,acnac,food;
	JTextField tfpersons,tfdays;
	Choice chotel,cacnac,foodincluded;
	JButton checkprice,bookpackage,back;
	private String username; 
	 
	public BookHotel(String username) {
		this.username = username;
		setBounds(140, 120, 1100, 600);
		setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		
		JLabel txt=new JLabel("BOOK HOTEL");
		txt.setFont(new Font("Forte",Font.BOLD,30));
		txt.setBounds(100,10,200,30);
		add(txt);
		
		cusername=new JLabel("Username");
		cusername.setFont(new Font("Matura MT Script Capitals",Font.PLAIN,20));
		cusername.setBounds(40,70,100,20);
		add(cusername);
		
		cuname=new JLabel();
		cuname.setBounds(250,70,200,20);
		add(cuname);
		
		lpack=new JLabel("Select Hotel");
		lpack.setFont(new Font("Matura MT Script Capitals",Font.PLAIN,20));
		lpack.setBounds(40,110,150,20);
		add(lpack);
		
		chotel=new Choice();
		chotel.setBounds(250, 110, 200, 20);
		add(chotel);
		
		try{
        	Connection con = MysqlCon.getCon();
        	PreparedStatement ps1 = con.prepareStatement("select * from hotel");
            ResultSet rs = ps1.executeQuery();
            while(rs.next()){
                chotel.add(rs.getString("name"));
                
            }

        }catch(SQLException e){
        	e.printStackTrace();
        }
		person=new JLabel("Total Persons");
		person.setFont(new Font("Matura MT Script Capitals",Font.PLAIN,20));
		person.setBounds(40,150,150,25);
		add(person);
		
		tfpersons=new JTextField("1");
		tfpersons.setBounds(250,150,200,25);
		add(tfpersons);
		
		days=new JLabel("No.of Days");
		days.setFont(new Font("Matura MT Script Capitals",Font.PLAIN,20));
		days.setBounds(40,190,150,25);
		add(days);
		
		tfdays=new JTextField("1");
		tfdays.setBounds(250,190,200,25);
		add(tfdays);
		
		acnac=new JLabel("AC/Non -AC");
		acnac.setFont(new Font("Matura MT Script Capitals",Font.PLAIN,20));
		acnac.setBounds(40,230,200,25);
		add(acnac);
		
		cacnac=new Choice();
		cacnac.add("AC");
		cacnac.add("Non-AC");
		cacnac.setBounds(250, 230, 200, 20);
		add(cacnac);
		
		food=new JLabel("Food Included");
		food.setFont(new Font("Matura MT Script Capitals",Font.PLAIN,20));
		food.setBounds(40,270,200,25);
		add(food);
		
		foodincluded=new Choice();
		foodincluded.add("Yes");
		foodincluded.add("No");
		foodincluded.setBounds(250, 270, 200, 20);
		add(foodincluded);
		
		id=new JLabel("Id");
		id.setFont(new Font("Matura MT Script Capitals",Font.PLAIN,20));
		id.setBounds(40,310,150,25);
		add(id);
		
		lid=new JLabel();
		lid.setBounds(250,310,200,25);
		add(lid);
		
		number=new JLabel("Number");
		number.setFont(new Font("Matura MT Script Capitals",Font.PLAIN,20));
		number.setBounds(40,350,150,25);
		add(number);
		
		num=new JLabel();
		num.setBounds(250,350,150,25);
		add(num);
		
		phone=new JLabel("Phone");
		phone.setFont(new Font("Matura MT Script Capitals",Font.PLAIN,20));
		phone.setBounds(40,390,200,25);
		add(phone);
		
		phn=new JLabel();
		phn.setBounds(250,390,200,25);
		add(phn);
		
		tprice=new JLabel("Total Price");
		tprice.setFont(new Font("Matura MT Script Capitals",Font.PLAIN,20));
		tprice.setBounds(40,430,150,25);
		add(tprice);
		
		price=new JLabel();
		price.setBounds(250,430,150,25);
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
		 checkprice.setBounds(60, 490, 120, 25);
		 checkprice.setBackground(Color.BLACK);
		 checkprice.setForeground(Color.WHITE);
		 checkprice.addActionListener(this);
         add(checkprice);
         
         bookpackage=new JButton("Book Hotel");
         bookpackage.setBounds(200, 490, 120, 25);
         bookpackage.setBackground(Color.BLACK);
         bookpackage.setForeground(Color.WHITE);
         bookpackage.addActionListener(this);
         add(bookpackage);
         
         back=new JButton("Back");
         back.setBounds(340, 490, 120, 25);
         back.setBackground(Color.BLACK);
         back.setForeground(Color.WHITE);
         back.addActionListener(this);
         add(back);
         
         ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/book.jpg"));
         Image i3 = i1.getImage().getScaledInstance(600, 300,Image.SCALE_DEFAULT);
         ImageIcon i2 = new ImageIcon(i3);
         JLabel la1 = new JLabel(i2);
         la1.setBounds(500,100,600,300);
         add(la1);
         
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		 if (e.getSource() == checkprice) {
			 try {
		            Connection con = MysqlCon.getCon();
		            PreparedStatement ps1 = con.prepareStatement("select * from hotel where name = '"+chotel.getSelectedItem()+"'");
		            ResultSet rs = ps1.executeQuery();
		            while (rs.next()) {
		                int cost=Integer.parseInt(rs.getString("costperson"));
		                int food=Integer.parseInt(rs.getString("foodincluded"));
		                int ac=Integer.parseInt(rs.getString("acroom"));
		                
		                int persons=Integer.parseInt(tfpersons.getText());
		                int days=Integer.parseInt(tfdays.getText());
		                
		                String acselected=cacnac.getSelectedItem();
		                String foodselected=cacnac.getSelectedItem();
		                
		                if(persons * days >0)
		                {
		                	int total=0;
		                	total += acselected.equals("AC") ? ac : 0;
		                	total += foodselected.equals("Yes") ? food : 0;
		                	total += cost;
		                	total += total * persons * days;
		                	price.setText("Rs. "+total);
		                }else
		                {
		                	JOptionPane.showConfirmDialog(null, "Please enter a valid number");
		                }
		            }
		        } catch (Exception e1) {
		            e1.printStackTrace();
		        }
		 }else if (e.getSource() == bookpackage)
		 {
			 Connection con = MysqlCon.getCon();

		        try {
                    
		            String query = "INSERT INTO bookHotel VALUES (?, ?, ?, ?, ?, ?, ?,?,?,?)";
		            PreparedStatement ps1 = con.prepareStatement(query);
		            ps1.setString(1, username);
		            ps1.setString(2, chotel.getSelectedItem());
		            ps1.setString(3, tfpersons.getText());
		            ps1.setString(4, tfdays.getText());
		            ps1.setString(5, cacnac.getSelectedItem());
		            ps1.setString(6, foodincluded.getSelectedItem());
		            ps1.setString(7, lid.getText());
		            ps1.setString(8, num.getText());
		            ps1.setString(9, phn.getText());
		            ps1.setString(10, price.getText());

		            int i = ps1.executeUpdate();
		            if (i > 0) {
		                JOptionPane.showMessageDialog(null, "Hotel Booked Successfully");
		                setVisible(false);
		            } else {
		                JOptionPane.showMessageDialog(null, "Error while Booking Hotel");
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
		new BookHotel("The Unique One !");
	}
	
}