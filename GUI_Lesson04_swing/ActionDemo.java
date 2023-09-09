package GUI.GUI_Lesson04_swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ActionDemo extends JFrame implements KeyListener,ActionListener {
    boolean status=false;
    ActionDemo() {
        setBounds(200, 100, 300, 300);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        addKeyListener(this);
        Timer timer=new Timer(100,this);
        timer.start();

    }
    public static void main(String[] args) {
        new ActionDemo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(status) {

            System.out.println("会一直执行");
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
    int keycode=e.getKeyCode();
    if(keycode==KeyEvent.VK_SPACE){
        status=!status;
        System.out.println("你按下了空格键 ");
    }
    }


    public void keyReleased(KeyEvent e) {

    }
}
