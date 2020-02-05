package com.company;

class Sort {
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


    public static void shellSort(int[] a) {
        int length = a.length;
        int h = 1;
        while (h < length / 3) h = 3 * h + 1;
        for (; h >= 1; h /= 3) {
            for (int i = 0; i < a.length - h; i += h) {
                for (int j = i + h; j > 0; j -= h) {
                    if (a[j] < a[j - h]) {
                        int temp = a[j];
                        a[j] = a[j - h];
                        a[j - h] = temp;
                    }
                }
            }
        }
    }

   //简单选择排序
   public static void  xuanzheSort(int [] a){

           for (int i = 0; i < a.length; i++) {
               int min = i;
               //选出之后待排序中值最小的位置
               for (int j = i + 1; j < a.length; j++) {
                   if (a[j] < a[min]) {
                       min = j;
                   }
               }
               //最小值不等于当前值时进行交换
               if (min != i) {
                   int temp = a[i];
                   a[i] = a[min];
                   a[min] = temp;
               }
           }

   }

   //堆排序
    public static  void heapSort(int [] a,int n){
        build_heap(a,n);

        for (int i = n-1; i >0 ; i--) {
            int temp=a[i];
            a[i]=a[0];
            a[0]=temp;
            heapify(a,i,0);
        }

    }
    //创建堆
    public  static void build_heap(int [] a,int n){
       int last=n-1;
       int parent=(last-1)/2;

        for (int i = parent; i >=0; i--) {
            heapify(a,n,i);
        }
    }
    //调整堆
    public static  void heapify(int [] a,int n,int i){
       //递归出口
        if (i>n)
            return;
       int max=i;
       //右子节点
        int c1=i*2+1;
        //左子节点
        int c2=i*2+2;
    //找一个树的最大节点
        if (c1<n&&a[c1]>a[max])
        {
            max=c1;
        }
        if (c2<n&&a[c2]>a[max])
        {
            max=c2;
        }
        //交换
        if (max!=i)
        {
            int temp=a[max];
            a[max]=a[i];
            a[i]=temp;
            heapify(a,n,max);
        }
    }

    public static void sort(int[] a,int left,int right){
        if (left==right)
            return;
        int mid=left+(right-left)/2;
        sort(a,left,mid);
        sort(a,mid+1,right);
        marge(a,left,mid+1,right);
    }
    public static void marge(int [] a, int leftpart, int rightpart, int rightBound) {
        int mid = rightpart - 1;
        int left = leftpart;
        int right = rightpart;
        int[] temp = new int[rightBound - leftpart + 1];
        int c = 0;

        while (left <= mid && right <= rightBound) {
            temp[c++] = a[left] <= a[right] ? a[left++] : a[right++];
        }
        while (left <= mid) temp[c++] = a[left++];
        while (right <= rightBound) temp[c++] = a[right++];
        for (int i = 0; i < temp.length; i++) {
            a[leftpart+i] = temp[i];
        }
    }
}
