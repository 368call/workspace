package com.company.BinaryTree;

public class Main {
public static void printtree(TreeNode root){
    if (root==null)
        return;
    System.out.print(root.getValue());
    printtree(root.getLeft());
    printtree(root.getRight());
}
   public static void main(String[] args) {
        int[] first={1, 2, 4, 7, 3, 5, 6, 8};
        int[] mid={4, 7, 2, 1, 5, 3, 8, 6};

        TreeNode root=BuildTree.buildTree(first,mid);
       printtree(root);
    }
}
