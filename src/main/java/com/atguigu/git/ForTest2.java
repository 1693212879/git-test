package com.atguigu.git;

public class ForTest2 {
    public static void main(String[] args) {
        int sum=0;
        int count=0;
        for(int i=1;i<=5;i++){
            if (i%2==1){
                sum+=i;
                count++;
            }
        }
        System.out.println(sum);
        System.out.println(count);
    }
}
