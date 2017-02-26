package a2p;

public class Demo {
	public static void main(String[] args){
			
		Node <String> n1= new Node<String>("Start");
		Node <String> n2= new Node<String>("Just");
		Node <String> n3= new Node<String>("do");
		Node <String> n4= new Node<String>("it");
		Node <String> n5= new Node<String>("Gousami");
		Node <String> n6= new Node<String>("Dean");
		Node <String> n7= new Node<String>("Mike");
		Node <String> n8= new Node<String>("David");
		
		List<String> l1 = new List<String>();
		
		l1.add(n2);
		l1.add(n3);
		l1.add(n4);
		l1.add(n5);
		l1.add(n6);
		l1.toStringAll();
		System.out.println();
		l1.add(2,n7);
		l1.toStringAll();
		System.out.println();
		System.out.println(l1.get(2).getData());
		System.out.println("Is the list empty? " + l1.isEmpty());
		System.out.println("Index of: " + n4.getData() + ": " + l1.indexOf(n4));
		System.out.println("Size of the list is: " + l1.size());
		System.out.println("Removing node at index 1:");
		l1.remove(4);
		l1.toStringAll();
		System.out.println();
		System.out.println("Size of the list is: " + l1.size());
		System.out.println();
		System.out.println("Index of n4: " + l1.indexOf(n4));
		System.out.println(l1.get(2).getData());
		System.out.println(l1.contains(n7));
		l1.clear();
		System.out.println(l1.size());
		
		//Testing BList
		/*System.out.println("");
		System.out.println("*********** BList *************");
		System.out.println("Testing BList");
		BList<String> b1 = new BList<String>(10);
		b1.add(n2);
		b1.add(n3);
		b1.add(n4);
		b1.add(n5);
		b1.add(n6);
		b1.add(2,n7);
		b1.toStringAll();
		System.out.println("Checking if the list is empty: " + b1.isEmpty());
		System.out.println("Index of " + n4.getData() + ": " + b1.indexOf(n4));
		System.out.println("Size of list is: " + b1.size());
		System.out.println("Removing node at index 5:");
		b1.remove(5);
		System.out.println("Printing out the list:");
		b1.toStringAll();
		System.out.println("Size of the list: " + b1.size());
		System.out.println("Index of node n4: "+ b1.indexOf(n4));
		System.out.println("Get the data at node n2" + b1.get(2).getData());
		System.out.println("Checking if the list contains node n7: "+b1.contains(n7));
		System.out.println("Clearing the list...");
		b1.clear();
		System.out.println("Size of BList after clear is: " + b1.size());
		*/
	}
}
