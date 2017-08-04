package baris;

import java.util.Scanner;

public class merging {
           static class node{
        	   int data;
        	   node next;
        	   node(int d){
        		   data=d;
        		   next=null;
        		 }
           }
           class linkedlist1{
        	   linkedlist1 obj2=new linkedlist1();
        	   node head;
           }
           public static void main(String args[]){
        	   merging obj=new merging();
        	  System.out.println("1st Linkedlist");
        	   obj.create();
        	   System.out.println("2nd Linkedlist");
        	   obj.create();
           }
           public void create(){
        	   merging obj1=new merging();
        	   Scanner in=new Scanner(System.in);
        	   System.out.println("ENTER NO. OF NODES");
        	  int m=in.nextInt();
        	  System.out.println("enter nodes");
        	  while(m>0){
        		  int k=in.nextInt();
        		  obj1.linkedlist(k);	  
        	  }
           }
           public node linkedlist(int new_data){
        	   node new_node=new node(new_data);
        	   new_node.next=head;
        	   head=new_node;
           }
}
        		
