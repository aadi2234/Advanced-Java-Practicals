package travelManagement;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class DeleteCustomerDetails extends JFrame implements ActionListener{
	JLabel cusername,cuname,id,number,name,gender,country,address,phone,email;
	JButton back;
	String username;
	public DeleteCustomerDetails(String username) {
		this.username=username;
		setBounds(300,100,870,625);
		setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		
		cusername=new JLabel("Username");
		cusername.setFont(new Font("Matura MT Script Capitals",Font.BOLD,20));
		cusername.setBounds(30,50,150,25);
		add(cusername);
		
		cuname=new JLabel();
		cuname.setBounds(220,50,150,25);
		add(cuname);
		
		id=new JLabel("Id");
		id.setFont(new Font("Matura MT Script Capitals",Font.BOLD,20));
		id.setBounds(30,110,150,25);
		add(id);
		
		JLabel uid=new JLabel();
		uid.setBounds(220,110,150,25);
		add(uid);
		
		number=new JLabel("Number");
		number.setFont(new Font("Matura MT Script Capitals",Font.BOLD,20));
		number.setBounds(30,170,150,25);
		add(number);
		
		JLabel num=new JLabel();
		num.setBounds(220,170,150,25);
		add(num);
		
		name=new JLabel("Name");
		name.setFont(new Font("Matura MT Script Capitals",Font.BOLD,20));
		name.setBounds(30,230,150,25);
		add(name);
		
		JLabel nm=new JLabel();
		nm.setBounds(220,230,150,25);
		add(nm);
		
		gender=new JLabel("Gender");
		gender.setFont(new Font("Matura MT Script Capitals",Font.BOLD,20));
		gender.setBounds(30,290,150,25);
		add(gender);
		
		JLabel gdr=new JLabel();
		gdr.setBounds(220,290,150,25);
		add(gdr);
		
		country=new JLabel("Country");
		country.setFont(new Font("Matura MT Script Capitals",Font.BOLD,20));
		country.setBounds(500,50,150,25);
		add(country);
		
		JLabel cty=new JLabel();
		cty.setBounds(690,50,150,25);
		add(cty);
		
		address=new JLabel("Address");
		address.setFont(new Font("Matura MT Script Capitals",Font.BOLD,20));
		address.setBounds(500,110,150,25);
		add(address);
		
		JLabel adde=new JLabel();
		adde.setBounds(690,110,150,25);
		add(adde);
		
		phone=new JLabel("Phone");
		phone.setFont(new Font("Matura MT Script Capitals",Font.BOLD,20));
		phone.setBounds(500,170,150,25);
		add(phone);
		
		JLabel ph=new JLabel();
		ph.setBounds(690,170,150,25);
		add(ph);
		
		email=new JLabel("Email");
		email.setFont(new Font("Matura MT Script Capitals",Font.BOLD,20));
		email.setBounds(500,230,150,25);
		add(email);
		
		JLabel eml=new JLabel();
		eml.setBounds(690,230,150,25);
		add(eml);
		
		back=new JButton("Delete");
		back.setBackground(Color.BLACK);
		back.setForeground(Color.WHITE);
		back.setBounds(350,350,100,25);
		back.addActionListener(this);
		add(back);
		
		ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
        Image i21 = i11.getImage().getScaledInstance(600, 200, Image.SCALE_DEFAULT);
        ImageIcon i31 = new ImageIcon(i21);
        JLabel image = new JLabel(i31);
        image.setBounds(20,400,600,200);
        add(image);
        
        ImageIcon i111 = new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
        Image i211 = i111.getImage().getScaledInstance(600, 200, Image.SCALE_DEFAULT);
        ImageIcon i311 = new ImageIcon(i211);
        JLabel image1 = new JLabel(i311);
        image1.setBounds(600,400,600,200);
        add(image1);
        
        try {
            Connection con = MysqlCon.getCon();
            PreparedStatement ps1 = con.prepareStatement("select * from customer where username = ?");
            ps1.setString(1, username); // Set the username parameter
            ResultSet rs = ps1.executeQuery();
            while (rs.next()) {
                cuname.setText(rs.getString("username"));
                uid.setText(rs.getString("id"));
                num.setText(rs.getString("number"));
                nm.setText(rs.getString("name"));
                gdr.setText(rs.getString("gender"));
                cty.setText(rs.getString("country"));
                adde.setText(rs.getString("address"));
                ph.setText(rs.getString("phone"));
                eml.setText(rs.getString("email"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
		setVisible(true);
	}

	public static void main(String[] args) {
		new DeleteCustomerDetails("kd@8067");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try{
			Connection con = MysqlCon.getCon();
			PreparedStatement ps1 = con.prepareStatement("delete from account where username = ?");
            PreparedStatement ps2 = con.prepareStatement("delete from customer where username = ?");
            PreparedStatement ps3 = con.prepareStatement("delete from bookpackage where username = ?");
            PreparedStatement ps4 = con.prepareStatement("delete from bookhotel where username = ?");
            ps1.setString(1, username); 
            ps2.setString(1, username);
            ps3.setString(1, username);
            ps4.setString(1, username);
            ps1.executeUpdate();
            ps2.executeUpdate();
            ps3.executeUpdate();
            ps4.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Deleted Successfully...");
            setVisible(false);
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
		}
		
	}

}

