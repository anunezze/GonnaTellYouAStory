//package soen331_a2;
import be.ac.ua.ansymo.adbc.annotations.*;

public class List<E> {

	private Node<E> n;

	//default constructor
	public List(){
		n=null;
	}

	//Parameterized constructor
	@requires ({ "x != null" })
	@ensures ({"$this.size() ==1"})
	public List(Node<E> x){
		n=x;
		System.out.println("List created");

	}

	//add a node at the end of the list
	@requires ({ "x != null" })
	@ensures ({"$this.size() ==$old($this.size())+1","x.getNext()==null"})
	public boolean add(Node<E> x){
		if (n == null){
			return false;
		}
		Node<E> current = n;
		while(current.getNext() != null){
			current=current.getNext();
		}
		current.setNext(x);
		System.out.println(x.getData());
		return true;
	}

	//add a node at index 
	@requires ({"$index > -1","z != null"})
	@ensures ({"$this.getSize() == $old($this.getSize())+1","$index == count"}) //not sure about the second part of the postcondition
	public void add(int index, Node<E> z){
		Node<E> pointer = n;
		Node<E> temp;
		int count=1;
		while (pointer != null){
			if (index==count){
				temp=pointer.getNext();
				pointer.setNext(z);
				z.setNext(temp);
				return;
			}
			pointer=pointer.getNext();
			count++;
		}

	}

	// clear the list
	@requires ({"true"})
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
	@requires ({"$index > -1"})
	@ensures({"$this.size() == $old($this.size())"})
	public Node<E> get(int index){
		int count=1;
		Node<E> next=n;
		while (next != null){
			if (count == index) return next;
			next=next.getNext();
			count ++;
			
		}
		return null;

	}

	//find index of node
	@requires({"n != null"})
	@ensures({"$this.size() == $old($this.size())",
	"$result == -1 || $result >= 0"})
	public int indexOf(Node<E> n){
		int count = 1;
		Node<E> next = this.n;
		while(next != null){
			if(next.equals(n))
				return count;
			next = next.getNext();
			count ++;
		}
		return -1;

	}

	//check if it is empty 
	@requires({"true"})
	@ensures({"$this.size() == $old($this.size())"})
	public boolean isEmpty(){
		if(n == null)
			return true;
		else 
			return false;

	}

	//remove a node
	@requires({"n != null","$index > -1"})
	@ensures({"$old($this.current.getNext()).equals(previous.getNext())"})//not sure
	public void remove(int index){
		if (index==1) {
			Node<E> temp=n;
			n=n.getNext();
			temp.setNext(null);
		} else{
			Node<E> previous = n;
			int count =1;
			while(count<index-1){
				previous=previous.getNext();
				count++;
			}
			Node<E> current=previous.getNext();
			previous.setNext(current.getNext());
			current.setNext(null);
		}
	}

	//add element at index
	@requires({"$index >= 1","element != null"})
	@ensures({"$this.size() == $old($this.size())"})
	public void set(int index, E element){
		Node<E> pointer = n;
		int count=1;
		if (pointer==null){
			System.out.println("List is empty");
			return;
		}
		while (pointer != null){
			if (index==count){
				pointer.setData(element);
			}
			pointer=pointer.getNext();
			count++;
		}


	}

	//size of the list
	@requires({"true"})
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
