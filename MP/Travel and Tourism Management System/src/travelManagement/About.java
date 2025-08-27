package travelManagement;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class About extends JFrame implements ActionListener{

	public About() {
		setBounds(400, 100, 500, 550);
		setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		
		 JLabel l1 = new JLabel("ABOUT");
		 l1.setBounds(200, 10, 300, 40);
		 l1.setForeground(Color.red);
		 l1.setFont(new Font("Matura MT Script Capitals",Font.BOLD,20));
		 add(l1);
		 
	     String s = "                                    About Projects          \n  "
	                + "\n	The objective of the Travel and Tourism Management System"
	                + "project is to develop a system that automates the processes "
	                + "and activities of a travel and the purpose is to design a "
	                + "system using which one can perform all operations related to "
	                + "traveling.\n\n"
	                + "	This application will help in accessing the information related "
	                + "to the travel to the particular destination with great ease. "
	                + "	The users can track the information related to their tours with "
	                + "great ease through this application. The travel agency information "
	                + "can also be obtained through this application.\n\n"
	                + "--------------------------"
	     			+ "\nTeam Members:\n"
	                + "--------------------------"
					+"\nAditya Dhakane"
					+"\nShraddha Gaidhani"
					+"\nAshwini Salunke"
					+"\nKalyani Bangar"
					+ "\n--------------------------"
					+"\n\n	Our dedicated team of developers has worked diligently to create a "
					+ "user-friendly interface and a robust backend system to provide you "
					+ "with a hassle-free travel management experience. We strive to continuously "
					+ "enhance our system to meet the evolving needs of travelers and ensure their"
					+ " journeys are as enjoyable as possible.";
	     
	     TextArea t1 = new TextArea(s, 10, 40, Scrollbar.VERTICAL);
	     t1.setEditable(false);
	     t1.setBounds(20, 100, 450, 300);
	     add(t1);

	     JButton back=new JButton("Back");
	     back.setBounds(200, 420, 100, 25);
	     back.setBackground(Color.BLACK);
	     back.setForeground(Color.WHITE);
	     back.addActionListener(this);
	     add(back);
		 setVisible(true);
	}

	public static void main(String[] args) {
		new About();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		setVisible(false);
		
	}

}
