import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.*;
public class JTreeDemo {
	JTreeDemo()
	{
		JFrame frame=new JFrame();
		frame.setSize(600,600);
		frame.setVisible(true);
		DefaultMutableTreeNode root=new DefaultMutableTreeNode("Menu");
		DefaultMutableTreeNode c1=new DefaultMutableTreeNode("File");
		DefaultMutableTreeNode c11=new DefaultMutableTreeNode("New");
		DefaultMutableTreeNode c12=new DefaultMutableTreeNode("Save");
		DefaultMutableTreeNode c13=new DefaultMutableTreeNode("Save As");
		DefaultMutableTreeNode c2=new DefaultMutableTreeNode("Edit");
		DefaultMutableTreeNode c21=new DefaultMutableTreeNode("UNDO");
		DefaultMutableTreeNode c22=new DefaultMutableTreeNode("Redo");
		DefaultMutableTreeNode c23=new DefaultMutableTreeNode("Cut");
		root.add(c1);
		c1.add(c11);
		c1.add(c12);
		c1.add(c13);
		root.add(c2);
		c2.add(c21);
		c2.add(c22);
		c2.add(c23);
		JTree tree=new JTree(root);
		JScrollPane scrl=new JScrollPane(tree);
		frame.setLayout(null);
		scrl.setBounds(100,100,200,200);
		frame.add(scrl);
	}
	public static void main(String args[])
	{
		new JTreeDemo();
	}
}
