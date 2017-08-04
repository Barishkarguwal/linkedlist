package baris;

public class intersection {
            node head1;
            node head2;
            static class node{
            	int data;
            	node next;
            	node(int d1){
            		data=d1;
            		next=null;
            	}
            }
            public static void main(String args[]){
            	intersection obj=new intersection();
            	obj.head1=new node(3);
            	obj.head1.next=new node(15);
            	obj.head1.next.next=new node(30);
            	obj.head1.next.next.next=new node(13);
            	obj.head1.next.next.next.next=new node(19);
            	obj.head1.next.next.next.next.next=new node(10);
            	
            	obj.head2=new node(14);
            	obj.head2.next=obj.head1.next.next.next;
            	obj.head2.next.next=obj.head1.next.next.next.next;
            	obj.head2.next.next.next=obj.head1.next.next.next.next.next;
            	System.out.println("interscting node is" );
            	System.out.println(+obj.getNODE());
            }
            public int getNODE(){
            	int c1=getcount(head1);
            	int c2=getcount(head2);
                 int d;
                 
                 if(c1>c2){
                	 d=c1-c2;
                 return getintersection(d,head1,head2);
                 }
                 
                 else{
                	 d=c2-c1;
                 return getintersection(d,head2,head1);
                 }
            			
            }
            public int getcount(node NODE){
            	node temp=NODE;
            	int count=0;
            	while(temp!=null){
            		count++;
            		temp=temp.next;
            	}
            	return count;
            }
            public int getintersection(int data3,node node1,node node2){
            	int i;
            	node current1 = node1;
                node current2 = node2;
                for ( i =0; i<data3; i++) {
                    if (current1 == null) {
                        return -1;
                    }
                    current1 = current1.next;
                }
                while (current1 != null && current2 != null) {
                    if (current1 == current2) {
                        return current1.data;
                    }
                    current1 = current1.next;
                    current2 = current2.next;
            }
                return -1;
            
}
}
