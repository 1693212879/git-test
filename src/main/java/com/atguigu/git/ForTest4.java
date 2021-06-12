package com.atguigu.git;

import java.util.Scanner;

public class ForTest4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int postiveNumber =0;
        int nagativeNumber = 0;
        while (true) {
            System.out.println("请输入数字");
            int num = scan.nextInt();

            if (num==0){
                break;
            }
            if(num>0){
                postiveNumber++;
            }
            else if (num<0){
                nagativeNumber++;
            }
        }
        System.out.println("正数个数："+postiveNumber);
        System.out.println("负数个数："+nagativeNumber);
    }
}
