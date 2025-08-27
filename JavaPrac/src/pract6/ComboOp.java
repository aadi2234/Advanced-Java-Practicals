package pract6;

import javax.swing.*;

public class ComboOp extends JFrame{

	public ComboOp() {
		setSize(500,300);
		setLayout(null);
		String city[]={"Mumbai","Solapur","Pune","Banglore"};
		JComboBox<String> jb=new JComboBox<String>(city);
		jb.setBounds(50,100,100,30);
		add(jb);
		JLabel lb=new JLabel("You are in "+ jb.getSelectedItem());
		lb.setBounds(180,100,2000,30);
		add(lb);
		setVisible(true);
	}
	public static void main(String args[]) {
		new ComboOp();
	}

}
