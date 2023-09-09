package GUI.GUI_Lesson02_awt;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class KeyboardDemo {
    public static void main(String[] args) {
        new keyFrame("键盘");
    }
}
class keyFrame extends Frame{
    keyFrame(String title){
        super(title);
        setBounds(200,100,300,300);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowActivated(WindowEvent e) {
                System.out.println("窗口已被激活");
            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("窗口已关闭");
                System.exit(0);
            }
        });
        setVisible(true);
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println(e.getKeyChar());
                if(e.getKeyCode()==KeyEvent.VK_UP){
                    System.out.println("你按下了上键");
                }
            }
        });
    }
}
