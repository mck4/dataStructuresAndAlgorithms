package utilty;

import java.util.Random;

/**
 * Creates data, like unsorted arrays, to be worked with
 * @author rof194
 *
 */
public class BuildData {

	/**
	 * 
	 * @param sizeOfArr
	 * @param startVal
	 * @param endVal
	 * @return
	 */
	public static int[] getUnsortedIntArr(int sizeOfArr, int startVal, int endVal) {
		int [] arr = new int[sizeOfArr];
		//TODO: fix this a bit
		Random random = new Random();
		random.ints(startVal, endVal+1);
		
		for(int i = 0; i < sizeOfArr; i++) {
			arr[i] = random.nextInt(endVal);
		}
		
		return arr;
	}
	
	public static void printIntArray(int [] arr) {
		for(int i: arr) {
			System.out.print(i + " ");
		}
	}
}
