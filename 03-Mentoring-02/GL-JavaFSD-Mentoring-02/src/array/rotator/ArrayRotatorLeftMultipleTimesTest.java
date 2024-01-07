package array.rotator;

import dsa.Utils;

public class ArrayRotatorLeftMultipleTimesTest {

	public static void main(String[] args) {
		
//		test01();
//		test02();
		
		test03();
	}
	
	static void test01() {
		
		Integer[] array = { 33, 49, 61, 22, 11  };
		Utils.printArray(array);
		
		ArrayRotatorLeftMultipleTimes leftRotatorMultipleTimes =
			new ArrayRotatorLeftMultipleTimes(array);
		
		leftRotatorMultipleTimes.rotate(2);
		Utils.printArray(array);
	}	
	
	
	static void test02() {
		
		Integer[] array = { -10, 44, 93, -56, 32 };
		Utils.printArray(array);
		
		ArrayRotatorLeftMultipleTimes leftRotatorMultipleTimes =
			new ArrayRotatorLeftMultipleTimes(array);
		
		leftRotatorMultipleTimes.rotate(3);
		Utils.printArray(array);
	}	
	
	
	static void test03() {
		
		Integer[] array = { 0, 13, 45 };
		Utils.printArray(array);
		
		ArrayRotatorLeftMultipleTimes leftRotatorMultipleTimes =
			new ArrayRotatorLeftMultipleTimes(array);
		
		leftRotatorMultipleTimes.rotate(35);
		Utils.printArray(array);
	}	
}
