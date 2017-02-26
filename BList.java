package a2p;
import be.ac.ua.ansymo.adbc.annotations.*;

@invariant({"$super && $this.size() <= $this.capacity"})
public class BList<E> extends List<E>{
	
	private int capacity=10;
	
	@requires({"capacity > 0"})
	public BList(int capacity){
		super();
		this.capacity = capacity;
	}
	@requires({"$super && $this.size() <= capacity"})
	public boolean add (Node<E> node){
		try{
		super.add(node);
		}catch(Exception e)
		{
			return false;
		}
		return true;
	}
	@requires({"$super && $this.size() <= capacity"})
	public void add(int index, Node<E> node){
		super.add(index, node);
	}

}
