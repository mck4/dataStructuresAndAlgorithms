package sorting;

import utilty.BuildData;

public class MergeSort implements Sort{
	int [] before;
	int [] after;
	
	public MergeSort(int [] arr) {
		this.before = BuildData.copyIntArray(arr);
		this.after = arr;
		
		System.out.println("Before:");
		BuildData.printIntArray(before);
		
		// launch
		sort(arr, 0, arr.length - 1);
		//BuildData.printIntArray(after);
	}
	
	public void sort(int [] arr, int start, int end) {
		if(start < end) {
			int middle = (start + end) / 2;
			
			// first half
			sort(arr, start, middle);
			
			// second half
			sort(arr, middle + 1, end);
			
			// merge
			merge(arr, start, middle, end);
		}
	}
	
	public void merge(int [] arr, int start, int middle, int end) {
		/*int [] tempArr = new int [end - start + 1];
		
		//System.out.println(start + " " + middle + " " + end);
		//System.out.println(tempArr.length);
		
		int posSt = start, posMid = middle + 1, inc = 0;
		for(int i = start; i <= end; i++) {
			
			if(posSt > middle) {
				tempArr[inc] = arr[posMid];
				System.out.println(inc + " " + posMid + " " + middle);
				inc++;
				posMid++;
			}
			else if(posMid > end) {
				tempArr[inc] = arr[posSt];
				inc++;
				posSt++;
			}
			else if(arr[posSt] < arr[posMid]) {
				tempArr[inc] = arr[posSt];
				inc++;
				posSt++;
			}
			else {
				tempArr[inc] = arr[posMid];
				inc++;
				posMid++;
			}
			
		}
		
		for(int i = 0; i < inc; i++) {
			arr[start] = tempArr[i];
			start++;
		}
		
		System.out.println("result");
		BuildData.printIntArray(arr);
	*/
	}
}
