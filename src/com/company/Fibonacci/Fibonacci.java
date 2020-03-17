package com.company.Fibonacci;

public class Fibonacci {
    //递归完成
    public static int Test1(int n){
        if (n==0)return 0;
        if (n==1)return 1;
        return Test1(n-1)+Test1(n-2);
    }
    //非递归，从前往后计算，保存计算过的项，避免计算重复
    public static int Test2(int n){
        int[] a={0,1};
        if (n<2)
            return a[n];
        int one=0;
        int two=1;
        int coun=0;
        for (int i = 2; i <=n; i++) {
            coun=one+two;
            one=two;
            two=coun;
        }
        return coun;
    }
}
