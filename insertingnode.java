package hello;
import java.util.Scanner;

public class insertingnode {
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
    	 int cs;
    	 int s;
    	 insertingnode ins=new insertingnode();
    	 ins.head=new node(9);
    	 node second=new node(2);
    	 node third=new node(3);
    	 ins.head.next=second;
    	 second.next=third;
    	 Scanner in=new Scanner(System.in);
    	 do{
    		 System.out.println("*****LINKEDLIST OPERATIONS*****");
    		 System.out.println("1.print");
    		 System.out.println("2.insertion a node at beg.");
    		 System.out.println("3.inserting a node at end");
    		 System.out.println("4.inserting a node after a given node");
    		 System.out.println("5.inserting a node before a given node");
    		 System.out.println("6.deleting a given node");
    		  System.out.println("enter ur choice");
         cs=in.nextInt();
    	 switch(cs){
    	 case 1:System.out.println("linkedlist");
    	        ins.print();
    	         break;
    	 case 2:System.out.println("enter the node");
    	        int n=in.nextInt();
    	        ins.push(n);
    	        break;
    	 case 3:System.out.println("enter the node");
    	        int k=in.nextInt();
    	        ins.insend(k);
    	        break;
    	 case 4:System.out.println("enter the node");
    	         int m=in.nextInt();
    	         System.out.println("after which node u want to insert ");
    	         int g=in.nextInt();
    	        ins.insaft(m,g);
    	        break;
    	 case 5:System.out.println("enter the node");
    	        int p=in.nextInt();
    	        System.out.println("before which node u want to insert ");
    	        int f=in.nextInt();
    	        ins.insbef(p,f);
    	        break;
    	 case 6:System.out.println("given node");
    	        int key=in.nextInt();
    	        ins.delete(key);
    	        break;
    	 default:System.out.println("wrong choice");
    }
    	 System.out.println("if u want to continue press 1");
    	 s=in.nextInt();
     }while(s==1);
    	 System.out.println("termination of prgram");
     }
     public void print(){
		 node t=head;
		 while(t!=null)
		 {
             System.out.println(+ t.data);
			 t=t.next;
		 }
	 }
     public void push(int new_data){
    	 node new_node=new node(new_data);
    	 new_node.next=head;
    	 head=new_node;
    	 }
     public void insend(int new_data){
    	 node temp;
    	 node new_node=new node(new_data);
    	 temp=head;
    	 while(temp.next!=null)
    	 {
    		 temp=temp.next;
    	 }
    	 temp.next=new_node;
     }
     public void insaft(int new_data,int after){
    	 node ptr;
    	 node preptr;
    	 node new_node=new node(new_data);
    	 ptr=head;
    	 preptr=ptr;
    	 while(preptr.data!=after)
    	 {
    		 preptr=ptr;
    		 ptr=ptr.next;
    	 }
    			 preptr.next=new_node;
    			 new_node.next=ptr;
     }
     public void insbef(int new_data,int before){
    	 node ptr;
    	 node preptr;
    	 node new_node=new node(new_data);
    	 ptr=head;
    	 preptr=ptr;
    	 while(ptr.data!=before){
    		 preptr=ptr;
    		 ptr=ptr.next;
    	 }
    	 preptr.next=new_node;
    	 new_node.next=ptr;
     }
     void delete(int new_data){
    	 node prev=null;
    	 node temp=head;
    	 if(temp!=null&&temp.data==new_data){
    		 head=temp.next;
    		 return;
    	 }
    	 while(temp!=null&&temp.data!=new_data){
    		 prev=temp;
    		 temp=temp.next;
    	 }
    	 if(temp==null)
    		 return;
    	 
    	 prev.next=temp.next;
    		 
     }
}



























