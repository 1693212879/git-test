package com.atguigu.git;

import java.util.Scanner;

public class GitTest {
    public static void main(String[] args){
        Scanner scan  = new Scanner(System.in);

        System.out.println("请输入你的姓名:");
        String name = scan.next();
        System.out.println(name);

        System.out.println("请输入你的年龄:");
        int age = scan.nextInt();
        System.out.println(age);

        System.out.println("请输入你的体重：");
        double weight = scan.nextDouble();
        System.out.println(weight);

        System.out.println("你是否相中了我了呢（true/false）");
        boolean islove = scan.nextBoolean();
        System.out.println(islove);

        System.out.println("请输入你的性别：（男/女）");
        String gender =scan.next();
        char genderChar = gender.charAt(0);
        System.out.println(genderChar);


    }
}
