package lengthoflinkedlist;

public class length {
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
	   	length lst=new length();
	    		lst.push(1);
	    		lst.push(2);
	    		lst.push(3);
	    		lst.push(4);
	    		lst.push(5);
	    		lst.push(6);
	    		System.out.println("no.of nodes in linked list are " + lst.getcount());
	    	}
	    	public void push(int new_data){
	    		node new_node=new node(new_data);
	    		new_node.next=head;
	    		head=new_node;
	    	}
	    	public int getcount(){
	    		node temp=head;
	    		int count=0;
	    		while(temp!=null){
	    			count++;
	    			temp=temp.next;
	    		}
	    		return count;
	    	}
}
