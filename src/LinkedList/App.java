package LinkedList;

public class App {
	public static void main(String[] args) {
		
		List<Person> list = new LinkedList<Person>();
		
		Person p = new Person("Adam", 10);
		
		list.insert(p);
		list.insert(new Person("Joe", 22));
		list.insert(new Person("Kavin", 1));
		list.insert(new Person("Michael", 42));
	
		System.out.println(list.size());
		
		list.remove(p);
		
		list.traverseList();
	}
}
