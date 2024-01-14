package merge.sort;

import java.util.Arrays;

public class MergeSortTest {

	public static void main(String[] args) {
		
//		Integer[] array = {972, 158, 815, 436, 401, 951};
		
		Integer[] array = {31, 29, 44, 58};
		
		System.out.println(Arrays.toString(array));
		
		MergeSort sort = new MergeSort(array);
		sort.sort();
		
		System.out.println(Arrays.toString(array));		
	}
}
