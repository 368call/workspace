package com.company.BinaryNumberOf;

public class NumberOf1 {
    //右移一位和整数除以二的数学结果是一样的但是位运算的效率要高，
    // 这种通过右移整数的方法可能会造成死循环，如一个负数通过右移将会造成0xFFFFFFFF
    public static  int Test1(int n){
        int cont=0;
        if (n==0) return cont;

      while (n!=0)
      {
          //判断整数的右边第一位是否为1
          if ((n&1)!=0)
          {
             //二进制数1的个数加1
             cont++;
          }
          //二进制数右移一位
          n=n>>1;
      }
      return cont;
    }

    //第二种方法通过左移检测数来避免了方法陷入死循环的情况，
    // 但是方法的效率比较低，循环的次数是计算机的位数32次或64次
    public static int Test2(int n ){
        int cont=0;
        int flat=1;
        while (flat!=0)
        {
            if ((n&flat)!=0)
            {
                cont++;
            }
            flat=flat<<1;
        }
        return cont;
    }

    //为了提高效率使用另外一种方法，整数中有多少个一就循环多少次；
    //先把整数减一再用结果和原数进行按位与运算
    public static int Test3(int n ){
        int cont=0;
        while (n!=0)
        {
            cont++;
            n=n&(n-1);
        }
        return cont;
    }
}
