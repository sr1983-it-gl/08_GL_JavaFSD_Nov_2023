package pivot.finder;

public class PivotFinder {

	private Integer[] array;
	
	public PivotFinder(Integer[] array) {
	
		this.array = array;
	}
	
	public int find() {
		
		int startIndex = 0;
		int endIndex = array.length - 1;
		
		while (startIndex <= endIndex) {
			
			int startIndexElement = array[startIndex];
			
			int middleIndex = (startIndex + endIndex) / 2;
			int middleIndexElement = array[middleIndex];
			
			int nextIndexAfterMiddleIndex = (middleIndex + 1);
			int nextIndexElement = array[nextIndexAfterMiddleIndex];
			
			
			if (middleIndexElement > nextIndexElement) {
				
				// This is going to be pivotIndex
				return nextIndexAfterMiddleIndex;
			}else if (startIndexElement <= middleIndexElement) {
				
				startIndex = (middleIndex + 1);
			}else if (startIndex <= endIndex) {
				
				endIndex = (middleIndex -1);
			}
			
		}
		
		return -1;
	}
}
