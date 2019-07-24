package algo.recursion;

public class App {

	public static void main(String[] args) {
//		reduceByOne(10);
		int[] newArray = new int[] {1,2,3,4,5};
		//recursivelinearSearch(newArray, 0, 5);
		System.out.println(recursiveBinarySearch(newArray, 0, 4, 12));

	}
	
	public static int recursiveBinarySearch(int[] array, int lowerbound, int upperbound, int value) {
		System.out.println("[ " + lowerbound + "..." + upperbound + " ]");
		if (lowerbound > upperbound) {
			return -1;
		} else {
			int q = (lowerbound + upperbound) / 2;
			if (array[q] == value) {
				return q;
			} else if(array[q] > value) {
				return recursiveBinarySearch(array, lowerbound, q - 1, value);
			} else {
				return recursiveBinarySearch(array, q + 1, upperbound, value);
			}
		}
	}
	
	public static int recursivelinearSearch(int[] array, int currentIndex, int value) {
		if (currentIndex > array.length - 1) {
			return -1;
		} else if (array[currentIndex] == value) {
			//System.out.println("Completed Call: " + currentIndex);
			return currentIndex;
		} else {
			System.out.println("Index at: " + currentIndex);
			return recursivelinearSearch(array, currentIndex + 1, value);
		}
	}
	
	public static void reduceByOne(int n) {
		if (n != 0) reduceByOne(n-1);
		System.out.println("Completed Call: " + n);
	}

}
