package com.company;

import com.company.singlton.singlton01;

public class Main {


    public static void main(String[] args) {
        int[] a={3,5,9,4,6,7,1,0,5};
        int[] a1={3,5,9,4,6,7,1,0,5};
        int[] a2={3,5,9,4,6,7,1,0,5};
        int[] a3={3,5,9,4,6,7,1,0,5};
        int[] a4={3,5,9,4,6,7,1,0,5};
        int[] a5={3,5,9,4,6,7,1,0,5};
        int[] a6={3,5,9,4,6,7,1,0,5};

        Sort.laobiao1pop(a);
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]);
        }
        System.out.println();
        Sort.quickSort(a1,0,a1.length-1);
        for (int i = 0; i <a1.length ; i++) {
            System.out.print(a1[i]);
        }
        System.out.println();
        Sort.InsertSort(a2);
        for (int i = 0; i <a2.length ; i++) {
            System.out.print(a2[i]);
        }

        System.out.println();
        Sort.shellSort(a3);
        for (int i = 0; i <a3.length ; i++) {
            System.out.print(a3[i]);
        }
        System.out.println();
        Sort.shellSort(a4);
        for (int i = 0; i <a4.length ; i++) {
            System.out.print(a4[i]);
        }

        System.out.println();
        Sort.heapSort(a5,a5.length);
        for (int i = 0; i <a5.length ; i++) {
            System.out.print(a5[i]);
        }


        Sort.sort(a6,0,a.length-1);

        for (int i = 0; i <a6.length ; i++) {
            System.out.print(a6[i]);
        }
        singlton01 s=singlton01.getSinglton();
        singlton01 s1=singlton01.getSinglton();
        System.out.println(s);
        System.out.println(s1);
    }





}

