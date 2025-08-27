import java.awt.*;

public class SubOP extends Frame
{
    public SubOP(String s)
    {
        super(s);
        setVisible(true);
        setSize(400,600);
         
        Label lb=new Label("Select Subjects You Like");
        lb.setBounds(50, 250, 150, 50);
        add(lb);

        
        List lt1=new List(4,true);
        lt1.add("Maths");
        lt1.add("Physics");
        lt1.add("Chemistry");
        lt1.add("C++");
        lt1.add("Java");
        add(lt1);
     
    }
    public static void main(String[] args) {
       new SubOP("Subject Frame");
    }
}
