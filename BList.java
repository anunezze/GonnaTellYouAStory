package a2p;
import be.ac.ua.ansymo.adbc.annotations.*;

//@invariant({"$this.size() <= $this.capacity"})
public class BList<E> extends List<E>{
	
	public int capacity=10;
	
	@requires({"capacity > 0"})
	@ensures({"$super"})
	public BList(){
		super();
	}
	
	@requires({"capacity > 0"})
	@ensures  ({"$super"})
	public BList(Node<E> x, int capacity){
		super(x);
		this.capacity=capacity;
	}
	
	@requires({"$this.size() <= $this.capacity"})
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
	
	@requires({"$this.size() <= $this.capacity"})
	@ensures  ({"$super"})
	public void add(int index, Node<E> y){
		super.add(index, y);
		System.out.println(this.capacity);
	}
	

}
