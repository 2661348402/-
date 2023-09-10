import javax.swing.*;
import java.util.ArrayList;

public class tt {
    public static void main(String[] args) {
        ArrayList<JButton> sort=new ArrayList<>();
        JButton jb=new JButton();
        jb.setName("牛奶");
        sort.add(jb);
        System.out.println(sort);
        sort.add(jb);
        System.out.println(sort);
        ArrayList nums=new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(0,4);
        System.out.println(nums);

    }
}
