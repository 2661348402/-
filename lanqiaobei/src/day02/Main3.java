package day02;

public class Main3 {
    public static void main(String[] args) {
        for (int i = 1000; i < 10000; i++) {
          char[] chars =  String.valueOf(i).toCharArray();
          int left=0;
          int right=3;
          boolean flag=true;
          while(left<right){
              if(chars[left++]!=chars[right--]){
                  flag=false;
                  break;
              }
          }
          if (flag){
              System.out.println(i);
          }
        }
    }
    }
