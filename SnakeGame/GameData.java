package GUI.SnakeGame;

import javax.swing.*;
import java.net.URL;

public class GameData {
  //  public static URL headerUrl= GameData.class.getResource("GUI/SnakeGame/Static/header.png");
    public static URL headerUrl= GameData.class.getResource("Static/header.png");
    public static URL bodyUrl= GameData.class.getResource("Static/body.png");
    public static URL downUrl= GameData.class.getResource("Static/down.png");
    public static URL foodUrl= GameData.class.getResource("Static/food.png");
    public static URL leftUrl= GameData.class.getResource("Static/left.png");
    public static URL rightUrl= GameData.class.getResource("Static/right.png");
    public static URL upUrl= GameData.class.getResource("Static/up.png");

    public static ImageIcon header=new ImageIcon(headerUrl);
    public static ImageIcon body=new ImageIcon(bodyUrl);
    public static ImageIcon down=new ImageIcon(downUrl);
    public static ImageIcon food=new ImageIcon(foodUrl);
    public static ImageIcon left=new ImageIcon(leftUrl);
    public static ImageIcon right=new ImageIcon(rightUrl);
    public static ImageIcon up=new ImageIcon(upUrl);
}
