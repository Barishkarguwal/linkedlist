package lengthoflinkedlist1;

import java.util.Scanner;

import lengthoflinkedlist1.middleoflinkedlist.node;

public class getNthnodefromend {
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
	   	 getNthnodefromend get=new getNthnodefromend();
	   	 Scanner in=new Scanner(System.in);
	   	 System.out.println("enter no. of node you want to insert");
	   	 int n=in.nextInt();
	   	 int i=1;
	   	 System.out.println("enter data for nodes");
	   	 while(i<=n)
	   	 {
	         int k=in.nextInt();  
	   	     get.linkedlist(k);
	   	     i++;
	    }  
	   	System.out.println("enter index");
   	 int m=in.nextInt();
   	 if(m<=n)
   		 System.out.println("element at index" +m +"is" +get.find(m,n));
   	 else
   		 System.out.println("wrong index");
   	 }
	    public void linkedlist(int new_data){
	      	 node new_node=new node(new_data);
	      	 new_node.next=head;
	      	 head=new_node;
	       }
	    public int find(int index,int len){
	    	node temp=head;
	    	while(temp!=null){
	    		temp=temp.next;
	    	}
	    	temp=head;
	    	for(int i=1;i<len-index+1;i++){
	    		temp=temp.next;
	    	}
	    	return temp.data;
	    }
}  
	  




















