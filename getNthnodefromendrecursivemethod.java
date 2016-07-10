package lengthoflinkedlist1;
import java.util.Scanner;
public class getNthnodefromendrecursivemethod {
         static node head;
         static class node{
        	 int data;
        	 node next;
        	 node(int d){
        		 data=d;
        		 next=null;
        	 }
         }
         public static void main(String args[]){
        	 getNthnodefromendrecursivemethod get=new getNthnodefromendrecursivemethod();
        	 get.linkedlist(10);
        	 get.linkedlist(20);
        	 get.linkedlist(30);
        	 get.linkedlist(40);
        	 get.linkedlist(50);
             System.out.println("linked list");
        	 get.print();
        	 System.out.println("enter index");
        	 Scanner in=new Scanner(System.in);
        	 int m=in.nextInt();
        	 get.find(head,m);
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
         public void find(node head,int len1){
        	  int i=0;
        	if(head==null)
        		return;
        	
        	find(head.next,len1);
        	if(++i==len1)
        		System.out.println("elemnt=>" + head.data);
         }
}
