package lengthoflinkedlist1;

import java.util.Scanner;

public class getNthnode {
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
        	 getNthnode get=new getNthnode();
        	 Scanner in=new Scanner(System.in);
        	 System.out.println("enter");
        	 int n=in.nextInt();
        	 int i=1;
        	 System.out.println("enter nodes");
        	 while(i<=n)
        	 {
              int k=in.nextInt();  
        	 get.linkedlist(k);
        	 i++;
         }       	 
        	 System.out.println("enter index");
        	 int m=in.nextInt();
        	 if(m<=n)
        		 System.out.println("element at index" +m +"is" +get.find(m));
        	 else
        		 System.out.println("wrong index");
}
         public void linkedlist(int new_data){
        	 node new_node=new node(new_data);
        	 new_node.next=head;
        	 head=new_node;
         }
         public int find(int index){
              int count=1;
              node temp=head;
              while(temp!=null){
            	  if(count==index)
            		  return temp.data;
            	  count++;
            	  temp=temp.next;
              }
              return 0;
         }
}











