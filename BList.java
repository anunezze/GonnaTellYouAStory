package soen331_a2;
import be.ac.ua.ansymo.adbc.annotations.*;

@invariant({"$super",
			"$this.size()<="})
public class BList<E> extends List<E>{
	
	private int capacity;
	
	@requires({"capacity > 0",
			   ""})
	public BList(int capacity){
		super();
		this.capacity = capacity;
	
	}

}
