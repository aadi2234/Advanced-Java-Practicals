import java.awt.*;

public class PR_Exe_1_2 extends Frame
{
    public PR_Exe_1_2(String s)
    {
        super(s);
        setLayout(null);
        setVisible(true);
        setSize(700,700);
        setBackground(Color.CYAN);
        Label l1=new Label("Select Multiple Languages:-");
        l1.setBounds(20,100,200,30);
        l1.setBackground(Color.ORANGE);
        add(l1);

        Checkbox c1=new Checkbox("Marathi",false);
        c1.setBounds(20,180,200,50);
        add(c1);

        Checkbox c2=new Checkbox("Hindi",false);
        c2.setBounds(250,180,200,50);
        add(c2);

        Checkbox c3=new Checkbox("English",false);
        c3.setBounds(20,220,200,50);
        add(c3);

        Checkbox c4=new Checkbox("Sanskrit",false);
        c4.setBounds(250,220,200,50);
        add(c4);

        Checkbox c5=new Checkbox("Bengali",false);
        c5.setBounds(20,250,200,50);
        add(c5);
    
        Checkbox c6=new Checkbox("French",false);
        c6.setBounds(250,250,200,50);
        add(c6);

        Checkbox c7=new Checkbox("Greek",false);
        c7.setBounds(20,280,200,50);
        add(c7);

        Checkbox c8=new Checkbox("Gujarati",false);
        c8.setBounds(250,280,200,50);
        add(c8);
    }
    public static void main(String[] args) {
       new PR_Exe_1_2("Language Frame");
    }
}