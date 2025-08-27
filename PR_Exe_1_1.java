import java.applet.Applet;
import java.awt.*;
/*<applet 
    code=PR_Exe_1_1.class
    width=500
    height=500>
</applet>*/

public class PR_Exe_1_1 extends Applet
{
    public void init()
    {
        setLayout(null);
        setVisible(true);
        setSize(700,700);
        Label lb=new Label("Welcome to JAVA");
        lb.setBackground(Color.GRAY);
        lb.setBounds(250, 200, 100, 50);
        add(lb);
    }
}