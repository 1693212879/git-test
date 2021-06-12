package com.atguigu.exer;

public class ArrayTest1 {
    public static void main(String[] args) {
        String [] arr =new String[]{"AA","FF","GG","EE","PP","MM"};
       /* for (int i=0;i<arr.length/2;i++){
         String temp = arr[i];
         arr[i]=arr[arr.length-i-1];
         arr[arr.length-i-1]=temp;
        }
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }*/
       String dest="zz";
       boolean isflag=true;
       for (int i=0;i<arr.length;i++){
           if (dest.equals(arr[i])){
               System.out.println("找到了指定的元素，位置为："+i);
               isflag=false;
               break;
           }
       }
       if(isflag){
           System.out.println("没有找到指定的元素");
       }
    }
}







