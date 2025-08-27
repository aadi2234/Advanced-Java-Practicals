import java.awt.*;
import java.applet.*;
class Practical extends Frame
{
	Practical()
	{
		setVisible(true);
		setSize(500,400);
		setLayout(new FlowLayout());
		Label l=new Label("Enter Your Name");
		Label l2=new Label("Enter Password:");
		add(l);
		add(l2);
		
		Button b1=new Button("Submit");
		Button b2=new Button("Cancel");
		add(b1);
		add(b2);
		
		Checkbox c1=new Checkbox("Computer",true);
		Checkbox c2=new Checkbox("IT");
		Checkbox c3=new Checkbox("civil",true);
		
		add(c1);
		add(c2);
		add(c3);
	}	

	public static void main(String[] args) 
	{
		Practical p=new Practical();

	}

}