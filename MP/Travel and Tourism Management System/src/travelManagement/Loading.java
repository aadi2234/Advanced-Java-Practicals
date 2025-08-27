package travelManagement;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class Loading extends JFrame implements Runnable{

	Thread t;
	JProgressBar bar;
	String username;
	@Override
	public void run() {
		try{
			for(int i=0;i<=100;i++)
			{
				int max=bar.getMaximum();//100
				int value=bar.getValue();
				if(value<max)
				{
					bar.setValue(bar.getValue()+1);
				}
				else{
					setVisible(false);
					new Dashboard(username);
				}
				Thread.sleep(50);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public Loading(String username) {
		this.username=username;
		t=new Thread(this);
		setBounds(400, 200, 650, 400);
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
        JLabel txt = new JLabel("Travel and Toursim Application");
        txt.setForeground(new Color(72, 209, 204));
        txt.setFont(new Font("Matura MT Script Capitals", Font.BOLD, 35));
        txt.setBounds(50, 20, 600, 40);
        add(txt);
        
        bar=new JProgressBar();
        bar.setBounds(150, 100, 300, 35);
        bar.setStringPainted(true);
        add(bar);
        
        JLabel loading = new JLabel("Loading,please wait...");
        loading.setForeground(Color.RED);
        loading.setFont(new Font("Matura MT Script Capitals", Font.BOLD, 16));
        loading.setBounds(220, 140, 250, 30);
        add(loading);
        
        JLabel username1 = new JLabel("Welcome..."+username);
        username1.setForeground(Color.RED);
        username1.setFont(new Font("Raleway", Font.BOLD, 16));
        username1.setBounds(20, 310, 400, 40);
        add(username1);
        t.start();
        setVisible(true);
	}
	public static void main(String[] args) {
		new Loading("");
	}

	
	

}
