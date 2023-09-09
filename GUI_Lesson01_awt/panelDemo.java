package GUI.GUI_Lesson01_awt;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class panelDemo {
    public static void main(String[] args) {
        Frame frame=new Frame("潮流");
        Panel panel=new Panel();

       frame.setLayout(null);
        frame.setBounds(400,200,400,400);
        frame.setBackground(Color.green);
        panel.setBackground(Color.red);
        panel.setSize(200,200);
        frame.add(panel);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
               System.exit(0);
            }
        });
        frame.setVisible(true);
    }



}
