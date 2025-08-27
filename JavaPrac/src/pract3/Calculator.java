package pract3;

import java.awt.*;

public class Calculator extends Frame{
	public Calculator() {
		setSize(500,400);
		setVisible(true);
		GridLayout g1=new GridLayout(2,1,5,5);
		GridLayout g2=new GridLayout(4,5,5,5);
		setLayout(g1);
		Panel p=new Panel();
		p.setLayout(g2);
		Panel p1=new Panel();
		p1.setLayout(g2);
		TextField t1=new TextField();
		add(t1);
		add(p);
		Button b1=new Button("7");
		Button b2=new Button("8");
		Button b3=new Button("9");
		Button b111=new Button("DEL");
		Button b112=new Button("AC");
		Button b4=new Button("4");
		Button b5=new Button("5");
		Button b6=new Button("6");
		Button b221=new Button("*");
		Button b222=new Button("/");
		Button b7=new Button("1");
		Button b8=new Button("2");
		Button b9=new Button("3");
		Button b331=new Button("+");
		Button b332=new Button("-");
		Button b10=new Button("0");
		Button b11=new Button(".");
		Button b12=new Button("EXP");
		Button b441=new Button("Ans");
		Button b442=new Button("=");
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p1.add(b111);
		p1.add(b112);
		p1.add(b4);
		p1.add(b5);
		p1.add(b6);
		p1.add(b221);
		p1.add(b222);
		p1.add(b7);
		p1.add(b8);
		p1.add(b9);
		p1.add(b331);
		p1.add(b332);
		p1.add(b10);
		p1.add(b11);
		p1.add(b12);
		p1.add(b441);
		p1.add(b442);
		add(p1);
	}

	public static void main(String[] args) {
		Calculator cl=new Calculator();

	}

}
