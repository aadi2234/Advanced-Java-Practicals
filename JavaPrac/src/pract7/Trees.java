package pract7;

import java.awt.*;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class Trees {
    JTree tree;
    JFrame f;
    Trees()
    {
        f=new JFrame();
        f.setLayout(new BorderLayout());
        DefaultMutableTreeNode top=new DefaultMutableTreeNode("Branch");
         DefaultMutableTreeNode a =new DefaultMutableTreeNode("Computer Engg");  
         top.add(a);
         DefaultMutableTreeNode b =new DefaultMutableTreeNode("Electrical Engg");  
         top.add(b);
                  DefaultMutableTreeNode a1 =new DefaultMutableTreeNode("FY");
                DefaultMutableTreeNode a2 =new DefaultMutableTreeNode("SY");
                         DefaultMutableTreeNode a3 =new DefaultMutableTreeNode("TY");
          a.add(a1);
          a.add(a2);
          a.add(a3);
          DefaultMutableTreeNode b1 =new DefaultMutableTreeNode("FY");
                DefaultMutableTreeNode b2 =new DefaultMutableTreeNode("SY");
                         DefaultMutableTreeNode b3 =new DefaultMutableTreeNode("TY");
          b.add(b1);
          b.add(b2);
          b.add(b3);
          tree= new JTree (top);
          JScrollPane j=new JScrollPane(tree);
          f.add(j,BorderLayout.CENTER);
          f.setSize(5000,5000);
          f.setVisible(true);
       }  
    public static void main (String args [])
    {
      Trees t1=new Trees ();
    }
   
}