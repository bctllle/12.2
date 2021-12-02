package TanChiShe;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Demo6 extends JFrame {
public Demo6() {
	setBounds(100,100,180,110);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	Container c=getContentPane();
	c.setLayout(new FlowLayout());
	JRadioButton left=new JRadioButton("向左");
	JRadioButton right=new JRadioButton("向右");
	c.add(left);
	c.add(right);
	ButtonGroup group=new ButtonGroup();
	group.add(right);
	group.add(left);
	left.add(right);
	JButton btn=new JButton("打印");
	btn.addActionListener(new ActionListener() {
	public void	actionPerformed(ActionEvent e){
			System.out.println(left.getText()+"按钮选中的状态:"+left.isSelected());
	      System.out.println(right.getText()+"按钮选中状态:"+right.isSelected());	
	     group.clearSelection();
	}
	});
	c.add(btn);
	setVisible(true);
	
}
     public static void main(String[] args) {
		new Demo6();
	}
}
