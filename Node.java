package a2p;

import be.ac.ua.ansymo.adbc.annotations.ensures;
import be.ac.ua.ansymo.adbc.annotations.requires;

public class Node<E> {
	
	private E data;
	private Node<E> next;
	
	@requires({"data != null"})
	public Node(E data){
		this.data = data;
		next = null;
	}
	
	@requires({"data != null"})
	public void setData(E data){
		this.data = data;
	}
	
	public E getData(){
		return data;
	}
	
	@requires({"next != null"})
	@ensures({"$this.next == next"})
	public void setNext(Node<E> next){
		this.next = next;
	}
	public Node<E> getNext(){
		return next;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Node<E> other = (Node) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		return true;
	}
}
