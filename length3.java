package lengthoflinkedlist;

public class length3 {
	node head;
	static class node{
		int data;
		node next;
		node(int data){

			data=this.data;
			next=null;
		}
	}
	public static void main(String args[]){
		length3 l=new length3();
		l.linkedlist(1);
		l.linkedlist(2);
		l.linkedlist(3);
		l.linkedlist(4);
		l.linkedlist(5);
		System.out.println("no. of nodes in linked list is" + l.getcount());
	    }
	public void linkedlist(int new_data){
		node new_node=new node(new_data);
		new_node.next=head;
		head=new_node;
		}
	 public int getcount(){
		 return gett(head);
	 }
	 public int gett(node Node){
		 
	     if (Node == null)
	         return 0;

	     return 1+gett(Node.next);
	 }

}
