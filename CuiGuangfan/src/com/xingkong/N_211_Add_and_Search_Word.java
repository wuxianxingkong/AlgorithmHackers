package com.xingkong;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 * @author cuiguangfan 736068048@qq.com:
 * @version create time：2016年3月27日 下午3:45:08 class description
 */
public class N_211_Add_and_Search_Word {
	private static class Node{
		@Override
		public String toString() {
			return this.letter+":"+isWord+":children"+children.toString();
		}
		Node(String value){
			letter=value;
		}
		String letter;
		boolean isWord=false;
		HashMap<String,Node> children=new HashMap<String,Node>();
	}
	private Node root=new Node(null);
	public void addWord(String word) {
		Node tempRoot=root;
		for(int i=0;i<word.length();i++){
			Node tempNode=new Node(String.valueOf(word.charAt(i)));
			if(!tempRoot.children.containsKey(tempNode.letter)){
				tempRoot.children.put(tempNode.letter,tempNode);
			}
			if(i==word.length()-1){
				tempNode.isWord=true;
			}
			tempRoot=tempRoot.children.get(tempNode.letter);
		}
	}
	private boolean mysearch(HashMap<String,Node> children,String word,int index){
		if(index == word.length()){
            if(children.size()==0) 
                return true; 
            else
                return false;
        }
 
        String c = String.valueOf(word.charAt(index));    
 
        if(children.containsKey(c)){
            if(index == word.length()-1 && children.get(c).isWord){
                return true;
            }
 
            return mysearch(children.get(c).children, word, index+1);
        }else if(c.equals(".")){
            boolean result = false;
            for(Map.Entry<String, Node> child: children.entrySet()){
                if(index == word.length()-1 && child.getValue().isWord){
                    return true;
                } 
 
                if(mysearch(child.getValue().children, word, index+1)){
                    result = true;
                    return true;
                }
            }
 
            return result;
        }else{
            return false;
        }
	}
	public boolean search(String word){
		return mysearch(root.children,word,0);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		N_211_Add_and_Search_Word n=new N_211_Add_and_Search_Word();
		n.addWord("bad");
		n.addWord("dad");
		n.addWord("mad");
		System.out.println(n.root);
		System.out.println(n.search("pad"));
		System.out.println(n.search("bad"));
		System.out.println(n.search(".ad"));
		System.out.println(n.search("b.."));
	}

}
