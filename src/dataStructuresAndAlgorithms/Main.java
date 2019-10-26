package dataStructuresAndAlgorithms;

import sorting.MergeSort;
import utilty.BuildData;

public class Main {
	public static void main(String [] args) {
		
		int [] localArr = BuildData.getUnsortedIntArr(10, 1, 31);
		//BuildData.printIntArray(localArr);
		
		MergeSort ms = new MergeSort(localArr);
	}
}
