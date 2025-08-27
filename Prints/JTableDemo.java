import javax.swing.*;
public class JTableDemo {
	JTableDemo()
	{
		JFrame frame=new JFrame();
		frame.setSize(600,600);
		frame.setVisible(true);
		String cloumns[]= {"Roll No","Name","Percent"};
		String rows[][]= {{"17","Prasad","95"},
							{"44","Pragati","96"},
							{"9","Aditya","90"}};
		JTable table=new JTable(rows,cloumns);
		JScrollPane scrl=new JScrollPane(table);
		frame.setLayout(null);
		scrl.setBounds(100,100,200,200);
		frame.add(scrl);
	}
	public static void main(String args[])
	{
		new JTableDemo();
	}
}
