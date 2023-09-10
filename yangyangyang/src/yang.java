

import javax.imageio.ImageIO;

import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import java.io.IOException;

import java.net.URL;
import java.util.*;


//jPanel的布局设置为空时，添加的组件要设置大小，否则无法显示

/**
 * author wpp
 */
public class yang {
    //构建窗口和背景
 static    Random random=new Random();
    static   JFrame jFrame=new JFrame("yang");
    static   JPanel panel=new JPanel();
    static   Image  image;
    static  ArrayList<JButton> sort=new ArrayList<>();
    static  Clip clip;
   static url url=new url();
    //难易
    static int num;
    yang(){
        try {
         //   image= ImageIO.read(new File("src/images/背景.jpg"));
          //  File file=url.getFile("images/1.jpg");

            image= ImageIO.read(url.getUrl("images/1.jpg"));
            System.out.println("加载成功");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,"图片加载失败，请检查路径","title",JOptionPane.ERROR_MESSAGE);
        }
    }
    public static void update(){
        jFrame.add(panel);
        jFrame.setBounds(200,100,480,800);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setResizable(false);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);

    }
    public static void init(){
        //播放背景音乐
     //   File musicPath=new File("src/music/back_music.wav");
        musicPlay(url.getUrl("music/back_music.wav"));
        //背景
        panel.removeAll();
        sort.clear();
        new yang();
        back_ground bk=new back_ground(image);
        panel.setLayout(null);
        panel.add(bk);
        //创建牌
        ArrayList<JButton> cards=creatCard();
        //打印牌
        print(cards);
        //洗牌
        Collections.shuffle(cards);
        print(cards);
        //摆牌
        placeCard(cards,panel);
        //判断牌的状态
        checkCard(cards);

        update();
    }

    public static void main(String[] args) {
        new MyDialog1();

        return;
    }
    //创建牌
    public static ArrayList<JButton> creatCard(){

        ArrayList<JButton> cards=new ArrayList<>();
        String[] names = {"刷子", "剪刀", "叉子", "奶瓶", "干草", "手套", "树桩", "棉花", "毛线", "水桶", "火", "玉米", "白菜", "草", "萝卜", "铃铛"};

        for (int i = 0; i <num; i++) {
            int rand=random.nextInt(names.length);
          //   String name="src/images/"+names[rand]+".png";
            //  String name1="src/images/"+names[rand]+"2.png";
            String path="images/"+(rand+2)+".png";
            String path1="images/"+(rand+2)+"2.png";
            System.out.println(path);
            System.out.println(path1);

            URL name= url.getUrl(path);
            URL name1= url.getUrl(path1);
            for (int j = 0; j <3; j++) {
                JButton card=new JButton(new ImageIcon(name));
                card.setSize(59,66);
                card.setDisabledIcon(new ImageIcon(name1));
                card.setBorderPainted(false);
                card.setEnabled(false);
                card.setName(names[rand]);
                addAction(card,cards);
                cards.add(card);

            }
        }

        return cards;
    }
    //摆牌
    public static void placeCard(ArrayList<JButton> cards,JPanel panel){
            int x,y;
        for (int i = 0; i < cards.size(); i++) {
            do {
                 x = random.nextInt(480);
                 y = random.nextInt(800);
            }
            while(x>400||y>500);
            JButton card = cards.get(i);
            card.setLocation(x, y);
            panel.add(card,0);
        }


    }
   //打印
   public  static void print(ArrayList<JButton> cards){
        StringBuffer sb=new StringBuffer("[ ");
       for (JButton card : cards) {
           sb.append(card.getName()+" ");
       }
       System.out.println(sb+"]");
   }
   //检查牌的状态
    public static void checkCard(ArrayList<JButton> cards){

        for (int i = cards.size()-1;i>-1; i--) {
            boolean flag=true;
            JButton card=cards.get(i);
            int x=card.getX();
            int y=card.getY();
            for (int j =i+1; j <cards.size(); j++) {
               int x1=cards.get(j).getX();
               int y1=cards.get(j).getY();
               if(!(Math.abs(x-x1)>=55||Math.abs(y-y1)>=66)){
                   flag=false;
               }
            }
            cards.get(i).setEnabled(flag);
        }
    }
    //动作
    public static void addAction(JButton card,ArrayList<JButton> cards){
        card.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               JButton button=(JButton) e.getSource();
               if(sort.contains(button))
                   return;
                Elimination(button, cards);
                checkCard(cards);

            }

        });
    }
    //消除判断
    public static void Elimination(JButton jb,ArrayList<JButton> cards){
        Map<String,Integer> map=new HashMap();
        int index=-1;
        for (int i = 0; i <sort.size(); i++) {
            if (jb.getName() == sort.get(i).getName()) {
                sort.add(i, jb);
               cards.remove(jb);
                index = i;
                break;
            }
        }
            if(index==-1){
                sort.add(jb);
                cards.remove(jb);
            }

           if(index+2<sort.size()&&index!=-1) {
               if(jb.getName()==sort.get(index+2).getName()){
                 //  File file=new File("src/music/em.wav");
                 //  File file= url.getFile("music/em.wav");
                 //  musicPlay(file);
                   musicPlay(url.getUrl("music/em.wav"));
                   panel.remove(sort.remove(index));
                   panel.remove(sort.remove(index));
                   panel.remove(sort.remove(index));
                   panel.repaint();
               }
           }
        for (int i = 0; i <sort.size(); i++) {
            sort.get(i).setLocation(20 + i*59, 642);
        }
       panel.repaint();
        if(sort.size()>=7){
            JOptionPane.showMessageDialog(null,"卡槽已满，游戏结束"," ",JOptionPane.INFORMATION_MESSAGE);
            clip.close();
          //  File file=new File("src/music/hihihi.wav");
           // File file=url.getFile("music/hihihi.wav");
           // musicPlay(file);
            musicPlay(url.getUrl("music/hihihi.wav"));

            new MyDialog();
        }
        if(cards.size()==0){
            clip.close();
          //  File file=new File("src/music/5785.wav");
            //File file= url.getFile("music/5785.wav");
          //  musicPlay(file);
            musicPlay(url.getUrl("music/5785.wav"));
            JOptionPane.showMessageDialog(null,"恭喜通关"," ",JOptionPane.INFORMATION_MESSAGE);
            new MyDialog();
        }
    }
    //播放音乐
    public static void musicPlay(URL musicPath){
        try {
          clip = AudioSystem.getClip();
           // AudioInputStream music=AudioSystem.getAudioInputStream(musicPath);
            AudioInputStream music=AudioSystem.getAudioInputStream(musicPath);
            clip.open(music);
            clip.loop(0);

        } catch (LineUnavailableException e) {
            e.printStackTrace();
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    //结束对话框
   static class MyDialog extends JDialog{
        MyDialog(){
            this.setVisible(true);
            this.setSize(700,500);
            this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
            this.setLocationRelativeTo(null);

            Container container = this.getContentPane();
            //绝对布局
            container.setLayout(null);

            JButton jButton = new JButton("再来一次");
            jButton.setFont(new Font("微软雅黑", Font.PLAIN, 18));

            jButton.setBounds(250,200,200,100);
          //  jButton.setSize(200,100);
            jButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    clip.close();
                    new MyDialog1();
                   dispose();
                }
            });
            container.add(jButton);

        }
    }
    //开始对话框
    static class MyDialog1 extends JDialog{
        MyDialog1(){
            this.setVisible(true);
            this.setSize(700,500);
            this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
            this.setLocationRelativeTo(null);

            Container container = this.getContentPane();
            //绝对布局
            container.setLayout(null);
            JPanel panel=new JPanel();
            panel.setLayout(new GridLayout(3,1));
            panel.setBounds(100,25,500,400);
            JButton button1=creatButton();
            JButton button2=creatButton();
            JButton button3=creatButton();
            button1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
            button1.setText("简单");
            button1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    num=10;
                   init();
                    dispose();
                }
            });
            button2.setFont(new Font("微软雅黑", Font.PLAIN, 18));
            button2.setText("一般");
            button2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    num=20;
                   init();
                    dispose();
                }
            });
            button3.setFont(new Font("微软雅黑", Font.PLAIN, 18));
            button3.setText("困难");
            button3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    num=30;
                   yang.init();
                    dispose();
                }
            });

            container.add(panel);
            panel.add(button1);
            panel.add(button2);
            panel.add(button3);

        }
        JButton creatButton(){
            JButton jButton = new JButton();
            jButton.setSize(100,50);
            return jButton;
        }
    }

}
class back_ground extends Canvas{
    Image image;
    back_ground(Image image){
        this.image=image;
        this.setSize(480,800);
        this.setLocation(0,0);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(image,0,0,480,800,null);
    }
}
class url{

    File getFile(String name){
        URL path=this.getClass().getResource(name);
        return new File(path.getFile());
    }
    URL getUrl(String name){
        return this.getClass().getResource(name);
    }

}

