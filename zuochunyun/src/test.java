import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class test {
    public static void main(String[] args) {
        float f1=0.1f;
        double f2=0.1;
        System.out.println(f1==f2);
       //提取一个数的右侧第一个1
        int ero=14;
        int rightOne=ero&(~ero+1);
        System.out.println(rightOne);
        int a=2;
        int b=2;
        Timer timer =new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("开始时间："+new Date());
            }
        });
        System.out.println("执行到这里了");
        timer.start();
    }
}
