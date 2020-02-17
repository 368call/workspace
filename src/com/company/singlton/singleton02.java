package com.company.singlton;
//饿汉  调用才实例化
public class singleton02 {
    private singleton02(){}

    private static singleton02 singleton;

    public static singleton02 getSingleton(){
        return Build.singleton;
    }

    private static class Build{
        private static final singleton02 singleton=new singleton02();
    }
}
