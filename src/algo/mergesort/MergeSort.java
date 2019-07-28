package algo.mergesort;

public class MergeSort {
	
	public MergeSort(int[] inputArray) {
		sort(inputArray, 0, inputArray.length - 1);
	}
	
	public void sort(int[] inputArray, int start, int end) {
		if (start >= end) {
			return;
		}
		int mid = (start + end) / 2;
		sort(inputArray, start, mid); // sort left half
		sort(inputArray, mid + 1, end); // sort right half
		merge(inputArray, start, mid, end); // merge sorted results into the inputArray
	}
	
	public static void merge (int[] inputArray, int start, int mid, int end) {
		int tempArray[] = new int [end - start + 1];
		
		// index counter for the left side of the array
		int leftSlot = start;
		// index counter for the right side of the array
		int rightSlot = mid + 1;
		int k = 0;
		
		while (leftSlot <= mid && rightSlot <= end) {
			if (inputArray[leftSlot] < inputArray[rightSlot]) {
				tempArray[k] = inputArray[leftSlot];
				leftSlot ++;
			} else {
				tempArray[k] = inputArray[rightSlot];
				rightSlot ++;
			}
			k ++;
		}
		
		// When it gets to here, that means the above loop has completed.
		// So both the right and the left side of the sub-array can be considered sorted.
		
		if (leftSlot <= mid) { //consider the right side done being sorted. Left must be sorted already.
			while (leftSlot <= mid) {
				tempArray[k] = inputArray[leftSlot];
				leftSlot ++;
				k ++;
			}
		} else if (rightSlot <= end) {
			while (rightSlot <= end) {
				tempArray[k] = inputArray[rightSlot];
				rightSlot ++;
				k++;
			}
		}
		
		// Copy over the temp array into the appropriate slots of the inputArray.
		for (int i = 0; i < tempArray.length; i++) {
			inputArray[start + i] = tempArray[i];
		}
	}
	
//	public static void merge(int[] inputArray, int start, int mid, int end) {
//		int leftSize = mid - start + 1;
//		int rightSize = end - mid;
//		int [] leftArray = new int[leftSize + 1];
//		int [] rightArray = new int [rightSize + 1];
//		
//		for (int i = 0; i < leftArray.length; i++) {
//			leftArray[i] = inputArray[i];
//		}
//		for (int j = 0; j < rightArray.length; j++) {
//			rightArray[j] = inputArray[j];
//		}
//		leftArray[leftSize] = 99999999;
//		rightArray[rightSize] = 99999999;
//		
//		for (int i = 0, j = 0 , k = 0; j < inputArray.length; j++) {
//			if (leftArray[i] > rightArray[j]) {
//				inputArray[k] = leftArray[i];
//				i++;
//			} else {
//				inputArray[k] = rightArray[j];
//				j++;
//			}
//		}
//		
//	}
}
