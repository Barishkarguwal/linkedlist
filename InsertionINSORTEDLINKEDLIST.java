package baris;

import java.util.Scanner;

public class InsertionINSORTEDLINKEDLIST {
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
        	   InsertionINSORTEDLINKEDLIST obj=new InsertionINSORTEDLINKEDLIST();
        	   node new_node;
    new_node=obj.push(5);
        	   obj.sortedinsert(new_node);
        	   new_node=obj.push(10);
        	   obj.sortedinsert(new_node);
        	   new_node=obj.push(4);
        	   obj.sortedinsert(new_node);
        	   new_node=obj.push(9);
        	   obj.sortedinsert(new_node);
        	   new_node=obj.push(12);
        	   obj.sortedinsert(new_node);
        	   new_node=obj.push(6);
        	   obj.sortedinsert(new_node);
        	   obj.print();
        	     
           }
           public node push(int new_data){
        	   node x=new node(new_data);
        	  return x;
           }
           public void print(){
        	   node temp=head;
        	   while(temp!=null){
        		   System.out.println(+temp.data);
        		   temp=temp.next;
        	   }
           }
           public void sortedinsert(node new_node){
        	   node curr=null;
        	   if(head==null||head.data>=new_node.data){
        		   new_node.next=head;
        		   head=new_node;
        	   }
           else{
        	   curr=head;
        	   while(curr.next!=null&&curr.next.data<new_node.data){
        		   curr=curr.next;
        	   }
        	   new_node.next=curr.next;
        	   curr.next=new_node;
           }
           }
}
