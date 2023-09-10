package summer_day16;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonDemo {
	public static void main(String[] args) {
		Frame f=new Frame("数据转移");
		
		f.setBounds(450,250,500,500);
		//f.setLayout(new CardLayout());
		//f.setLayout(new FlowLayout());
		//f.setLayout(new GridBagLayout());
		f.setLayout(new GridLayout());
		
		final TextField tf=new TextField(20);
		Button b=new Button("数据转移");
		final TextArea ta=new TextArea(25,40);
		
		f.add(tf);
		f.add(b);
		f.add(ta);
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String str=tf.getText().trim();
				tf.setText("");
				
				//ta.setText(str);
				ta.append(str+"\n\r");
				
				tf.requestFocus();
			}
			
		});
		
		f.setVisible(true);
		
	}

}
