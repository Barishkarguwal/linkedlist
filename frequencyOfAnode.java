package baris;

import java.util.Scanner;

public class frequencyOfAnode {
           node head;
          static class node{
        	   int data;
        	   node next;
        	   node(int d){
        		   data=d;
        		   next=null;
        	   }
           }
          public static void main(String args[]){
        	  frequencyOfAnode f=new frequencyOfAnode();
        	  Scanner in=new Scanner(System.in);
        	  System.out.println("enter no. of node u want to insert in linkedlist");
        	  int m=in.nextInt();
        	  System.out.println("enter nodes");
        	  while(m>0){
        		  int n=in.nextInt();
        		  f.linkedlist(n);  
        		  m--;
        	  }
        	  System.out.println("enter the node whose frequency u want to calculate");
        	  int g=in.nextInt();
        	  System.out.println("frequency of a given node is" +f.frequency(g));
          }
          public void linkedlist(int new_data){
        	  node new_node=new node(new_data);
        	  new_node.next=head;
        	  head=new_node;
        }
       public int frequency(int freq){
    	   node temp=head;
    	   int count=0;
    	   while(temp!=null){
    		   if(temp.data==freq){
    			   count++;
    		   }
    		   temp=temp.next;
    	   }
    	   return count;
       }
}
