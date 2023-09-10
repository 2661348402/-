package LeetCode;


public class test  {
    public static void main(String[] args) {
        String s="abb";
        String ss="aab";
        System.out.println(merge(s,ss));
    }
    public static String  merge(String s,String s2){
        return (s+s2).compareTo(s2+s)<0?s+s2:s2+s;
    }
}
class student extends  person{

}
 abstract class  person{}



interface test2{
    int a=45;
    void print();

}


