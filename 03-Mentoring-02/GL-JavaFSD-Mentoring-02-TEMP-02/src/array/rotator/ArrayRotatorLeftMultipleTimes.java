package array.rotator;

public class ArrayRotatorLeftMultipleTimes {

	private Integer[] array;
	
	public ArrayRotatorLeftMultipleTimes(
		Integer[] array) {
		
		this.array = array;
	}
	
	public void rotate(int rotationsCount) {
		
		System.out.println("Original Rotations Count : " + rotationsCount);
		int actualRotationsCount
			= rotationsCount % array.length;
		
		System.out.println("Actual Rotations Count : " + actualRotationsCount);
		
		for (int index = 1; index <= actualRotationsCount; index ++) {
			
			ArrayRotatorLeft leftRotator = 
				new ArrayRotatorLeft(array);
			leftRotator.rotateLeft();
		}
	}
}
