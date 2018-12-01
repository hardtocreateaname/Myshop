package com.test.offer;
/**
 *斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
 *n<=39
 */
public class FibonacciTest {
	//思路：用递归会出现很多重复部分，并且有栈溢出的风险
	//此处采用迭代
	public int Fibonacci(int n) {
		int preNum=1;
		int prePreNum=0;
		int result=0;
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		for(int i = 2;i<=n;i++){
			result = preNum+prePreNum;
			prePreNum = preNum;
			preNum = result;
		}
		return result;
    }
	
}
