package GUI.GUI_Lesson01_awt;

import java.awt.*;

public class MyFrameTest {
    public static void main(String[] args) {
        Frame frame1=new MyFrame("1",200,100);
        Frame frame2=new MyFrame("2",400,100);
        Frame frame3=new MyFrame("3",200,300);
        Frame frame4=new MyFrame("4",400,300);

    }
}

 class MyFrame extends Frame {

    MyFrame(String title,int x,int y){
        super(title);
        setBounds(x,y,200,200);
        setBackground(Color.green);
        setVisible(true);
    }
}

