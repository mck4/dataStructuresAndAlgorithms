package dataStructuresAndAlgorithms;

import utilty.BuildData;

public class Main {
	public static void main(String [] args) {
		
		int [] localArr = BuildData.getUnsortedIntArr(30, 1, 100);
		BuildData.printIntArray(localArr);
	}
}
