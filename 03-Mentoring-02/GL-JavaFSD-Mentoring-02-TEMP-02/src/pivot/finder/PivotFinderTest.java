package pivot.finder;

import dsa.Utils;

public class PivotFinderTest {

	public static void main(String[] args) {
		
		
		test01();
	}
	
	static void test01() {
		
//		Integer[] array = {12, 15, 21, 33, 42, 57, 1};
		
//		Integer[] array = {33, 42, 57, 9, 12, 15, 21};
		
		Integer[] array = {81, 91, 9, 12, 33, 42, 57, 66, 72};
		
		Utils.printArray(array);
		
		PivotFinder finder = new PivotFinder(array);
		
		int pivotIndex = finder.find();
		
		System.out.println("Pivot Index is " + pivotIndex);
		System.out.println("Pivot Element is " + array[pivotIndex]);
	}
}
