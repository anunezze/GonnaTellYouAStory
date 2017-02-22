package soen331_a2;
import be.ac.ua.ansymo.adbc.annotations.*;

public class List<E> {

	private Node<E> n;

	//default constructor
	public List(){
		n=null;
	}

	//Parameterized constructor
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
	//left to fix the pointer so it does not go
	//to the end of the list after adding the node
	public void add(int index, Node<E> z){
		Node<E> pointer = n;
		Node<E> temp;
		int count=0;
		while (pointer != null){
			if (index==count){
				temp=pointer.getNext();
				pointer.setNext(z);
				z.setNext(temp);
			}
			pointer=pointer.getNext();
			count++;
		}

	}

	// clear the list
	@ensures({"$this.size() == 0"})
	public void clear(){
		this.n = null;
	}

	//check if the list contains a node
	@requires({"n != null"})
	@ensures({"$this.size() == $old($this.size())"})
	public boolean contains(Node<E> n){
		Node<E> next = n;
		while(next != null){
			if(next.equals(n))
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
	@requires({"n != null"})
	@ensures({"$this.size() == $old($this.size())",
			  "$result == -1 || $result >= 0"})
	public int indexOf(Node<E> n){
		int count = 0;
		Node<E> next = this.n;
		while(next.getNext() != null){
			next = next.getNext();
			if(next.equals(n))
				return count;
			count ++;
		}
		return -1;

	}

	//check if it is empty
	@ensures({"$this.size() == $old($this.size())"})
	public boolean isEmpty(){
		if(n == null)
			return true;
		else 
			return false;

	}

	//remove a node
	// not done yet
	public void remove(int index){
		Node<E> pointer = n;
		int count=0;
		if (pointer==null){
			System.out.println("List is empty");
		}
		while (pointer != null){
			if (index==count+1){
				pointer.setNext(pointer.getNext().getNext());
			}
			pointer=pointer.getNext();
			count++;
		}
	}

	//add element at index
	public void set(int index, E element){

	}

	//size of the list
	@ensures({"$result >=0"})
	public int size(){
		int result;
		Node<E> next;
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
