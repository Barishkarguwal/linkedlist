package baris;

public class deletingnodeREFERENCEGIVEN {
          static node head;
           static class node{
        	   int data;
        	   node next;
        	   node(int new_data){
        		   data=new_data;
        		   next=null;
        	   }
        	  }
           public static void main(String args[]){
        	   deletingnodeREFERENCEGIVEN obj=new deletingnodeREFERENCEGIVEN();
        	   obj.linkedlist(1);
        	   obj.linkedlist(2);
        	   obj.linkedlist(3);
        	   obj.linkedlist(4);
        	   obj.linkedlist(5);
        	   obj.linkedlist(6);
        	   System.out.println("linkedlist before deletion");
        	   obj.print();
        	   obj.deletenode(obj.head.next.next);
        	   obj.print();
           }
           public void linkedlist(int d){
        	   node new_node=new node(d);
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
           public void deletenode(node new_node1){
        	   node temp1=new_node1.next;
        	   new_node1.data=temp1.data;
        	   new_node1.next=temp1.next;
        	   temp1=null;
           }
}
