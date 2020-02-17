package com.company.singlton;
//饿汉 预先实例化浪费内存
public class singlton01 {
    private singlton01(){};

    private static singlton01 singlton=new singlton01();

    public static singlton01 getSinglton(){
        return singlton;
    }
}
