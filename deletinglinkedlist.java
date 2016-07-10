package lengthoflinkedlist1;

public class deletinglinkedlist {
	    Node head; 
	 
	   static class Node
	    {
	        int data;
	        Node next;
	        Node(int d) {
	        	data = d;
	        	next = null;
	        	}
	    }
	 
	    void deleteList()
	    {
	        head = null;
	    }
	 
	    public void push(int new_data)
	    {
	        Node new_node = new Node(new_data);
	 
	        new_node.next = head;
	        head = new_node;
	    }
	 
	    public static void main(String [] args)
	    {
	        deletinglinkedlist llist = new deletinglinkedlist();
	 
	        llist.push(1);
	        llist.push(4);
	        llist.push(1);
	        llist.push(12);
	        llist.push(1);
	 
	        System.out.println("Deleting the list");
	        llist.deleteList();
	 
	        System.out.println("Linked list deleted");
	    }
	}
