package GUI.GUI_Lesson01_awt;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class LayoutDemo {
    public static void main(String[] args) {
        //创建窗口
        Frame frame=new Frame("布局");
        //创建面板
        Panel p1=new Panel();
        Panel p2=new Panel();
        Panel p3=new Panel();
        Panel p4=new Panel();
        //创建按钮
        Button b1=new Button("button");
        Button b2=new Button("button");
        Button b3=new Button("button");
        Button b4=new Button("button");
        Button b5=new Button("button");
        Button b6=new Button("button");
        Button b7=new Button("button7");
        Button b8=new Button("button8");
        Button b9=new Button("button9");
        Button b10=new Button("button10");

        //窗口设置
        frame.setLayout(new GridLayout(2,1));
        frame.setBounds(200,100,400,400);
        frame.setBackground(Color.green);

        //添加
        frame.add(p1);
        frame.add(p2);

        p1.setLayout(new GridLayout(1,3));
        p1.add(b1);
        p1.add(p3);
        p1.add(b2);

        p3.setLayout(new GridLayout(2,1));
        p3.add(b3);
        p3.add(b4);

        p2.setLayout(new GridLayout(1,3));
        p2.add(b5);
        p2.add(p4);
        p2.add(b6);

        p4.setLayout(new GridLayout(2,2));
        p4.add(b7);
        p4.add(b8);
        p4.add(b9);
        p4.add(b10);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frame.setVisible(true);






    }
}
