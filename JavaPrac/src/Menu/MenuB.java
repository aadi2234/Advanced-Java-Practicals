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
		MenuItem mj1=new MenuItem("Undo");
		MenuItem mj2=new MenuItem("Redo");
		MenuItem mj3=new MenuItem("Cut");
		MenuItem mj4=new MenuItem("Copy");
		MenuItem mj5=new MenuItem("Paste");
		m2.add(mj1);
		m2.add(mj2);
		m2.add(mj3);
		m2.add(mj4);
		m2.add(mj5);
		mbar.add(m2);
		
		Menu m3=new Menu("Search");
		MenuItem mk1=new MenuItem("Find");
		MenuItem mk2=new MenuItem("Replace");
		MenuItem mk3=new MenuItem("Go To");
		MenuItem mk4=new MenuItem("Mark");
		MenuItem mk5=new MenuItem("BookMark");
		m3.add(mk1);
		m3.add(mk2);
		m3.add(mk3);
		m3.add(mk4);
		m3.add(mk5);
		mbar.add(m3);
		
		Menu m4=new Menu("View");
		MenuItem ml1=new MenuItem("Zoom");
		MenuItem ml2=new MenuItem("Move");
		MenuItem ml3=new MenuItem("Show Symbol");;
		MenuItem ml4=new MenuItem("Tab");
		MenuItem ml5=new MenuItem("Summary");
		
		m4.add(ml1);
		m4.add(ml2);
		m4.add(ml3);
		m4.add(ml4);
		m4.add(ml5);
		mbar.add(m4);
		
	}
	public static void main(String args[])
	{
		MenuB mb=new MenuB();
	}


}
