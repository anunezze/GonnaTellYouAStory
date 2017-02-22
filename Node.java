
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
}
