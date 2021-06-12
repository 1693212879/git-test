package com.atguigu.exer;

public class ForTest2 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        for (int i=0;i<arr.length;i++){
            arr[i]= (int) (Math.random()*(99-10+1)+10);
            //Math.random() 区间是在,[0.0,1)
        }
        int maxValue=arr[0];
        for (int i=0;i<arr.length;i++){
            if (maxValue<arr[i]){
                maxValue=arr[i];
            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println(maxValue);
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("总和为"+sum);
        int avgValue=0;
        avgValue=sum/arr.length;
        System.out.println(avgValue);
    }
}
