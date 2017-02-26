package a2p;
public class Node<E> {
	
	private E data;
	private Node<E> next;
	
	public Node(E data){
		this.data = data;
		next = null;
	}
	public void setData(E data){
		this.data = data;
	}
	public E getData(){
		return data;
	}
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
