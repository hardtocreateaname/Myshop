package com.test.offer;
/**
 * 
 * 在一个二维数组中（每个一维数组的长度相同）
 * 每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 *
 */
public class array1 {
	//思路：左下角开始，目标比该值大，则右移。比该值小，则上移
	 public static boolean Find(int target, int [][] array) {
		    int row = array.length-1;    //最后一行
		    int col = 0;                   //第一列
		    //array.length和array[0].length最好都算出来然后保存在变量里面，这样可以节省时间，不用每次比对的时候都算一次。
		    int count = array[0].length;
		      while(row>=0&&col<count){
		    	  if(target==array[row][col]){
		    		  return true;
		    	  }
		    	  else if(target>array[row][col]){
		              col++;
		          }else if(target<array[row][col]){
		              row--;
		          }
		      }
		        return false;
		 	
		    }
	 public static void main(String[] args) {
		 int[][] array = {
				 {1,2,8,9},
				 {2,4,9,12},
				 {4,7,10,13},
				 {6,8,11,15}
		 };
		 System.out.println(Find(15, array));
		 System.out.println(array[3][3]);

	}
}
