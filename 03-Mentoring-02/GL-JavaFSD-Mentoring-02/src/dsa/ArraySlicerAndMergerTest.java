package dsa;

public class ArraySlicerAndMergerTest {

	public static void main(String[] args) {
		
//		test01();
//		
//		test02();
		
//		test03();
		
		test04();
	}
	
	static void test01() {
		
		Integer[] input = {21, 28, 13, 19, 34, 47};
		Utils.printArray(input);
		
		ArraySlicerAndMerger sm = new ArraySlicerAndMerger(input, 0, 1, 5);
		
		sm.sliceAndMerge();
					
//		Integer[] lsa = sm.constructLSA();
//	
//		System.out.println("LSA");
//		Utils.printArray(lsa);
//		
//		Integer[] rsa = sm.constructRSA();
//		
//		System.out.println("RSA");
//		Utils.printArray(rsa);
	}

	static void test02() {
		
		Integer[] input = { 13, 18, 42, 47, 15, 19 };
		Utils.printArray(input);
		
		ArraySlicerAndMerger sm = new ArraySlicerAndMerger(input, 0, 3, 5);
		
		sm.sliceAndMerge();
	
//		Integer[] lsa = sm.constructLSA();
//		
//		System.out.println("LSA");
//		Utils.printArray(lsa);
//		
//		Integer[] rsa = sm.constructRSA();
//		
//		System.out.println("RSA");
//		Utils.printArray(rsa);
		
	}

	
	static void test03() {
		
		Integer[] input = { 21, 28, 32, 44, 13, 19, 34, 68, 92 };
		Utils.printArray(input);
		
		ArraySlicerAndMerger sm = new ArraySlicerAndMerger(input, 0, 3, 8);
		
		sm.sliceAndMerge();
	}	

	static void test04() {
		
		Integer[] input = { 22, 29, 33, 45, 59, 14, 20, 35 };
		Utils.printArray(input);
		
		ArraySlicerAndMerger sm = new ArraySlicerAndMerger(input, 0, 4, 7);
		
		sm.sliceAndMerge();
	}	

}
