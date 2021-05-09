package erc;

public class MergeTwoLL {
	Node head, headA,headB,headTmp;
	class Node{
		int data;
		Node next;
	public	Node(int val){
		data=val;
		next=null;
	  }
	}
	public void pushA(int val){
		Node new_Node= new Node(val);
		new_Node.next=headA;
		headA=new_Node;
		
	  }
	public void pushB(int val)
	{
		Node new_Node= new Node(val);
		new_Node.next=headB;
		headB=new_Node;
	}
	
	public void merge(){
		while(true){
			if(headA.data>headB.data && headB !=null){
				head=headB;
				headB=headB.next;
			}
			else{
				head=headA;
				headA=headA.next;
			}
			head=head.next;
			System.out.println(head.data);
		}
	}
	public void printMurge(){
		Node tmp=head;
		while(tmp !=null){
			System.out.println(tmp.data+" ");
			tmp=tmp.next;
		}
	}
	
	public void printB(){
		Node tmp=headB;
		while(tmp !=null){
			System.out.print(tmp.data+" ");
			tmp=tmp.next;
		}
		System.out.println();
	}
	public void printA(){
		Node tmp=headA;
		while(tmp !=null){
			System.out.print(tmp.data+" ");
			tmp=tmp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) 
	{
		
		MergeTwoLL list=new MergeTwoLL();
		System.out.println("Before murge : ");
		//push in a headA
		list.pushA(5);
		list.pushA(15);
		list.pushA(25);
		list.pushA(35);
		list.pushA(45);
		list.printA();
		
		//push in a headB
		list.pushB(10);
		list.pushB(20);
		list.pushB(30);
		list.pushB(40);
		list.pushB(50);
		list.printB();
		
		System.out.println("After murge : ");
		
		list.printMurge();

		list.merge();
	}

}
