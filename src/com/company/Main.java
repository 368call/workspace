package com.company;

public class Main {


    public static void main(String[] args) {
        int[] a={3,5,9,4,6,7,1,0,5};
        int[] a1={3,5,9,4,6,7,1,0,5};
        int[] a2={3,5,9,4,6,7,1,0,5};
        int[] a3={3,5,9,4,6,7,1,0,5};
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
    }
}

