package com.company.BinaryTree;

public class BuildTree {
    public static TreeNode buildTree(int[] first,int[] mid){
        if (first==null)return null;
        TreeNode root=buildTreecore(first,0,first.length-1,
                mid,0,mid.length-1);
        return root;
    }
    public static TreeNode buildTreecore(int[] first,int startf,int endf,
                                         int[] mid,int startm,int endm){
        if (startf>=endf||startm>=endm)return null;
        TreeNode root=new TreeNode(first[startf]);
        for (int i = startm; i <endm-1 ; i++) {
            if (mid[i]==first[startf])
            {
               root.setLeft(buildTreecore(first,startf+1,startf+(i-startm),mid,startm,i-1));
               root.setRight(buildTreecore(first,startf+(i-startm)+1,endf,mid,i+1,endm));
            }

        }
        return  root;
    }

}
