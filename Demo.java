//package soen331_a2;

public class Demo {
	public static void main(String[] args){
		BList<Integer> bl = new BList<Integer>(3);
		bl.add(new Node<Integer>(5));
		int result =bl.size();
		System.out.println(result);
		
		
	}
}
