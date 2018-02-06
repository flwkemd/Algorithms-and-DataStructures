package BinarySearchTree;

public class App {

	public static void main(String[] args) {

		// O(N)	or	O(logN)
		Tree<Person> bst = new BinarySearchTree<>();
		
		bst.insert(new Person("Adam",27));
		bst.insert(new Person("Kevin",13));
		bst.insert(new Person("Joe",67));
		bst.insert(new Person("Michael",2));
		bst.insert(new Person("Smith",11));
		
		bst.traversal();
		
//		Tree<Integer> bst = new BinarySearchTree<>();
//		
//		bst.insert(10);
//		bst.insert(5);
//		bst.insert(15);
//		bst.insert(3);
//		bst.insert(7);
//
//		bst.traversal();
//		System.out.println();
//		bst.delete(10);
//		
//		System.out.println(bst.getMaxValue());
//		System.out.println(bst.getMinValue());
	}
}
