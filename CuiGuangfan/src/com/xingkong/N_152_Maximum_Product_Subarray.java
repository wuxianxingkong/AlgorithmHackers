package com.xingkong;
/** 
* @author cuiguangfan 736068048@qq.com: 
* @version create time：2016年3月23日 上午9:19:37 
* class description
*/
public class N_152_Maximum_Product_Subarray {
	public static int maxProduct(int[] nums) {
		if(nums==null||nums.length==0) return 0;
		int max=nums[0];
		int maxTemp=nums[0];
		int minTemp=nums[0];
		for(int i=1;i<nums.length;i++){
			int t1=maxTemp*nums[i];
			int t2=minTemp*nums[i];
			maxTemp=Math.max(Math.max(t1, t2), nums[i]);
			minTemp=Math.min(Math.min(t1, t2), nums[i]);
			max=Math.max(maxTemp, max);
		}
		return max;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(N_152_Maximum_Product_Subarray.maxProduct(new int[]{-4,-3,-2}));
	}

}
