package Layout;

import java.awt.*;


public class Gridlayout {
	Gridlayout()
	{
		Frame f=new Frame("GridLayout Demo");
		f.setSize(300,200);
		f.setVisible(true);
		GridLayout GL=new GridLayout(3,2,5,5);
		f.setLayout(GL);
		Button b1=new Button("Button 1");
		Button b2=new Button("Button 2");
		Button b3=new Button("Button 3");
		Button b4=new Button("Button 4");
		Button b5=new Button("Button 5");
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
	}
	public static void main(String args[])
	{
		Gridlayout gl=new Gridlayout();
	}
}
