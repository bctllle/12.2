package TanChiShe;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Demo9 extends JFrame {
public Demo9() {
	setBounds(100,100,100,100);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	Container c=getContentPane();
	c.setLayout(null);
	
    //JComboBox<String>comboBox=new JComboBox<>();
	//comboBox.addItem("���֤");
	//comboBox.addItem("���֤");
	//comboBox.addItem("���֤");
	
	//String items[]= {"����Ԫ��1","����Ԫ��2","����Ԫ��3"};
	//JComboBox<String>comboBox=new JComboBox<>(items);
	JComboBox<String>comboBox=new JComboBox<>();
	String items[]= {"����Ԫ��1","����Ԫ��2","����Ԫ��3"};
	ComboBoxModel cm=new DefaultComboBoxModel<>(items);
	comboBox.setModel(cm);
	JButton btn=new JButton("��ӡ");
	btn.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e){
			System.out.println("ѡ�е�����:"+comboBox.getSelectedIndex());
            System.out.println("ѡ�е�ֵ:"+comboBox.getSelectedIndex());
		}
	});
	btn.setBounds(100, 100, 100, 100);
	c.add(btn);
	comboBox.setEditable(true);
	comboBox.setBounds(10,10,80,21);
	c.add(comboBox);
	setVisible(true);
	
}
public static void main(String[] args) {
	new Demo9();
}
}
