package GUI.GUI_Lesson03_swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JDialogDemo2 extends JDialog {
    JDialogDemo2(){
        super(new MyJFrame("竹筐口"),"长大了我要当太空人",true);
        setSize(200,200);

        Container container=getContentPane();
        container.setBackground(Color.green);
        container.add(new JLabel("爷爷奶奶可高兴了"));
    }

    public static void main(String[] args) {
        new JDialogDemo2();
    }
}
class MyJFrame extends JFrame{
    MyJFrame(String title){
        super(title);
        setBounds(400,300,500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        Container con=getContentPane();
        con.setBackground(Color.green);
        JButton button=new JButton("点击弹出广告");
        button.setSize(50,50);

        con.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new  JDialogDemo2().setVisible(true);
            }
        });
        setVisible(true);
    }
}
