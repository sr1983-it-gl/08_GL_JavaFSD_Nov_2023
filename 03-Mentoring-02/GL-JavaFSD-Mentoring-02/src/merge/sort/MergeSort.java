package merge.sort;

import dsa.ArraySlicerAndMerger;

public class MergeSort {

	private Integer[] array;
	
	public MergeSort(Integer[] array) {
		
		this.array = array;
	}
	
	public void sort() {
		
		divide(0, array.length - 1);
	}
	
	private void divide(int startIndex, int endIndex) {
		
		System.out.printf("Start Index : %d, End Index : %d",
				startIndex, endIndex);
		System.out.println();
		if (startIndex < endIndex) {
			
			int midPoint = (startIndex + endIndex) /2;
			
			divide(startIndex, midPoint);
			divide(midPoint + 1, endIndex);
					
			ArraySlicerAndMerger slicerAndMerger
				= new ArraySlicerAndMerger(array);
			
			slicerAndMerger.sliceAndMerge(
					startIndex, midPoint, endIndex);			
		}
	}
}
