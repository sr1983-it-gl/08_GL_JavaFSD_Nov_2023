package array.rotator;

import dsa.Utils;

public class ArrayRotatorLeftTest {

	public static void main(String[] args) {
		
		test01();
	}
	
	static void test01() {
		
		Integer[] array = { 3, 9, 11, 18, 24 };
		Utils.printArray(array);
		
		ArrayRotatorLeft leftRotator = 
			new ArrayRotatorLeft(array);
		
		leftRotator.rotateLeft();
		Utils.printArray(array);		
	}
}
