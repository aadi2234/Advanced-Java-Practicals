import java.applet.*;
import java.awt.*;
/*<applet 
    code="Demo.java"
    width=500
    height=500>
</applet>*/

public class Demo extends Applet
{
    public void init()
    {
        Label lb=new Label("Welcome to JAVA");
        lb.setBackground(Color.GRAY);
        lb.setBounds(250, 200, 100, 50);
        add(lb);
    }
	public void paint(Graphics g)
	{
	}
}