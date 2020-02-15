package com.company.List;

import java.util.Stack;


//从后往前输出链表
public class PrintList_Fan {

    //递归完成
    public static void PrintList1(ListNode n2) {
        if (n2==null)
            return;
        PrintList_Fan.PrintList1(n2.next);
        System.out.println(n2.value);

    }
    //定义链表节点
    public static class ListNode{
        public ListNode next;
        public int value;
    }
//用栈来放每个节点，达到先进后出的效果，即方向输出链表
    public static void PrintList(ListNode headNode){
        Stack<ListNode> stack=new Stack<ListNode>();

        //链表节点入栈
        while (headNode!=null)
        {
            stack.push(headNode);

            headNode=headNode.next;
        }
        //出栈打印
        while (!(stack.empty()))
        {
            System.out.println(stack.pop().value);
        }
    }
}
