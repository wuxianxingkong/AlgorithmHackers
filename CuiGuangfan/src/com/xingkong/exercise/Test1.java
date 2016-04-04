package com.xingkong.exercise;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/** 
* @author cuiguangfan 736068048@qq.com: 
* @version create time：2016年3月22日 下午9:34:10 
* class description
*/
public class Test1 {
//	public static int solve(int x){
//		if(x<=2) return 1;
//		else {
//			return (solve(x-1)+solve(x-1))*2;
//		}
//	}
	private static class Person{
		Person(String name,Integer age){
			this.name=name;
			this.age=age;
			//System.out.println("Value:"+this);
		}
		public String name;
		public Integer age;
		@Override
		public int hashCode() {
			// TODO Auto-generated method stub
			return this.age;
		}
//		@Override
//		public boolean equals(Object obj) {
//			// TODO Auto-generated method stub
//			return this.age==((Person)obj).age;
//		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return this.name+","+this.age;
		}
		
	}
	//List<String> li=new ArrayList<String>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a = 4;//new Integer(4);
		Integer b = 4;//new Integer(4);
		System.out.println(a==b);
		Set<Integer> intC = new HashSet<>();
		intC.add(a);
		intC.add(b);
		System.out.println(intC.size());
		
		
//		Set<Person> set=new HashSet<Person>();
//		set.add(new Person("njz",23));
//		set.add(new Person("cgf",23));
//		System.out.println(set.size());
//		set.add(new Person("dsk",25));
//		Person per=new Person("ccccccc",24);
//		set.add(per);
//		per.name="ggggg";
//		per.age=55;
//		System.out.println(set.contains(per));
//		//set.add(new Person("ccc",100));
//		for(Person p:set){
//			
//			if(p.name.equals("njz")) p.age=100;
//		}
//		
//		//System.out.println(per);
//		set.add(per);
//		for(Person p:set){
//			System.out.println(p.name+","+p.age);
//		}
//		System.out.println(set.add(new Person("nnnn",23)));
//		
//		System.out.println(set.contains(new Person("njz",100)));
	}

}
