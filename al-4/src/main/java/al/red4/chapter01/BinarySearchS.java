/**   
 * Copyright © 2023 eSunny Info. Tech Ltd. All rights reserved.

 * 
 * @Package: al.red4.chapter01 
 * @author: Administrator   
 * @date: 2023年4月9日 下午10:14:39
 * @desc: 二分查找
 */
package al.red4.chapter01;

import java.util.Arrays;

import edu.princeton.cs.algs4.RandomSeq;
import edu.princeton.cs.algs4.StdOut;


public class BinarySearchS {
	
	
	
	public static int rankAndSearch(int key, int[] arr) {
		//arr需要保持有序
		Arrays.sort(arr);
		int low  = 0;
		int high = arr.length - 1;
		
		while(low < high) {
			int mid = low +  (high - low)/2;
			if (key < arr[mid]) high = mid - 1;
			else if (key > arr[mid]) low = mid + 1;
			else return mid;				
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		
	}

}
