import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class test {

    public static void main(String[] args) {
        JFrame jFrame=new JFrame("yang");
        JPanel panel=new JPanel();
        JLabel background = new JLabel(new ImageIcon("/images/背景.jpg"));
        background.setSize(480, 800);
        background.setLocation(0, 0);
        panel.setLayout(null);
        panel.add(background);



        int x1 = 89;
        int y1 =166;
        JButton card = new JButton(new ImageIcon("src/images/干草.png"));
        card.setDisabledIcon(new ImageIcon("src/images/干草2.png"));
        card.setSize(59, 66);
        card.setName("草");
        card.setBorderPainted(false);
        card.setEnabled(false);


        card.setLocation(x1, y1);
        card.setEnabled(false);
        panel.add(card, 0);


        jFrame.add(panel);
        jFrame.setSize(480,800);
        jFrame.setLocationRelativeTo(null);
        jFrame.setResizable(false);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);

    }
}
