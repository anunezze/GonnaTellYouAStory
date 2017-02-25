package soen331_a2;

public class Demo {
	public static void main(String[] args){
		Node <String> n1= new Node<String>("Start");
		Node <String> n2= new Node<String>("Just");
		Node <String> n3= new Node<String>("do");
		Node <String> n4= new Node<String>("it");
		Node <String> n5= new Node<String>("Gousami");
		Node <String> n6= new Node<String>("Dean");
		Node <String> n7= new Node<String>("Lucy");
		Node <String> n8= new Node<String>("David");
		
		List l1 = new List(n1);
		System.out.println("First node in the list: " + n1.getData());
		
		l1.add(n2);
		l1.add(n3);
		l1.add(n4);
		System.out.println(l1.isEmpty());
		System.out.println(l1.indexOf(n3));
	}
}
