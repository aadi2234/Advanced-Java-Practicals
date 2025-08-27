import java.awt.*;

public class Pgm1 extends Frame
{
    Pgm1()
    {
        setVisible(true);
        setSize(400,400);
        setLayout(new GridLayout(5,5));
        int b=1;
        for(int i=0;i<5;++i)
        {
            for(int j=0;j<5;++j)
            {
                add(new Button("Button"+b));
                b++;
            }
        }
        
        
    }
    public static void main(String[] args) {
       Pgm1 p=new Pgm1();
    }
}
