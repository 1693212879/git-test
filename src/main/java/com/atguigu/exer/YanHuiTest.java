package com.atguigu.exer;

/**
 * yanHui[i][j] = yanHui[i-1][j]+yanHui[i-1][j-1]
 */
public class YanHuiTest {
    public static void main(String[] args) {
        //1.初始化一个二维数组
        int[][] yanHui = new int[10][];

        //2.给数组的元素赋值
        for (int i = 0; i < yanHui.length; i++) {
            //定义二维数组的每一个元素的长度
            yanHui[i] = new int[i + 1];
            yanHui[i][0] = 1;
            yanHui[i][i] = 1;
            if (i > 1) {
                for (int j = 1; j < yanHui[i].length - 1; j++) {
                    yanHui[i][j] = yanHui[i - 1][j] + yanHui[i - 1][j - 1];
                }
            }

        }
        //3.遍历二维数组
        for (int i=0;i<yanHui.length;i++){
            for (int j=0;j<yanHui[i].length;j++){
                System.out.print(yanHui[i][j]+" ");
            }
            System.out.println();
        }
    }

}