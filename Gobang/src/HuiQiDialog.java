import javax.swing.*;
import java.awt.*;

public class HuiQiDialog extends JDialog {
    HuiQiDialog(){
        setSize(new Dimension(400,200));

        JLabel jLabel=new JLabel();
        jLabel.setFont(new Font("华文宋体",Font.BOLD,40));
        jLabel.setText("落棋无悔大丈夫");
        jLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(jLabel);

        //setUndecorated(true);//去掉装饰
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
