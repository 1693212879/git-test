package com.atguigu.git;

public class ForTest6 {
    public static void main(String[] args) {
        for (int i=1;i<=9;i++){
            for (int j=1;j<=i;j++){
                System.out.print(i+"*"+j + "=" + i*j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}