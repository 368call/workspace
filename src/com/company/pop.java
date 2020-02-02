package com.company;

class pop{
    //冒泡排序
    public static void laobiao1pop(int[] a){

        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j <a.length-i-1 ; j++) {
                if (a[j]>a[j+1])
                {
                    int temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
        }
    }

    public static void quickSort(int[] a,int left,int right)
    {
        if (right<left)
            return;

        int base=a[left];
        int i=left;
        int j=right;


        while (i!=j)
        {
            while (a[j]>=base&& i<j)
            {j--;}
            while (a[i]<= base && i<j)
            {i++;}

            //i和j停下交换
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;

        }
        //交换基标和检索到最后的数
        a[left]=a[i];
        a[i]=base;
        //递归解决两边数组的排序
        //左边
        quickSort(a,left,i-1);
        //右边
        quickSort(a,j+1,right);
    }

    public static  void  InsertSort(int [] a){
        int temp;
        for (int i = 1; i < a.length-1; i++) {
            for (int j = i+1; j >0; j--) {
                if (a[j]<a[j-1])
                {
                    temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }
            }
        }
    }

   /* public static void SheelSort(int []a){
        for (int h = a.length/2; h >0 ; h/=2) {
            for (int i = h; i < h; i++) {
                for (int j = i; j <a.length ; j-=h) {
                    if (a[j]<a[j-h])
                    {
                        int temp=a[j];
                        a[j]=a[j-h];
                        a[j-h]=temp;
                    }
                }
            }
        }


    }*/


   public static void shellSort(int[] data)
   {
       int j = 0;
       int temp = 0;
       //每次将步长缩短为原来的一半
       for (int increment = data.length / 2; increment > 0; increment /= 2)
       {
           for (int i = increment; i < data.length; i++)
           {
               temp = data[i];
               for (j = i; j >= increment; j -= increment)
               {
                   if(temp < data[j - increment])//如想从小到大排只需修改这里
                   {
                       data[j] = data[j - increment];
                   }
                   else
                   {
                       break;
                   }

               }
               data[j] = temp;
           }

       }
   }
}
