package baris;

import java.util.Scanner;

public class reverseAlinkedlist {
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
    	 node temp=null;
   	  reverseAlinkedlist rev=new reverseAlinkedlist();
   	  Scanner in=new Scanner(System.in);
   	  System.out.println("enter no. of node u want to insert in linkedlist");
   	  int m=in.nextInt();
   	  System.out.println("enter nodes");
   	  while(m>0){
   		  int n=in.nextInt();
   		  rev.linkedlist(n);  
   		  m--;
   	  }
   	  System.out.println("reversed linkedlist");
   	  temp=rev.reverse(head);
   	  while(temp!=null){
   		  System.out.println(+temp.data);
   		  temp=temp.next;
   	  }
     }
   	 public void linkedlist(int new_data){
   	  node new_node=new node(new_data);
   	  new_node.next=head;
   	  head=new_node;
   }
   	 public node reverse(node data1){
   		 node prev=null;
   		 node curr=data1;
   		 node next1=null;
   		 while(curr!=null){
   			 next1=curr.next;
   			 curr.next=prev;
   			 prev=curr;
   			curr=next1;
   		 }
   		 data1=prev;
   		 return data1;
   	 }
}
