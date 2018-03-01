package tabularmethod104;


public class linkedlist {
private slinkedlist head =null;
public void add(int index, int element[][]) {
	if(index<0){
		throw null;
	}
	 slinkedlist newnode= new slinkedlist();
	 slinkedlist i=head; 
	 newnode.primes=element;
	 
	if(index==0){
		
		newnode.next=head;
		head=newnode;
	}
	else{
		
		for(int counter=0;counter<index-1;counter++){
			
		
			if(i==null){
				break;
			}
			i=i.next;
	}
		if(i!=null){
		newnode.next=i.next;
		i.next=newnode;}else{
			throw null;
		}
		
	// TODO Auto-generated method stub
	}}

	public void add(int  element[][]) {
		slinkedlist i =head;
		slinkedlist newnode=new slinkedlist();
		newnode.primes=element;
		if(head==null){
			head=newnode;
		}else{
			while(i.next !=null){
				
		i=i.next;
			}
			
			newnode.next=null;
			i.next=newnode;
		}}
	
		// TODO Auto-generated method stub


	public int[][] get(int index) {
		if(index<0){
			return null;
		}
		slinkedlist i =head;
		int y=0;
		if(index>size()){
			return null;
		}
		if(head==null){
			return null;
		}
		while(y<index){
			i=i.next;
			if(i == null){
				return null;
			}
			y++;
		}
		
		// TODO Auto-generated method stub
		return i.primes;
	}

	/* (non-Javadoc)
	 * @see eg.edu.alexu.csd.primesstructure.linkedList.ILinkedList#set(int, java.lang.Object)
	 */
	

	public void clear() {
		head=null;
		// TODO Auto-generated method stub

	}

	public boolean isEmpty() {
		if(head==null){
			return true;
		}
		// TODO Auto-generated method stub
		return false;
	}

	public void remove() {
		
		
		
		
			head=head.next;
		
		
		
		// TODO Auto-generated method stub

	}

	public int size() {
		if(head==null){
			return 0;
		}
		int f=1;
		slinkedlist i =head;
		while (i.next!=null){
			
			i=i.next;
           f++;
		}
		// TODO Auto-generated method stub
		return f;
	}

	

	public boolean contains(Object o) {
		slinkedlist i =head;
		if(head == null){
			return false;
		}
		if(o.equals(head.primes)){
			return true;
		}
		while(i!=null){
			if(o.equals(i.primes)){
				return true;
			}
			i=i.next;
		}
		// TODO Auto-generated method stub
		return false;
	}
	
		
	
}
