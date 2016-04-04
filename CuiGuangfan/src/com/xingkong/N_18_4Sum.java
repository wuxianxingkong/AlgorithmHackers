package com.xingkong;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author cuiguangfan 736068048@qq.com:
 * @version create time：2016年4月1日 上午8:43:48 
 * class description:这个题思想其实和3sum是一样的（就是一样的！），只不过就是又套了一层for循环，而且，最外层的for循环也可以参照3sum那样进行优化（continue）
 * 在第二层for循环当中，我们应当注意p1从p+1开始
 */
public class N_18_4Sum {
	public List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		for (int p = 0; p < nums.length - 3; p++) {
			//这里可以仿照进行优化
			//比如if(p>0&&nums[p	]==nums[p-1]) continue;
			if (p> 0 && nums[p] == nums[p - 1])
				continue;// 优化点
			for (int p1 = p+1; p1 < nums.length - 2; p1++) {
				if (p1 > p+1 && nums[p1] == nums[p1 - 1])//这里是p1>p+1
					continue;// 优化点
				int p2 = p1 + 1;
				int p3 = nums.length - 1;
				while (p2 < p3) {
					if (nums[p]+nums[p1] + nums[p2] + nums[p3] == target) {
						ArrayList<Integer> list = new ArrayList<Integer>();
						list.add(nums[p]);
						list.add(nums[p1]);
						list.add(nums[p2]);
						list.add(nums[p3]);
						result.add(list);
						while (p2 < p3 && nums[p3] == nums[p3 - 1]) {// 优化点
							p3--;
						}
						p3--;
						while (p2 < p3 && nums[p2] == nums[p2 + 1]) {// 优化点
							p2++;
						}
						p2++;
					} else if (nums[p]+nums[p1] + nums[p2] + nums[p3] > target) {
						while (p2 < p3 && nums[p3] == nums[p3 - 1]) {// 优化点
							p3--;
						}
						p3--;
					} else {
						while (p2 < p3 && nums[p2] == nums[p2 + 1]) {// 优化点
							p2++;
						}
						p2++;
					}
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		N_18_4Sum n=new N_18_4Sum();
		System.out.println(n.fourSum(new int[]{-1,0,1,2,-1,-4}, -1));
	}

}
