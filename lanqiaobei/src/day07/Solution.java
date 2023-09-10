package day07;

class Solution {
    public int[] printNumbers(int n) {
        int a= (int) Math.pow(10,n)-1;
        int[] arr=new int[a];
        for (int i = 0; i <a; i++) {
            arr[i]=i+1;
        }
        return arr;
    }
}