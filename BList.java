package a2p;
import be.ac.ua.ansymo.adbc.annotations.*;

//@invariant({"$super && $this.size() <= $this.capacity"})
public class BList<E> extends List<E>{
	
	private int capacity;
	
	@requires({"capacity > 0"})
	@ensures({"$super"})
	public BList(int capacity){
		super();
		this.capacity = capacity;
	}
	
	@requires({"capacity > 0"})
	@ensures  ({"$super"})
	public BList(int capacity,Node<E> x){
		super(x);
		this.capacity = capacity;
	}
	
	//@requires({"$super && $this.size() <= $this.capacity"})
	@ensures  ({"$super"})
	public boolean add (Node<E> x){
		try{
		super.add(x);
		}catch(Exception e)
		{
			return false;
		}
		return true;
	}
	
	//@requires({"$super && $this.size() <= $this.capacity"})
	@ensures  ({"$super"})
	public void add(int index, Node<E> y){
		super.add(index, y);
	}

}
