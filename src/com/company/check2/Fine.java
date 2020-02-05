package com.company.check2;

public class Fine {
    public static boolean fine(int [][] a,int key,int rows,int cols){
        boolean found=false;
        if (a!=null&&cols>0&&rows>0)
        {
            int row=0;
            int col=cols-1;//r0 c3
            while (row<rows&&col>=0)
            {

                if (a[row][col]==key)
                    return true;
                else
                {
                    if (a[row][col]>key)
                    {
                        col--;//c2
                    }
                    else
                        row++;
                }
            }
            return false;
        }
        return  false;
    }
}
