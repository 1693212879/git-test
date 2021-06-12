package com.atguigu.git;

public class ForTest9 {
    public static void main(String[] args) {
        int count=0;
        label:for (int i=2;i<=100;i++){

            for (int j=2;j<Math.sqrt(i);j++){
                if (i%j==0){
                    continue label;
                }
            }
            System.out.println(i);
            count++;
        }
        System.out.println("质数个数："+count);
    }
}
