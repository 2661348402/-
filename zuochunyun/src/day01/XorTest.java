package day01;
//练习一：一个数出现了奇数次，其余出现了偶数次
//练习二；两个数出现了偶数次，其余出现了奇数次
public class XorTest {
    public static void main(String[]args){
        int[] arr={1,1,1,1,2,2,3,3,3,3,3,5,5,5};
        //System.out.println(xorOne(arr));
        xorTwo(arr);
    }
    public static int xorOne(int[] arr){
        int result=0;
        for (int i = 0; i <arr.length; i++) {
            result^=arr[i];
        }
        return result;
    }
    public static void xorTwo(int[] arr){
        int temp=0;
        for (int i = 0; i <arr.length; i++) {
            temp^=arr[i];
        }
        //提取最右侧的一个1
       int rightOne=temp&(~temp+1);
        int temp3=0;
        for (int i = 0; i <arr.length; i++) {
            if((arr[i]&rightOne)!=0){
                temp3^=arr[i];
            }
        }
        System.out.println("a="+temp3);
        System.out.println("b="+(temp3^temp));
    }
}
