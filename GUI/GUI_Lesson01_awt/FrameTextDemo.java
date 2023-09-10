package GUI.GUI_Lesson01_awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameTextDemo {
    public static void main(String[] args) {
        Frame frame=new MyFrame2("test");

    }
}
class MyFrame2 extends Frame {
    MyFrame2(String title){
        super(title);

        TextField tf=new TextField();
        add(tf);
        tf.setEchoChar('#');
        tf.addActionListener(new monitor());

       setBounds(200,100,200,200);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }

}
class monitor implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        TextField tf=(TextField) e.getSource();
        System.out.println(tf.getText());
        tf.setText("");
    }
}

