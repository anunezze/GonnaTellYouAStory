import be.ac.ua.ansymo.adbc.annotations.*;

public class List<E> {

	private Node<E> n;

	//default constructor
	public List(){
		n=null;
	}
	
	//parametrised constructor
	@requires ({ "x !== null" })
	@ensures ({"$this.getSize() ==1"})
	public List(Node<E> x){
		n=x;

	}
	
	//add a node at the end of the list
	public boolean add(Node<E> x){
		Node<E> next=n;
		while(next!=null){
			next=next.getNext();
			if (next == null){
				try{
					next.setNext(x);
					return true;
				} 
				catch(Exception e){
					return false;
				}
			}

		}
		try{
			next.setNext(x);
			return true;
		} 
		catch(Exception e){
			return false;
		}
	}
	
	//add a node at index 
	public void add(int index, Node<E> z){

	}
	
	// clear the list
	public void clear(){

	}
	
	//check if the list contains a node
	public boolean contains(Node<E> n){
		Node<E> next = n;
		while(next != null){
			if(next.getData() == n.getData())
				return true;
		}
		return false;
	}
	
	//get node at index
	public Node<E> get(int index){
		int count=0;
		Node<E> next=n;
		while (next != null){
			next=next.getNext();
			count ++;
			if (count == index) return next;
		}
		return null;

	}
	
	//find index of node
	public int indexOf(Node n){

	}
	
	//check if it is empty
	public boolean isEmpty(){
		if(n == null)
			return true;
		else 
			return false;
		
	}
	
	//remove a node
	public void remove(int index){

	}
	
	//add elemnt at index
	public void set(int index, E element){

	}
	
	//size of the list
	public int size(){
		int result;
		Node next;
		if(n!=null)
			result = 1;
		else 
			return 0;
		next = n.getNext();
		while(next != null){
			result++;
			next = next.getNext();
		}
		return result;

	}
}
