package Menu;

import java.awt.*;

public class MenuB {
	MenuB()
	{
		Frame f=new Frame("Menu Bar Demo");
		f.setSize(500,400);
		f.setVisible(true);
		
		MenuBar mbar= new MenuBar();
		f.setMenuBar(mbar);
		
		Menu m1=new Menu("File");
		MenuItem mi1=new MenuItem("New");
		MenuItem mi2=new MenuItem("Save");
		MenuItem mi3=new MenuItem("Save As");
		MenuItem mi4=new MenuItem("Print");
		MenuItem mi5=new MenuItem("Exit");
		m1.add(mi1);
		m1.add(mi2);
		m1.add(mi3);
		m1.add(mi4);
		m1.add(mi5);
		mbar.add(m1);
		
		Menu m2=new Menu("Edit");
		Menu m3=new Menu("Search");
		Menu m4=new Menu("Run");
		
	}
	public static void main(String args[])
	{
		MenuB mb=new MenuB();
	}

}
