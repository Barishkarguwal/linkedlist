package baris;

import java.util.Scanner;

public class palindrome {
	 static node head;
	 node top=null;
     static class node{
  	   int data;
  	   node next;
  	   node(int new_data){
  		   data=new_data;
  		   next=null;
  	   }
  	  }
     public static void main(String args[]){
  	   palindrome obj=new palindrome();
  	   Scanner in=new Scanner(System.in);
  	   System.out.println("enter no.nodes");
  	   int m=in.nextInt();
  	 System.out.println("enter nodes");
  	   while(m>0){
  		   int k=in.nextInt();
  		   obj.linkedlist(k);
  		   m--;
  	   }
  	   node temp=head;
  	   while(temp!=null){
  		   obj.push(temp.data);
  		   temp=temp.next;
  	   }
  	   boolean b=obj.palindromee(head);
  	   if(b==true){
  		   System.out.println("given linkedlist is palindrome");
  	   }
     }
     public void linkedlist(int d){
  	   node new_node=new node(d);
  	   new_node.next=head;
  	   head=new_node;
     }
       public void push(int new_node1){
    	  node temp5=new node(new_node1);
    	   temp5.next=top;
    	   top=temp5;
    	   
       }
       public int pop(node top){
    	   node tmp=top;
    	   top=top.next;
    	   return tmp.data;
    	   }
       public boolean palindromee(node head){
    	   node temp9=head;
    	   palindrome obj1=new palindrome();
    	   while(top!=null){
    	   int data1=obj1.pop(top);
           if(data1!=temp9.data){
    		   return false;
    	   }
    	   temp9=temp9.next;
    	   }
    	   return true;
       }
}





















