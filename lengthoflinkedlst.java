package hello;

public class lengthoflinkedlst {
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
	   lengthoflinkedlst lst=new  lengthoflinkedlst();
	    		lst.push(1);
	    		lst.push(2);
	    		lst.push(3);
	    		lst.push(4);
	    		lst.push(5);
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
