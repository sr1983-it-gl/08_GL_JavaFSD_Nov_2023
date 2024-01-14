package dsa;

public class ArraySlicerAndMerger {

	private Integer[] array;
	private int leftIndex;
	private int middleIndex;
	private int rightIndex;
	
	public ArraySlicerAndMerger(Integer[] array,
		int leftIndex, int middleIndex, int rightIndex) {
		
		this.array = array;
		this.leftIndex = leftIndex;
		this.middleIndex = middleIndex;
		this.rightIndex = rightIndex;
	}
	
	public void sliceAndMerge() {
		
		
		Integer[] lsa = constructLSA();
		Integer[] rsa = constructRSA();
		
		
		phase1AndPhase2(lsa, rsa);
	}
	
	public void phase1AndPhase2(Integer[] lsa, Integer[] rsa) {
		
		
		int maLength = lsa.length + rsa.length;
		
		Integer[] mergedArray = new Integer[maLength];
		
		int lsaPointer = 0;
		int rsaPointer = 0;
		int maPointer  = 0;
		
		// Phase 1
		
		while (lsaPointer < lsa.length && rsaPointer < rsa.length) {
			
			int lsaElement = lsa[lsaPointer];
			int rsaElement = rsa[rsaPointer];
			
			if (lsaElement < rsaElement) {
				
				mergedArray[maPointer] = lsaElement;
				
				lsaPointer ++;
				maPointer ++;
			}else if (rsaElement < lsaElement) {
				
				mergedArray[maPointer] = rsaElement;

				rsaPointer ++;
				maPointer ++;				
			}
		}
		
		
//		System.out.println("Phase 1 Complete");
	
	
		// Phase 2
		
//		System.out.println("LSA Pointer " + lsaPointer);
		
		// for (int index = 1;
		for ( ; lsaPointer < lsa.length; lsaPointer ++) {
			
			int lsaPendingElement = lsa[lsaPointer];
			
			mergedArray[maPointer] = lsaPendingElement;
			
			maPointer ++;
		}

	
		for ( ; rsaPointer < rsa.length; rsaPointer ++) {
			
			int rsaPendingElement = rsa[rsaPointer];
			
			mergedArray[maPointer] = rsaPendingElement;			
			maPointer ++;
		}
		
		Utils.printArray(mergedArray);
		
	}
	
	
	public Integer[] constructLSA(){
		
		int tLeftIndex = leftIndex;
		
		//
		int lsaLength = (middleIndex - leftIndex) + 1;
		Integer[] lsArray = new Integer[lsaLength];
		
		// lsaIndex - 0, 1, 2, 3
		// 
		for (int lsaIndex = 0; lsaIndex < lsArray.length; lsaIndex ++ ) {
			
			lsArray[lsaIndex] = array[tLeftIndex];
			
			tLeftIndex ++;
		}
		
		return lsArray;
	}
	
	public Integer[] constructRSA(){
		
		int tRightIndex = (middleIndex + 1);
		
		//
		int rsaLength = (rightIndex - middleIndex);
		Integer[] rsArray = new Integer[rsaLength];
		
		// lsaIndex - 0, 1, 2, 3
		// 
		for (int rsaIndex = 0; rsaIndex < rsArray.length; rsaIndex ++ ) {
			
			rsArray[rsaIndex] = array[tRightIndex];
			
			tRightIndex ++;
		}
		
		return rsArray;
	}
}
