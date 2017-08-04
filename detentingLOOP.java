package baris;

import java.util.Scanner;

public class detentingLOOP {
          node head;
          static class node{
        	  int data;
        	  node next;
        	  node(int data){
        		  data=this.data;
        		   next=null;
        		  }
          }
          public static void main(String args[]){
        	  detentingLOOP obj=new detentingLOOP();
        	  Scanner in=new Scanner(System.in);
        	  obj.linkedlist(1);
        	  obj.linkedlist(2);
        	  obj.linkedlist(3);
        	  obj.linkedlist(4);
        	  obj.linkedlist(5);
        	  obj.head.next.next.next.next.next=obj.head.next;
              
         	  obj.detect();
        	  
          }
          void linkedlist(int new_data){
        	  node new_node=new node(new_data);
        	  new_node.next=head;
        	  head=new_node;
          }
          public int detect(){
        	  node fast=head;
        	  node slow=head;
        	 while(slow!=null&&fast!=null&&fast.next!=null){
        		 slow=slow.next;
        		 fast=fast.next.next;
        		 if(slow==fast){
        			 System.out.println("found");
        			 return 1;
        		 } 
        		 }
        	 return 0;
          }
}

