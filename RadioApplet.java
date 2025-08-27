import java.awt.*;
public class RadioApplet extends Frame
{
    public RadioApplet(String msg)
    {
        super(msg);
        Label l1=new Label("Choose the Gender");
        CheckboxGroup cg=new CheckboxGroup();
        Checkbox c1=new Checkbox("Male", cg,false);
        Checkbox c2=new Checkbox("FeMale", cg,false);
        add(l1);
        add(c1);
        add(c2);
        setSize(500, 700);
        setLayout(new FlowLayout());
    }
    public static void main(String[] args) {
        RadioApplet r=new RadioApplet("Radio Button Demo");
        r.setVisible(true);
    }
}