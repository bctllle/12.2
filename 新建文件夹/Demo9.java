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
	//comboBox.addItem("身份证");
	//comboBox.addItem("身份证");
	//comboBox.addItem("身份证");
	
	//String items[]= {"数组元素1","数组元素2","数组元素3"};
	//JComboBox<String>comboBox=new JComboBox<>(items);
	JComboBox<String>comboBox=new JComboBox<>();
	String items[]= {"数组元素1","数组元素2","数组元素3"};
	ComboBoxModel cm=new DefaultComboBoxModel<>(items);
	comboBox.setModel(cm);
	JButton btn=new JButton("打印");
	btn.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e){
			System.out.println("选中的索引:"+comboBox.getSelectedIndex());
            System.out.println("选中的值:"+comboBox.getSelectedIndex());
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
