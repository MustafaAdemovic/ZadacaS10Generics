package ba.bitcamp.generics;
import java.util.Iterator;

public class ListTest {
	public static void main(String[] args) {
		List test = new List();
//		System.out.println("Empty list: " + test);
//		
		test.add("B");
		test.add("D");
//		System.out.println("After add: " + test);
//		
		test.push("A");
		test.push("X");
//		System.out.println("After push: " + test);
//		
//		System.out.println("List size: " + test.size());
//		
//		test.pop();
//		System.out.println("After pop: " + test);
//		
		test.insertAt("C", 2);
//		System.out.println("After insert: " + test);
//		
		test.insertAt("X", 4);
//		System.out.println("After insert at end: " + test);
//		
//		test.removeAt(4);
//		test.add("E");
//		test.add("F");
//		System.out.println("After remove from end: " + test);
//		
//		System.out.println(test.remove());
//		
//		Object[] array = test.toArray();
//		
//		System.out.print("In the array: ");
//		for (int j=0; j<array.length; j++) {
//			System.out.print(array[j] + " ");
//			
//		}
//		System.out.println();
//		
//		for (int i=0; i<5; i++) {
//			test.pop();
//		}
//		System.out.println("After popping all: " + test);
//		
//		System.out.println("List size: " + test.size());
//		
//		test.add("Z");
//		System.out.println("After add: " + test);
//		
//		System.out.println("List size: " + test.size());
		
		Iterator<Object> iter = test.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	}
}