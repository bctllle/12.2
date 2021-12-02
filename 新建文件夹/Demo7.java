package TanChiShe;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Demo7 extends JFrame{
	public Demo7() {
		setBounds(100,100,500,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c=getContentPane();
		JTextArea area=new JTextArea();
		JScrollPane sp=new JScrollPane(area);
		c.add(area);
		setVisible(true);
	}

	private void mian(String[]args) {
		// TODO Auto-generated method stub
         new Demo7();
	}
}
