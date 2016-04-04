package com.xingkong;

import java.util.ArrayList;
import java.util.List;

/** 
* @author cuiguangfan 736068048@qq.com: 
* @version create time��2016��4��1�� ����5:03:39 
* class description
*/
public class N_22_Generate_Parentheses {
	List<String> result=new ArrayList<String>();
	//left��right��ʾ�������Ÿ�ʣ�¼���
	private void recursive(int left,int right,String s){
		if(left==0&&right==0){
			result.add(s);
		}
		if(left>0){
			recursive(left-1,right,s+"(");
		}
		//ֻҪ��֤ʣ�µ������ŵ���ĿС��ʣ�µ������ŵ����ݣ��������ұ߼�")"
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
