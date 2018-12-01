package com.test.offer;

/**
 * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 */
import java.util.ArrayList;
import java.util.LinkedList;

import com.test.utils.ListNode;

//思路是递归调用自身方法
public class LinkedlistToArray {
	//**成员变量和局部变量引起不同，涉及到JAVA堆和栈的关系**
	ArrayList<Integer> arrayList = new ArrayList<Integer>();
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		//只有listnode为null时，方法返回数组
		if (listNode != null) {
			//递归会用到栈，当递归结束后是栈顶，取数据是后进先出，所以逆序
			//如果递归数据过多，可能出现栈溢出的异常
			this.printListFromTailToHead(listNode.next);
			//add方法执行时是所有节点遍历完毕了才开始
			arrayList.add(listNode.val);
		}
		return arrayList;
	}

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(12);
		list.add(13);
		list.add(14);
		System.out.println(list.getLast());

	}

}
