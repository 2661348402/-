package javatest;

import java.util.Scanner;

public class Machine {
    public static void main(String[] args) {
        System.out.println("请输入你要购买的饮品：1.咖啡 2.可乐 3.奶茶");
        Scanner sc=new Scanner(System.in);
        //购买种类
        int a=sc.nextInt();
        Drink drink=DrinkFactory.drinkMake(a);
        while(drink==null){
            System.out.println("输入信息有误，请重新输入");
            int b=sc.nextInt();
            drink=DrinkFactory.drinkMake(b);
        }
        //备注
        drink.showInfo1();
        String temp=sc.nextLine();
        String s=sc.nextLine();
        drink.setNote(s);
        //大小
        System.out.println("请选择：1.中杯 2.大杯 3.超大杯");
        int c=sc.nextInt();
        drink.setSize(c);
        drink.howMoney(c);

        //购买数量
        System.out.println("购买数量：");
        int d=sc.nextInt();
        drink.setNum(d);

        //打印订单信息
        drink.showInfo2();

    }

}
