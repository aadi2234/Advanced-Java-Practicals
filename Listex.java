import java.awt.*;

public class Listex extends Frame
{
    public Listex(String s)
    {
        super(s);
        setVisible(true);
        setSize(700,700);
        List lt1=new List(4,true);
        lt1.add("Mumbai");
        lt1.add("Pune");
        lt1.add("Nashik");
        lt1.add("Thane");
        lt1.add("Sangali");
        lt1.add("Nagpur");
        lt1.add("Delhi");
        lt1.add("Hydrabad");
        lt1.add("Kolkata");
        lt1.add("Dhule");
        add(lt1);
        
    }
    public static void main(String[] args) {
       new Listex("List Frame");
    }
}
