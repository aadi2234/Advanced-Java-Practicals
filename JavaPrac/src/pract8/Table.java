package pract8;

import javax.swing.*;

public class Table extends JFrame{

	public Table() {
		String rows[][]={
							{"Kiran","86.54","Destination"},
							{"Vishal","73.90","First Class"},
							{"Sham","64.31","Second Class"},
							{"Aditya","91.73","Destination"},
							{"Shraddha","84.76","Destination"},
							{"Rajesh","44.22","Pass Class"},
							{"Nitin","74.00","Second Class"},
							{"Sanika","89.00","Destination"},
							{"Kanha","39.87","Fail"},
							{"Prasad","93.17","Destination"},
						};
		String cols[]={"Name of Student","Percentage","Grade"};
		JTable jt=new JTable(rows,cols);
		jt.setBounds(30,40,300,300);
		JScrollPane jsp=new JScrollPane(jt);
		add(jsp);
		setSize(500,300);
		setVisible(true);
	}
	public static void main(String [] args)
	{
		new Table();
	}
}

