/*
 * Programming assignment 1, SOEN 331 - U, 
 * Dr. Constantinos Constantinides, Concordia University
 * Eglen  Cecaj 		ID: 26746047
 * Andres Nunez			ID: 27194331
 */

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
		
		Node <String> s1= new Node<String>("Edi");
		Node <String> s2= new Node<String>("Sala");
		Node <String> s3= new Node<String>("Eri");
		Node <String> s4= new Node<String>("Luli");
		Node <String> s5= new Node<String>("Donald");
		Node <String> s6= new Node<String>("Barack");
		Node <String> s7= new Node<String>("Leli");
		Node <String> s8= new Node<String>("Ben");
		Node <String> s9= new Node<String>("John");
		Node <String> s10= new Node<String>("Andres");
		
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
		int delete = 4;
		System.out.println("Removing node at index: " + delete);
		l1.remove(delete);
		l1.toStringAll();
		System.out.println();
		System.out.println("Size of the list is: " + l1.size());
		System.out.println();
		System.out.println("Index of n4: " + l1.indexOf(n4));
		System.out.println("Getting data at index 2: " + l1.get(2).getData());
		System.out.println("Checking if the list contains node n7: " + l1.contains(n7));
		l1.clear();
		System.out.println("Size of the list after clear: " + l1.size());
		
		//Testing BList
		System.out.println("");
		System.out.println("*********** Testing BList *************");
		BList<String> b1 = new BList<String>(s1, 10);
		b1.add(s2);
		b1.add(s3);
		b1.add(s4);
		System.out.println("Size of the list: " + b1.size());
		b1.add(s5);
		b1.add(s6);
		b1.add(s7);
		b1.add(2,s8);
		b1.add(2,s9);
		b1.add(2,s10);
		b1.toStringAll();
		System.out.println();
		System.out.println("Checking if the list is empty: " + b1.isEmpty());
		System.out.println("Index of " + s4.getData() + ": " + b1.indexOf(s4));
		System.out.println("Size of list is: " + b1.size());
		System.out.println("Removing node at index 5:");
		b1.remove(5);
		System.out.println();
		b1.toStringAll();
		System.out.println();
		System.out.println("Size of the list: " + b1.size());
		System.out.println("Index of node n4: "+ b1.indexOf(s4));
		System.out.println("Get the data at node n2: " + b1.get(2).getData());
		System.out.println("Checking if the list contains node n7: "+b1.contains(s7));
		System.out.println("Clearing the list...");
		b1.clear();
		System.out.println("Size of BList after clear is: " + b1.size());
		
	}
}
