package TanChiShe;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class Demo8 extends JFrame {
	public Demo8(){
		setBounds(100,200,200,200);//���ô��������С
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);//���ô���ɿ�
	Container c= getContentPane();
	c.setLayout(new FlowLayout());
	JCheckBox c1=new JCheckBox("1");
	JCheckBox c2=new JCheckBox("2");
	JCheckBox c3=new JCheckBox("3");
	c.add(c1);
	c.add(c2);
	c.add(c3);
	c1.setSelected(true);
	JButton btn=new JButton("��ӡ");
	btn.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent srg0){
			System.out.println(c1.getText()+"��ѡ���е�״̬:"+c1.isSelected());
			System.out.println(c2.getText()+"��ѡ���е�״̬:"+c2.isSelected());
			System.out.println(c3.getText()+"��ѡ���е�״̬:"+c3.isSelected());
		}
	});
	c.add(btn);
	setVisible(true);
	}
      private void mian(String []args) {
		// TODO Auto-generated method stub
       new Demo8();
	}
}
