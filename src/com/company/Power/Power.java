package com.company.Power;

public class Power {
    //计算base的x次方
    public double power(double base, int x) throws Exception {
        double reslut=0.0;
        //底数为0时，负指数幂没有意义
        if (equals(base,0)&&x<0)
        {
            throw new Exception("0的负指数幂没有意义");
        }
        if (x==0) return 1.0;
        if (x<0)
        {
            reslut=1.0/dopower(base,-x);
        }
        if (x>0)
        {
            reslut=dopower(base,x);
        }
        return reslut;
    }

    private double dopower(double base, int x) {
        double result=1.0;
        for (int i=1;i<=x;i++)
        {
            result=result*base;
        }

        return result;
    }

    private boolean equals(double base, int i) {
        if ((base-i)>-0.00000001&&(base-i)<0.00000001)
            return true;
        return false;
    }

    public static void main(String[] args) throws Exception {
        Power p=new Power();
       System.out.println(p.power(2,0));
      // System.out.println(p.power(0,-2));
       System.out.println(p.power(1,-2));
    }

}
