package com.xingkong;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author cuiguangfan 736068048@qq.com:
 * @version create time��2016��4��1�� ����8:43:48 
 * class description:�����˼����ʵ��3sum��һ���ģ�����һ���ģ�����ֻ��������������һ��forѭ�������ң�������forѭ��Ҳ���Բ���3sum���������Ż���continue��
 * �ڵڶ���forѭ�����У�����Ӧ��ע��p1��p+1��ʼ
 */
public class N_18_4Sum {
	public List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		for (int p = 0; p < nums.length - 3; p++) {
			//������Է��ս����Ż�
			//����if(p>0&&nums[p	]==nums[p-1]) continue;
			if (p> 0 && nums[p] == nums[p - 1])
				continue;// �Ż���
			for (int p1 = p+1; p1 < nums.length - 2; p1++) {
				if (p1 > p+1 && nums[p1] == nums[p1 - 1])//������p1>p+1
					continue;// �Ż���
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
						while (p2 < p3 && nums[p3] == nums[p3 - 1]) {// �Ż���
							p3--;
						}
						p3--;
						while (p2 < p3 && nums[p2] == nums[p2 + 1]) {// �Ż���
							p2++;
						}
						p2++;
					} else if (nums[p]+nums[p1] + nums[p2] + nums[p3] > target) {
						while (p2 < p3 && nums[p3] == nums[p3 - 1]) {// �Ż���
							p3--;
						}
						p3--;
					} else {
						while (p2 < p3 && nums[p2] == nums[p2 + 1]) {// �Ż���
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
