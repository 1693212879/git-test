package com.atguigu.git;

public class ForTest7 {
    public static void main(String[] args) {
        boolean isflag = true;
        double start = System.currentTimeMillis();
        for (int i=2;i<=100;i++){
            for (int j=2;j<=Math.sqrt(i);j++){
             if (i%j ==0){
                 isflag=false; //不是质数
                 break;
             }
            }
            if (isflag==true){
                System.out.println(i); //输出质数
            }
            isflag=true;
        }
        double end = System.currentTimeMillis();
        System.out.println("花费时间:"+(end-start));
    }
}
