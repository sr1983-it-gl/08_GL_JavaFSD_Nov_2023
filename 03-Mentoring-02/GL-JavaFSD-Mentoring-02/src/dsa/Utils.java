package dsa;


public class Utils {

	public static void printArray(Integer[] array) {
		
		for (int index = 0; index < array.length; index ++) {
			
			System.out.print(array[index]);

			if (index == (array.length - 1)) {
				
				// No comma
			}else {
				// Print comma
				
				System.out.print(", ");
			}
			
		}
		
		System.out.println();
	}	
}
