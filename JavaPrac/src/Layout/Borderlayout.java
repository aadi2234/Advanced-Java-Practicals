package Layout;

import java.awt.*;

import Menu.MenuB;

public class Borderlayout {
	Borderlayout()
	{
		Frame f=new Frame("Borderlayout Demo");
		f.setSize(300,200);
		f.setVisible(true);
		BorderLayout bl=new BorderLayout();
		Button b1=new Button("North");
		Button b2=new Button("West");
		Button b3=new Button("Center");
		Button b4=new Button("East");
		Button b5=new Button("South");
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
	}
	public static void main(String args[])
	{
		Borderlayout gl=new Borderlayout();
	}
}
