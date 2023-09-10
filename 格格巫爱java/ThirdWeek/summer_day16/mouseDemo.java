package summer_day16;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class mouseDemo {
	public static void main(String[] args) {
		Frame f=new Frame();
		
		f.setBounds(400,300,200,200);
		f.setLayout(new FlowLayout());
		
		Button b1=new Button("黄色");
		Button b2=new Button("红色");
		Button b3=new Button("蓝色");
		Button b4=new Button("复原");
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		
//		b1.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//			f.setBackground(Color.yellow);				
//			}});
//		b2.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//			f.setBackground(Color.red);				
//			}});
//		b3.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//			f.setBackground(Color.blue);				
//			}});
//		b4.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//			f.setBackground(Color.white);				
//			}});
		
		b1.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseEntered(MouseEvent e) {
				f.setBackground(Color.yellow);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				f.setBackground(Color.blue);
			}
			
		});
		f.setVisible(true);
	
	}
}
