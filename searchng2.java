package lengthoflinkedlist;
import java.util.Scanner;

public class searchng2 {
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
    	boolean name;
searchng2 l=new searchng2();	
l.linkedlist(1);
l.linkedlist(2);
l.linkedlist(3);
l.linkedlist(4);
l.linkedlist(5);
Scanner in=new Scanner(System.in);
int x=in.nextInt();
name=l.search(head,x);
if ( name==true) {
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
public boolean search(node new_node,int data){
	if(new_node.data==data)
		return true;
	if(new_node==null)
		return false;
	
	return search(new_node.next,data);
}
}
