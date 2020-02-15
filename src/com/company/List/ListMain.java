package com.company.List;

public class ListMain {
    public static void main(String[] args) {
        PrintList_Fan.ListNode n1=new PrintList_Fan.ListNode();
        PrintList_Fan.ListNode n2=new PrintList_Fan.ListNode();
        PrintList_Fan.ListNode n3=new PrintList_Fan.ListNode();
        n1.value=1;
        n2.value=2;
        n3.value=3;

        n1.next=n2;
        n2.next=n3;
        //用栈实现链表反向输出
        PrintList_Fan.PrintList(n1);
        //用递归模拟栈结构反向输出链表
        PrintList_Fan.PrintList1(n1);
    }
}
