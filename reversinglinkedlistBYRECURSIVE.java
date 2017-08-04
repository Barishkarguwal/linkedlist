package baris;

import java.util.Scanner;

import baris.reverseAlinkedlist.node;

public class reversinglinkedlistBYRECURSIVE {
	static node head;
	static class node{
		int data;
		node next;
		node(int d){
			data=d;
			next=null;
		}
	}
           public static void main(String args[]){
	       reversinglinkedlistBYRECURSIVE obj=new reversinglinkedlistBYRECURSIVE();
	       Scanner in=new Scanner(System.in);
	    	  System.out.println("enter no. of node u want to insert in linkedlist");
	    	  int m=in.nextInt();
	    	  System.out.println("enter nodes");
	    	  while(m>0){
	    		  int n=in.nextInt();
	    		  obj.linkedlist(n);  
	    		  m--;
	    	  }
	    	  System.out.println("reversed linkdlist");
	    	 obj.rev(head, null);
	    	 while(head!=null){
	    		 System.out.println(+head.data);
	    		 head=head.next;
	    	 }
}
           public void linkedlist(int new_data){
        	   	  node new_node=new node(new_data);
        	   	  new_node.next=head;
        	   	  head=new_node;
        	   }
           public node rev(node curr,node prev){
        	   if(curr.next==null){
        		   head=curr;
        	   curr.next=prev;
        	   return null;
        	   }
        	   
        	   node next1=curr.next;
        	   curr.next=prev;
        	   rev(next1,prev);
        	   return head;
           }
}
