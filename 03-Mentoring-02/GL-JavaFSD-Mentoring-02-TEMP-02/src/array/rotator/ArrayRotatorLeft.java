package array.rotator;

public class ArrayRotatorLeft {

	private Integer[] array;
	
	public ArrayRotatorLeft(Integer[] array) {
		
		this.array = array;
	}

	public void rotateLeft() {
		
		int firstElement = array[0];
		
		for (int index = 1; index < array.length; index ++) {
			
			int currentElement = array[index];
			
			int previousIndex = (index - 1);
			array[previousIndex] = currentElement;
		}
		
		int lastElementIndex = array.length - 1;
		array[lastElementIndex] = firstElement;					
	}
}
