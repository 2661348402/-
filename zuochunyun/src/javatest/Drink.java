package javatest;

//定义一个饮品类；
public abstract class Drink {
    private String name;
    private int price;
    private String size;
    private String note;
    private int num;
    private String ice;

    Drink(){}
    Drink(String name,int price,String size,String note,String ice,int num){
        this.name=name;
        this.price=price;
        this.size=size;
        this.note=note;
        this.ice=ice;
        this.num=num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(int num) {
        switch (num){
            case 1:
                size="中杯";
            case 2:
                size="大杯";
            case 3:
                size="超大杯";
        }
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getIce() {
        return ice;
    }

    public void setIce(String ice) {
        this.ice = ice;
    }

    //展示饮品信息
    public abstract void showInfo1();
    public abstract  void showInfo2();
    //确定价格
    public abstract  void howMoney(int num);

}
//定义可乐类
class Coke extends Drink{
    public static final String NAME ="可乐" ;
    public static final int MID_PRICE =2;
    public static final int BIG_PRICE =5;
    public static final int SUPERBIG_PRICE =8;

    @Override
    public void showInfo1() {
        System.out.println("请输入你需要的可乐的信息：");
        System.out.println("备注要可口可乐还是百事可乐，是否加冰");
    }

    public void howMoney(int num) {
        switch (num){
            case 1:
                setPrice(MID_PRICE);
                break;
            case 2:
                setPrice(BIG_PRICE);
                break;
            case 3:
                setPrice(SUPERBIG_PRICE);
                break;
            default:
                System.out.println("你输入的信息有误");
        }

    }

    @Override
    public void showInfo2() {
        System.out.println("订单信息:你购买了可乐："+getNote()+",购买的"+getSize()+",购买数量"+getNum()+"杯，" +
                "价格："+getNum()+"*"+getPrice()+"="+getNum()*getPrice());
    }
}
//定义咖啡类
class Coffee extends Drink{
    public static final String NAME ="咖啡" ;
    public static final int MID_PRICE =5;
    public static final int BIG_PRICE =10;
    public static final int SUPERBIG_PRICE =15;

    @Override
    public void showInfo1() {
        System.out.println("请输入你需要的咖啡的信息：");
        System.out.println("备注加糖，加奶还是什么都不加，是否加冰");
    }

    @Override
    public void howMoney(int num) {
        switch (num){
            case 1:
                setPrice(MID_PRICE);
                break;
            case 2:
                setPrice(BIG_PRICE);
                break;
            case 3:
                setPrice(SUPERBIG_PRICE);
                break;
            default:
                System.out.println("你输入的信息有误");
        }
    }

    @Override
    public void showInfo2() {
        System.out.println("订单信息:你购买了咖啡："+getNote()+",购买的"+getSize()+",购买数量"+getNum()+"杯，" +
                "价格："+getNum()+"*"+getPrice()+"="+getNum()*getPrice());
    }
}
//定义奶茶类
class MilkTea extends  Drink{
    public static final String NAME ="奶茶" ;
    public static final int MID_PRICE =6;
    public static final int BIG_PRICE =12;
    public static final int SUPERBIG_PRICE =27;

    @Override
    public void showInfo1() {
        System.out.println("请输入你需要的奶茶的信息：");
        System.out.println("备注加椰奶，珍珠，果肉，是否加冰");
    }

    @Override
    public void howMoney(int num) {
        switch (num){
            case 1:
                setPrice(MID_PRICE);
                break;
            case 2:
                setPrice(BIG_PRICE);
                break;
            case 3:
                setPrice(SUPERBIG_PRICE);
                break;
            default:
                System.out.println("你输入的信息有误");
        }
    }

    @Override
    public void showInfo2() {
        System.out.println("订单信息:你购买了奶茶："+getNote()+",购买的"+getSize()+",购买数量"+getNum()+"杯，" +
                "价格："+getNum()+"*"+getPrice()+"="+getNum()*getPrice());
    }
}
//定义工厂类
class DrinkFactory{
    public static Drink drinkMake(int num){
        switch (num){
            case 1:
                return new Coffee();
            case 2:
                return new Coke();
            case 3:
                return new MilkTea();
            default:
        }
        return null;
    }
}