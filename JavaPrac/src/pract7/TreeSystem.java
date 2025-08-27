package pract7;

import java.awt.*;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class TreeSystem extends JFrame{

	public TreeSystem() {
		
		setLayout(new BorderLayout());
		DefaultMutableTreeNode top=new DefaultMutableTreeNode("Computer");
		DefaultMutableTreeNode a=new DefaultMutableTreeNode("Local Disk (C:)");
		top.add(a);
		DefaultMutableTreeNode b=new DefaultMutableTreeNode("Local Disk (D:)");
		top.add(b);
		DefaultMutableTreeNode c=new DefaultMutableTreeNode("Local Disk (E:)");
		top.add(c);
		DefaultMutableTreeNode a1=new DefaultMutableTreeNode("Program Files");
		DefaultMutableTreeNode a2=new DefaultMutableTreeNode("Users");
		DefaultMutableTreeNode a3=new DefaultMutableTreeNode("Windows");
		a.add(a1);
		a.add(a2);
		a.add(a3);
		
		DefaultMutableTreeNode b1=new DefaultMutableTreeNode("Aditya");
		DefaultMutableTreeNode b2=new DefaultMutableTreeNode("KKWP");
		DefaultMutableTreeNode b3=new DefaultMutableTreeNode("IMPORTANT");
		b.add(b1);
		b.add(b2);
		b.add(b3);
		
		DefaultMutableTreeNode c1=new DefaultMutableTreeNode("Solution");
		DefaultMutableTreeNode c2=new DefaultMutableTreeNode("Sparsh 2k23");
		DefaultMutableTreeNode c3=new DefaultMutableTreeNode("Project Setup");
		c.add(c1);
		c.add(c2);
		c.add(c3);
		
		JTree jt=new JTree(top);
		JScrollPane jsp=new JScrollPane(jt);
		add(jsp,BorderLayout.CENTER);
		setSize(500,400);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new TreeSystem();
	}
}
