import java.awt.*;

public class ListNP extends Frame
{
    public ListNP(String s)
    {
        super(s);
        setVisible(true);
        setSize(700,700);
        setBackground(Color.CYAN);
        setLayout(new FlowLayout());

        
        Label lb=new Label("Select NewsPapers You Like");
        add(lb);
        
        List lt1=new List(5,true);

        lt1.setBackground(Color.YELLOW);
        lt1.add("Times of India");
        lt1.add("Lokmat");
        lt1.add("Sakal");
        lt1.add("Loksatta");
        lt1.add("Pudhari");
        lt1.add("Mumbai Times");
        lt1.add("Punya Nagari");
        lt1.add("Deshdoot");
        lt1.add("Chaufer");
        lt1.add("Sagar");
        add(lt1);

        
    }
    public static void main(String[] args) {
       new ListNP("News Paper List Frame");
    }
}
