import javax.swing.*;
import java.awt.*;

public class WinnerDialog extends JDialog {
    private String name;
    WinnerDialog(String name){
        this.name=name;
        setSize(new Dimension(300,200));
        setLocationRelativeTo(null);
       // setLocation(200,400);

        JLabel jLabel=new JLabel();
        jLabel.setLayout(new BorderLayout());
        jLabel.setFont(new Font("华文宋体",Font.BOLD,20));
        jLabel.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel.setText(name+"获胜");
        add(jLabel);

        setVisible(true);
    }

}
