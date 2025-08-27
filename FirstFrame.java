import java.awt.*;
public class FirstFrame extends Frame
{
    FirstFrame()
    {
        Button b=new Button("Click me!");
        b.setBounds(10,50,100,100);
        add(b);
        setSize(700,700);
        setVisible(true);
        setLayout(null);
    }
    public static void main(String[] args) {
        FirstFrame f=new FirstFrame();
    }
}