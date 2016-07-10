package lengthoflinkedlist1;

import java.util.Scanner;

public class swappinglinkedlist {
            node head;
            public static class node{
            	int data;
            	node next;
            	node(int d){
            		data=d;
            		next=null;
            	}
            }
            public static void main(String args[]){
            	swappinglinkedlist swap=new swappinglinkedlist();
            	swap.linkedlist(1);
            	swap.linkedlist(2);
            	swap.linkedlist(3);
            	swap.linkedlist(4);
            	swap.linkedlist(5);
            	swap.linkedlist(6);
            	swap.linkedlist(7);
            	swap.linkedlist(8);
            	swap.linkedlist(9);
            	swap.linkedlist(10);
            	System.out.println("before swaping");
            	swap.print();
            	System.out.println("enter node to be swap");
            	Scanner in=new Scanner(System.in);
            	int x=in.nextInt();
            	int y=in.nextInt();
            	swap.swapping(x,y);
            	System.out.println("after swaping");
            	swap.print();
            }
            public void linkedlist(int new_data){
            	node new_node=new node(new_data);
            	new_node.next=head;
            	head=new_node;		
            }
            public void print(){
            	node temp=head;
            	while(temp!=null){
            		System.out.println(+temp.data);
            		temp=temp.next;
            	}
            }
            public void swapping(int x,int y){
            	if(x==y)
            		return;
            	 
            	node prevX=null,currX=head;
            	while(currX!=null&&currX.data!=x){
            		prevX=currX;
            		currX=currX.next;
            	}
            	
            	node prevY=null,currY=head;
            	while(currY!=null&&currY.data!=y){
                   prevY=currY;
                   currY=currY.next;
            	}
                
            	if(currX==null||currY==null)
            		return;
            	
            	if(prevX!=null)
            		prevX.next=currY;
            		else
            			head=prevX;
            	 if(prevY!=null)
            		 prevY.next=currX;
            	 else
            		 head=prevY;
            	 
            	 node temp=currX.next;
            	 currX.next=currY.next;
            	 currY.next=temp;
            }
            
}






























