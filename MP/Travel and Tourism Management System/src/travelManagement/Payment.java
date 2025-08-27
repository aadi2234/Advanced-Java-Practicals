package travelManagement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Payment extends JFrame implements ActionListener{
	JButton pay,back;
	public Payment() {
		setBounds(300, 100, 800, 600);
		setLayout(null);
		
		ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icons/paytm.jpeg"));
        Image i21 = i11.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        ImageIcon i31 = new ImageIcon(i21);
        JLabel image = new JLabel(i31);
        image.setBounds(0,0,800,600);
        add(image);
		
        pay=new JButton("Pay");
        pay.setBounds(420, 0, 80, 40);
        pay.setBackground(Color.BLACK);
        pay.setForeground(Color.WHITE);
        pay.addActionListener(this);
        image.add(pay);
        
        back=new JButton("Back");
        back.setBounds(520, 0, 80, 40);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        image.add(back);
		
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==pay)
		{
			setVisible(false);
			new Paytm();
		}else if(e.getSource()==back)
		{
			setVisible(false);
		}
		else
		{
			
		}
	}

	public static void main(String[] args) {
	new Payment();
	}


}
