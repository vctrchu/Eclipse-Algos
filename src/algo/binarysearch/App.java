package algo.binarysearch;

public class App {

	public static void main(String[] args) {
		System.out.println(binarySearch(12, new int[] {1, 2, 3, 4, 7, 9, 12, 18}));

	}
	
	public static int binarySearch(int x, int[] A) {
		int p = 0;
		int r = A.length - 1;
		int q;
		while(p <= r) {
			q = (p + r) / 2;
			if (A[q] == x) {
				return q;
			} else if (A[q] > x) {
				r = q - 1;
			} else {
				p = q + 1;
			}
		}
		return -1;
	}

}
