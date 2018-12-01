package com.test.offer;
/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 *
 */
public class JumpFloorTest {
	//思路：找规律，比如找第六层台阶跳法，就是找第五层跳法加上第四层跳法，如此迭代下去即可
	public int JumpFloor(int target) {
		//0层台阶，返回0
		if(target==0)
			return 0;
		//一层台阶，只有一种方式
		if(target==1)
			return 1;
		//二层台阶，两种方式
		if(target==2)
			return 2;
		//台阶数量大于等于3时
		//三的上一个为2
		int preNum=2;
		//前一个为1
		int prePreNum=1;
		//初始化结果集
		int result=0;
		for(int i=3;i<=target;i++){
			//结果就是上一个台阶加上前一个台阶
			result=preNum+prePreNum;
			//往前走一步，前一个变成上一个
			prePreNum = preNum;
			//上一个变成原本的位置
			preNum = result;
		}
		return result;
		
    }
	
	/**
	 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
	 * 求该青蛙跳上一个n级的台阶总共有多少种跳法。
	 */
	//思路：n=1，一种，n=2，两种，n=3，四种，n=4，六种，n=5，
	public int JumpFloorII(int target) {
		//0层台阶，返回0
				if(target==0)
					return 0;
				//一层台阶，只有一种方式
				if(target==1)
					return 1;
				//二层台阶，两种方式
				if(target==2)
					return 2;
				//台阶数量大于等于3时
				//三的上一个为2
				int preNum=2;
				//前一个为1
				int prePreNum=1;
				//初始化结果集
				int result=0;
				int count = 1;
				for(int i=3;i<=target;i++){
					//结果就是上一个台阶加上前一个台阶
					result=preNum+prePreNum+count;
					//往前走一步，前一个变成上一个
					prePreNum = preNum;
					//上一个变成原本的位置
					preNum = result;
					count++;
				}
				return result;
    }
}
