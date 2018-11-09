package com.other.oop;


public class LinkedListsTrial {
	
		Node head;
		
		static class Node{
			 int data;
			 Node next;
			
			public Node(int data) {
				super();
				this.data = data;
				this.next=null;
			}
			
		}
	
		public void addBefore(int data) {
			Node n=new Node(data);
			n.next=this.head;
			head=n;
			
		}
		
		public void delete(int data) {
			Node temp=head,prev=null;
			if(temp!=null && temp.data==data ) {
				head=temp.next;
			}
			
			
			while(temp.next!=null && temp.data!=data) {
				prev=temp;
				temp=temp.next;
			}
			
			if(temp==null)
				return;
			System.out.println("Deleting node");
			prev.next=temp.next;
		}
		
		public void insertNext(Node prev,int data) {
			if(prev==null) {
				System.out.println("Previous node cannot be empty ");
				return;
			}
			Node new_node=new Node(data);
			new_node.next=prev.next;
			prev.next=new_node;

		}
		public void append(int data) {
			Node new_node=new Node(data);
			if(head==null) {
				head=new Node(data);
				return;
			}
			new_node.next=null;
			Node last=head;
			while(last.next!=null)
				last=last.next;
			
			last.next=new_node;
			return;
		}
		
		public void printNext() {
			Node n=this.head;
			
			while(n!=null) {
				System.out.println(n.data+" ");
				n=n.next;
			}
		}
		
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListsTrial ll=new LinkedListsTrial();
		
		ll.head =new Node(1);
		ll.printNext();
		System.out.println("\n");
		ll.append(2);
		ll.append(2);
		ll.append(2);
		ll.append(3);
		ll.printNext();
		System.out.println("\n");
		//ll.insertNext(ll, 3);
		ll.delete(3);
		ll.printNext();
	}
	

}
