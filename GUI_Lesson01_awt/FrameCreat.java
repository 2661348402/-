package GUI.GUI_Lesson01_awt;

import java.awt.*;

public class FrameCreat {
    public static void main(String[] args) throws InterruptedException {
        //创建一个新的窗口
        Frame frame=new Frame("这是一个窗口");
        //设置窗口参数
        frame.setBackground(Color.red);
        frame.setBounds(200,100,400,400);
        Thread.sleep(1000);
        frame.setResizable(false);
        frame.setVisible(true);
    }

}