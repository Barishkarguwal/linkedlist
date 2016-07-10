package lengthoflinkedlist1;

import java.util.Scanner;
public class searching3 {
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
    boolean n;	
searching3 obj=new searching3();	
obj.linkedlist(1);
obj.linkedlist(2);
obj.linkedlist(3);
obj.linkedlist(4);
obj.linkedlist(5);
Scanner in=new Scanner(System.in);
System.out.println("enter no. to be search");
int x=in.nextInt();
n=obj.search(x);
if (n==true) {
	System.out.println("it's true");
	}
	else {
	System.out.println("it's false");
	}
}
        public void linkedlist(int new_data){
         node new_node=new node(new_data);
        new_node.next=head;
         head=new_node;
    }
public boolean search(int data){
node temp=head;
while(temp!=null){
	
	if(temp.data==data)
		return true;
	temp=temp.next;	
}
return false;
}
}
