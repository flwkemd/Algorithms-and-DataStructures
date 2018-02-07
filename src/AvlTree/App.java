package AvlTree;

public class App {
	public static void main(String[] args) {
		
		Tree<String> avl = new AvlTree<>();
		
//		avl.insert(1); // left rotate
//		avl.insert(2);
//		avl.insert(3);

//		avl.insert(3); // right rotate
//		avl.insert(2);
//		avl.insert(1);

//		avl.insert(3); // left right rotate
//		avl.insert(1);
//		avl.insert(2);

//		avl.insert(1); // right left rotate
//		avl.insert(3);
//		avl.insert(2);

//		avl.insert(10);
//		avl.insert(20);
//		avl.insert(30);
//		avl.insert(40);
//		avl.insert(50);
//		avl.insert(60);

//		avl.insert(10);
//		avl.insert(15);
//		avl.insert(5);
//		avl.insert(14);
		
//		avl.delete(5);
		
		avl.insert("a");
		avl.insert("c");
		avl.insert("b");

		avl.traverse();
	}
}
