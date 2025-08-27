package travelManagement;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import org.eclipse.jdt.internal.compiler.tool.EclipseCompiler;

public class Dashboard extends JFrame implements ActionListener{

	String username;
	JButton addPDetails,viewPDetails,updatePDetails,checkpackages,bookpackages,viewpackages,viewhotels,destination,bookhotel,viewbookedhotel,payment,deletePDetails;
	JButton calculator,notepad,about;
	public Dashboard(String username) {
		this.username=username;
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setLayout(null);
		
		JPanel p1=new JPanel();
		p1.setLayout(null);
		p1.setBackground(new Color(0,0,102));
		p1.setBounds(0, 0, 1600, 65);
		add(p1);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
		Image i2=i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel icon=new JLabel(i3);
		icon.setBounds(5,0,70,70);
		p1.add(icon);
		
		JLabel heading=new JLabel("Dashboard");
		heading.setBounds(80,10,300,40);
		heading.setForeground(Color.WHITE);
		heading.setFont(new Font("Tahoma", Font.BOLD, 30));
		p1.add(heading);
		
		JPanel p2=new JPanel();
		p2.setLayout(null);
		p2.setBackground(new Color(0,0,102));
		p2.setBounds(0, 65, 300, 900);
		add(p2);
		
		addPDetails=new JButton("Add Personal Details");
		addPDetails.setBounds(0,0,300,40);
		addPDetails.setBackground(new Color(0,0,102));
		addPDetails.setForeground(Color.WHITE);
		addPDetails.setFont(new Font("Forte", Font.BOLD, 20));
		addPDetails.setMargin(new Insets(0, 0, 0, 60));
		addPDetails.addActionListener(this);
		p2.add(addPDetails);
		
		updatePDetails=new JButton("Update Personal Details");
		updatePDetails.setBounds(0,42,300,40);
		updatePDetails.setBackground(new Color(0,0,102));
		updatePDetails.setForeground(Color.WHITE);
		updatePDetails.setFont(new Font("Forte", Font.BOLD, 20));
		updatePDetails.setMargin(new Insets(0, 0, 0, 30));
		updatePDetails.addActionListener(this);
		p2.add(updatePDetails);
		
		viewPDetails=new JButton("View Details");
		viewPDetails.setBounds(0,84,300,40);
		viewPDetails.setBackground(new Color(0,0,102));
		viewPDetails.setForeground(Color.WHITE);
		viewPDetails.setFont(new Font("Forte", Font.BOLD, 20));
		viewPDetails.setMargin(new Insets(0, 0, 0, 140));
		viewPDetails.addActionListener(this);
		p2.add(viewPDetails);
		
		deletePDetails=new JButton("Delete Personal Details");
		deletePDetails.setBounds(0,126,300,40);
		deletePDetails.setBackground(new Color(0,0,102));
		deletePDetails.setForeground(Color.WHITE);
		deletePDetails.setFont(new Font("Forte", Font.BOLD, 20));
		deletePDetails.setMargin(new Insets(0, 0, 0, 30));
		deletePDetails.addActionListener(this);
		p2.add(deletePDetails);
		
		checkpackages=new JButton("Check Packages");
		checkpackages.setBounds(0,168,300,40);
		checkpackages.setBackground(new Color(0,0,102));
		checkpackages.setForeground(Color.WHITE);
		checkpackages.setFont(new Font("Forte", Font.BOLD, 20));
		checkpackages.setMargin(new Insets(0, 0, 0, 110));
		checkpackages.addActionListener(this);
		p2.add(checkpackages);
		
		bookpackages=new JButton("Book Packages");
		bookpackages.setBounds(0,210,300,40);
		bookpackages.setBackground(new Color(0,0,102));
		bookpackages.setForeground(Color.WHITE);
		bookpackages.setFont(new Font("Forte", Font.BOLD, 20));
		bookpackages.setMargin(new Insets(0, 0, 0, 120));
		bookpackages.addActionListener(this);
		p2.add(bookpackages);
		
		viewpackages=new JButton("View Packages");
		viewpackages.setBounds(0,252,300,40);
		viewpackages.setBackground(new Color(0,0,102));
		viewpackages.setForeground(Color.WHITE);
		viewpackages.setFont(new Font("Forte", Font.BOLD, 20));
		viewpackages.setMargin(new Insets(0, 0, 0, 120));
		viewpackages.addActionListener(this);
		p2.add(viewpackages);
		
		viewhotels=new JButton("View Hotels");
		viewhotels.setBounds(0,294,300,40);
		viewhotels.setBackground(new Color(0,0,102));
		viewhotels.setForeground(Color.WHITE);
		viewhotels.setFont(new Font("Forte", Font.BOLD, 20));
		viewhotels.setMargin(new Insets(0, 0, 0, 140));
		viewhotels.addActionListener(this);
		p2.add(viewhotels);
		
		bookhotel=new JButton("Book Hotels");
		bookhotel.setBounds(0,336,300,40);
		bookhotel.setBackground(new Color(0,0,102));
		bookhotel.setForeground(Color.WHITE);
		bookhotel.setFont(new Font("Forte", Font.BOLD, 20));
		bookhotel.setMargin(new Insets(0, 0, 0, 140));
		bookhotel.addActionListener(this);
		p2.add(bookhotel);
		
		viewbookedhotel=new JButton("View Booked Hotels");
		viewbookedhotel.setBounds(0,378,300,40);
		viewbookedhotel.setBackground(new Color(0,0,102));
		viewbookedhotel.setForeground(Color.WHITE);
		viewbookedhotel.setFont(new Font("Forte", Font.BOLD, 20));
		viewbookedhotel.setMargin(new Insets(0, 0, 0, 70));
		viewbookedhotel.addActionListener(this);
		p2.add(viewbookedhotel);
		
		destination=new JButton("Destinations");
		destination.setBounds(0,420,300,40);
		destination.setBackground(new Color(0,0,102));
		destination.setForeground(Color.WHITE);
		destination.setFont(new Font("Forte", Font.BOLD, 20));
		destination.setMargin(new Insets(0, 0, 0, 125));
		destination.addActionListener(this);
		p2.add(destination);
		
		payment=new JButton("Payments");
		payment.setBounds(0,462,300,40);
		payment.setBackground(new Color(0,0,102));
		payment.setForeground(Color.WHITE);
		payment.setFont(new Font("Forte", Font.BOLD, 20));
		payment.setMargin(new Insets(0, 0, 0, 155));
		payment.addActionListener(this);
		p2.add(payment);

		calculator=new JButton("Calculator");
		calculator.setBounds(0,504,300,40);
		calculator.setBackground(new Color(0,0,102));
		calculator.setForeground(Color.WHITE);
		calculator.setFont(new Font("Forte", Font.BOLD, 20));
		calculator.setMargin(new Insets(0, 0, 0, 145));
		calculator.addActionListener(this);
		p2.add(calculator);

		notepad=new JButton("Notepad");
		notepad.setBounds(0,550,300,40);
		notepad.setBackground(new Color(0,0,102));
		notepad.setForeground(Color.WHITE);
		notepad.setFont(new Font("Forte", Font.BOLD, 20));
		notepad.setMargin(new Insets(0, 0, 0, 155));
		notepad.addActionListener(this);
		p2.add(notepad);
		
		about=new JButton("About");
		about.setBounds(0,600,300,40);
		about.setBackground(new Color(0,0,102));
		about.setForeground(Color.WHITE);
		about.setFont(new Font("Forte", Font.BOLD, 20));
		about.setMargin(new Insets(0, 0, 0, 150));
		about.addActionListener(this);
		p2.add(about);
		
		ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i21 = i11.getImage().getScaledInstance(1650, 1000, Image.SCALE_DEFAULT);
        ImageIcon i31 = new ImageIcon(i21);
        JLabel image = new JLabel(i31);
        image.setBounds(0,0,1650,1000);
        add(image);
        
        JLabel txt = new JLabel("Travel and Toursim Management System");
        txt.setForeground(Color.WHITE);
        txt.setFont(new Font("Matura MT Script Capitals", Font.BOLD, 45));
        txt.setBounds(400,70,1200,70);
        image.add(txt);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==addPDetails)
		{
			new AddCustomer(username);
		}
		else if(e.getSource()==deletePDetails)
		{
			new DeleteCustomerDetails(username);
		}
		else if(e.getSource()==viewPDetails)
		{
			new ViewCustomer(username);
		}
		else if(e.getSource()==updatePDetails)
		{
			new UpdateCustomer(username);
		}
		else if(e.getSource()==checkpackages)
		{
			new CheckPackage();
		}
		else if(e.getSource()==bookpackages)
		{
			new BookPackage(username);
		}
		else if(e.getSource()==viewpackages)
		{
			new ViewPackage(username);
		}
		else if(e.getSource()==viewhotels)
		{
			new CheckHotels();
		}
		else if(e.getSource()==destination)
		{
			new Destination();
		}
		else if(e.getSource()==bookhotel)
		{
			new BookHotel(username);
		}
		else if(e.getSource()==viewbookedhotel)
		{
			new ViewBookedHotel(username);
		}
		else if(e.getSource()==payment)
		{
			new Payment();
		}
		else if(e.getSource()==calculator)
		{
			try{
				Runtime.getRuntime().exec("calc.exe");
			}catch(Exception e1)
			{
				e1.printStackTrace();
			}
		}
		else if(e.getSource()==notepad)
		{
			try{
				Runtime.getRuntime().exec("notepad.exe");
			}catch(Exception e1)
			{
				e1.printStackTrace();
			}
		}
		else if(e.getSource()==about)
		{
			new About();
		}
		else
		{
		}
	}
	public static void main(String[] args) {
		new Dashboard("");
	}

	

}
