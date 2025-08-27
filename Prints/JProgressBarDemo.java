import javax.swing.*;
public class JProgressBarDemo {
	JProgressBarDemo(){
		JFrame frame=new JFrame();
		frame.setSize(600,600);
		frame.setVisible(true);
		JProgressBar prg=new JProgressBar(0,100);
		prg.setValue(0);
		prg.setStringPainted(true);
		
		frame.setLayout(null);
		prg.setBounds(200,100,150,100);
		frame.add(prg);
		
		try {
			for(int i=0;i<=100;i++)
			{
				prg.setValue(i);
				Thread.sleep(50);
			}
		}
		catch(Exception e)
		{
		}
	}
	public static void main(String args[]) {
		new JProgressBarDemo();
	}
}
