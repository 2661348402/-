import java.awt.*;

/*
棋子类，定义了棋子的一些属性
 */
public class ChessPiece {

    private int x;
    private int y;
    private int r = 20;
    private int type =0;
//指示器
    public Pointer pointer;


    public ChessPiece(Pointer pointer) {
        this.pointer = pointer;
        this.x = pointer.getX();
        this.y = pointer.getY();
    }


    public void setType(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public void draw(Graphics2D g2,Color color) {
        g2.setColor(color);
        g2.fillOval(x - r, y - r, 2 * r, 2 * r);
    }
}
