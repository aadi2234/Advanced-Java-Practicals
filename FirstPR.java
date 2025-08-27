import java.applet.Applet;
import java.awt.*;
/*<applet 
    code=FirstPR.class
    width=700
    height=700>
</applet>*/

public class FirstPR extends Applet
{
    public void init()
    {
                setLayout(null);
                setVisible(true);
                setSize(700,700);
                Label l1=new Label("Enter Name:-");
                l1.setBounds(20,50,100,30);
                add(l1);

                TextField tf1=new TextField(20);
                tf1.setBounds(200,50,200,30);
                add(tf1);

                Label l2=new Label("Enter Address:-");
                l2.setBounds(20,100,100,30);
                add(l2);

                TextArea ta1=new TextArea();
                ta1.setBounds(200,100,250,50);
                add(ta1);

                Label l3=new Label("Choose your Branch:-");
                l3.setBounds(20,140,150,50);
                add(l3);

                Checkbox c1=new Checkbox("Computer",false);
                c1.setBounds(20,180,200,50);
                add(c1);

                Checkbox c2=new Checkbox("Civil",false);
                c2.setBounds(250,180,200,50);
                add(c2);

                Checkbox c3=new Checkbox("Mechanical",false);
                c3.setBounds(20,220,200,50);
                add(c3);

                Checkbox c4=new Checkbox("Electrical",false);
                c4.setBounds(250,220,200,50);
                add(c4);

                Checkbox c5=new Checkbox("AIML",false);
                c5.setBounds(20,240,200,50);
                add(c5);

                Checkbox c6=new Checkbox("IT",false);
                c6.setBounds(250,240,200,50);
                add(c6);

                Checkbox c7=new Checkbox("Chemical",false);
                c7.setBounds(20,270,200,50);
                add(c7);

                Label l4=new Label("Choose your Qualification Level:-");
                l4.setBounds(20,320,200,50);
                add(l4);

                CheckboxGroup chg = new CheckboxGroup();
                Checkbox c8=new Checkbox("10th",chg,false);
                c8.setBounds(20,360,200,50);
                add(c8);

                Checkbox c9=new Checkbox("12th",chg,false);
                c9.setBounds(250,360,200,50);
                add(c9);

                Button b=new Button("Submit!");
                b.setBounds(250,450,100,30);
                add(b);
        }
}