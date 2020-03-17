package com.company;

import com.company.check2.Fine;

import java.util.List;

public class Main {


    public static void main(String[] args) {
        int[] a={3,5,9,4,6,7,1,0,5};
        int[] a1={3,5,9,4,6,7,1,0,5};
        int[] a2={3,5,9,4,6,7,1,0,5};
        int[] a3={3,5,9,4,6,7,1,0,5};
        int[] a4={3,5,9,4,6,7,1,0,5};
        int[] a5={3,5,9,4,6,7,1,0,5};
        int[] a6={3,5,9,4,6,7,1,0,5};
        int [][] s7={{1,2,8,9},
                    {2,4,9,12},
                    {4,7,10,13},
                    {6,8,11,15}};
        int[] a7={3,5,9,4,6,7,1,0,5};
        String x="0A";
        String y=new String("0A");
       System.out.println( x.hashCode());
       System.out.println(x.equals(y)+" "+x==y);
        pop.laobiao1pop(a);
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]);
        }
        System.out.println();
        pop.quickSort(a1,0,a1.length-1);
        for (int i = 0; i <a1.length ; i++) {
            System.out.print(a1[i]);
        }
        System.out.println();
        pop.InsertSort(a2);
        for (int i = 0; i <a2.length ; i++) {
            System.out.print(a2[i]);
        }

        System.out.println();
        pop.shellSort(a3);
        for (int i = 0; i <a3.length ; i++) {
            System.out.print(a3[i]);
        }
        System.out.println();
        pop.shellSort(a4);
        for (int i = 0; i <a4.length ; i++) {
            System.out.print(a4[i]);
        }

        System.out.println();
        pop.heapSort(a5,a5.length);
        for (int i = 0; i <a5.length ; i++) {
            System.out.print(a5[i]);
        }


        pop.sort(a6,0,a.length-1);

        for (int i = 0; i <a6.length ; i++) {
            System.out.print(a6[i]);
        }
System.out.println( Fine.fine(s7,9,4,4));
        pop.CountSocrt(a7);

    }


}

