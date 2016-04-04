package com.xingkong;

import java.util.ArrayList;
import java.util.List;

/** 
* @author cuiguangfan 736068048@qq.com: 
* @version create time：2016年4月1日 下午5:03:39 
* class description
*/
public class N_22_Generate_Parentheses {
	List<String> result=new ArrayList<String>();
	//left和right表示左右括号各剩下几个
	private void recursive(int left,int right,String s){
		if(left==0&&right==0){
			result.add(s);
		}
		if(left>0){
			recursive(left-1,right,s+"(");
		}
		//只要保证剩下的左括号的数目小于剩下的右括号的数据，就能在右边加")"
		if(right>0&&left<right){
			recursive(left,right-1,s+")");
		}
	}
	public List<String> generateParenthesis(int n) {
		recursive(n,n,"");
		return this.result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		N_22_Generate_Parentheses n=new N_22_Generate_Parentheses();
		System.out.println(n.generateParenthesis(3));
	}

}
