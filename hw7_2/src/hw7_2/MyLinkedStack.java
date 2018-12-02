package hw7_2;

import java.util.EmptyStackException;

public class MyLinkedStack {
	private class Node {
		int data;
		Node link;
		private Node(int data) {
			this.data=data;
		}
	}
	private Node top;
	
	
	public boolean isEmpty() {
		if(top==null) return true;
		else return false;
	}
	public void push(int d) {
		Node n=new Node(d);
		n.link=top;
		top=n;
	}
	public int pop() {
		if(this.isEmpty()) throw new EmptyStackException();
		int r=top.data;
		top=top.link;
		return r;
	}
	public int peek() {
		if(this.isEmpty()) throw new EmptyStackException();
		return top.data;
	}
}
