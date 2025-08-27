package pract6;

import javax.swing.*;

public class StatesComboBx extends JFrame{

	public StatesComboBx() {
		setSize(500,300);
		setLayout(null);
		String states[]={"Maharashtra","Punjab","Gujrat","Rajastan","Goa"};
		JComboBox<String> jb=new JComboBox<String>(states);
		jb.setBounds(50,100,100,30);
		add(jb);
		setVisible(true);
	}
	public static void main(String args[]) {
		new StatesComboBx();
	}

}
