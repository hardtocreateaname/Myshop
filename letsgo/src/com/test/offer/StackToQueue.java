package com.test.offer;

/**
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 */
import java.util.Stack;

public class StackToQueue {
	// 思路：栈是先进后出，队列是先进先出
	// 用两个栈，第一个用来存放数据
	// 第二个栈用来删除数据，当需要出队列的时候，将第一个栈倒叙放入第二个，再将第二个栈顶删除
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();

	// 栈的push是是在栈顶插入一个元素
	// pop是从栈顶删除第一个元素
	public void push(int node) {
		stack1.push(node);
	}

	public int pop() {
		//如果队列为空，抛出异常
		if (stack1.empty() && stack2.empty()) {
			throw new RuntimeException("Queue is empty!");
		}
		if(stack2.isEmpty()){
			while(!stack1.isEmpty()){
				stack2.push(stack1.pop());
			}
		}
		return stack2.pop();
	}

	public static void main(String[] args) {
		Stack<Integer> stack1 = new Stack<Integer>();
		stack1.add(1);
		stack1.add(2);
		stack1.add(3);
		stack1.add(4);
		System.out.println(stack1.elementAt(3));
	}
}
