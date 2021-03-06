package com.psl.main;

public class Stack {
	public static Contact[] c = new Contact[5];
	public static int top = -1;
	
	public static Contact pop() throws StackExcp{
		if(top== -1)
			throw new StackExcp("pop not possible");
		else
			return c[top--];
	}
	public static boolean push(Contact ci) throws StackExcp{
		boolean flag = false;
		if(top+1>=5)
			throw new StackExcp("push not possible");
		else if(top <= 4){
			c[++top]=ci;
			flag = true;
			System.out.println(top);
		}
		if(!flag)
			return false;
		
		else
			return true;
	}
	
	public static void main(String args[]){
		try{
			System.out.println(push(new Contact()));
			System.out.println(push(new Contact()));
			System.out.println(push(new Contact()));
			System.out.println(push(new Contact()));
			System.out.println(push(new Contact()));
		}catch(StackExcp stk){
			System.out.println(stk.getMessage());
		}
		try{
			System.out.println(pop());
			System.out.println(pop());
			System.out.println(pop());
			System.out.println(pop());
			System.out.println(pop());
		}catch(StackExcp stk){
			System.out.println(stk.getMessage());
		}
	}
}
