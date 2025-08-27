package pract6;

import javax.swing.*;

public class LanguageJCombo extends JFrame{

	public LanguageJCombo() {
		setSize(500,300);
		setLayout(null);
		String states[]={"English","Marathi","Hindi","Sanskrit"};
		JComboBox<String> jb=new JComboBox<String>(states);
		jb.setBounds(50,100,100,30);
		add(jb);
		setVisible(true);
	}
	public static void main(String args[]) {
		new LanguageJCombo();
	}

}
