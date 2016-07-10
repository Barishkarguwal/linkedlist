package lengthoflinkedlist1;

import java.util.Scanner;

public class middleoflinkedlist {
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
   	 middleoflinkedlist middle=new middleoflinkedlist();
   	 Scanner in=new Scanner(System.in);
   	 System.out.println("enter no. of node you want to insert");
   	 int n=in.nextInt();
   	 int i=0;
   	 System.out.println("enter data for nodes");
   	 while(i<n)
   	 {
         int k=in.nextInt();  
   	 middle.linkedlist(k);
   	 i++;
    }  
   	 middle.middlelement();
}
    public void linkedlist(int new_data){
   	 node new_node=new node(new_data);
   	 new_node.next=head;
   	 head=new_node;
    }
    public void middlelement(){
    	node slow_ptr=head;
    	node fast_ptr=head;
    	while(fast_ptr!=null&&fast_ptr.next!=null){
    		fast_ptr=fast_ptr.next.next;
    		slow_ptr=slow_ptr.next;
    	}
    	System.out.println("middle element of linked list is" +slow_ptr.data);
    	}
    
 }