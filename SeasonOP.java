import java.awt.*;

public class SeasonOP extends Frame
{
    public SeasonOP(String s)
    {
        super(s);
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(700,700);

        List lt1=new List(3,false);
        lt1.add("Summer");
        lt1.add("Winter");
        lt1.add("Rainy");
        add(lt1);
        
    }
    public static void main(String[] args) {
       new SeasonOP("Season Frame");
    }
}
