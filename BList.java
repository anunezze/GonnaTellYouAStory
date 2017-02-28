/*
 * Programming assignment 1, SOEN 331 - U, 
 * Dr. Constantinos Constantinides, Concordia University
 * Eglen  Cecaj 		ID: 26746047
 * Andres Nunez			ID: 27194331
 */

package a2p;
import be.ac.ua.ansymo.adbc.annotations.*;

//@invariant({"$this.size() <= $this.capacity"})
public class BList<E> extends List<E>{
	
	public int capacity;
	
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
	}
	

}
