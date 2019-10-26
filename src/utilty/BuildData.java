package utilty;

import java.util.Random;

/**
 * Creates data, like unsorted arrays, to be worked with
 * @author rof194
 *
 */
public class BuildData {

	/**
	 * Returns an unsorted int array
	 * @param sizeOfArr size of the array
	 * @param startVal start val inclusive
	 * @param endVal ending val exclusive
	 * @return
	 */
	public static int[] getUnsortedIntArr(int sizeOfArr, int startVal, int endVal) {
		int [] arr = new int[sizeOfArr];
		Random random = new Random();
		
		for(int i = 0; i < sizeOfArr; i++) {
			arr[i] = random.nextInt(endVal - startVal) + startVal;
		}
		
		return arr;
	}
	
	public static void printIntArray(int [] arr) {
		for(int i: arr) {
			System.out.printf("%-4d", i);
		}
		
		System.out.println();
	}
	
	public static int[] copyIntArray(int [] arr) {
		int [] copy = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			copy[i] = arr[i];
		}
		
		return copy;
	}
}
