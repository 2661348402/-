package summer_day16;

import java.awt.Frame;
import java.awt.Rectangle;
import java.awt.Window;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameDemo {
	public static void main(String[] args) {
		Frame f=new Frame();
//		f.setSize(400,400);
//		f.setLocation(200, 200);
//		f.setBounds(100, 100, 800, 800);
		Rectangle r=new Rectangle(100, 100, 800, 800);
		f.setBounds(r);
		f.setTitle("i love china");
		f.setVisible(true);
//		f.addWindowListener(new WindowListener() {
//
//			@Override
//			public void windowOpened(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//
//			@Override
//			public void windowClosing(WindowEvent e) {
//				System.exit(0);
//				
//			}
//
//			@Override
//			public void windowClosed(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//
//			@Override
//			public void windowIconified(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//
//			@Override
//			public void windowDeiconified(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//
//			@Override
//			public void windowActivated(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//
//			@Override
//			public void windowDeactivated(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//		});
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
	}

}
