package TanChiShe;

import java.awt.*;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class Demo11 extends JFrame{
	public Demo11() {
		setBounds(100,100,217,167);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(null);
		String items[]= {"1","2","3","4","5","6","7","8"};
		JList<String>j1=new JList<>(items);
		
		DefaultListModel<String> model=new DefaultListModel<>();
		
		//c.add(j1);
		JScrollPane js=new JScrollPane(j1);
		js.setBounds(10,10,100,100);
		c.add(js);
		setVisible(true);
		
	}
public static void main(String[] args) {
	new Demo11();
}
}
