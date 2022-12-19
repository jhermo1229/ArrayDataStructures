/**
 * 
 */
package ArrayRearrange;

import java.util.HashSet;
import java.util.Set;

/**
 * @author herje
 *
 */
public class ArrayRearrange {

	/**
	 * Easy Level
	 * Given an array of elements of length N, 
	 * ranging from 0 to N-1, your task is to write a 
	 * program that rearranges the elements of the array. 
	 * All elements may not be present in the array, 
	 * if the element is not present then there will be -3 present 
	 * in the array. Rearrange the array such that A[i] = i 
	 * and if i is not present, display -1 at that place.
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] arr = new int[] {1,2,4,5};
		
		int output[] = arrayArrange(arr);
		
		for (int i = 0; i < output.length; i++) {
			System.out.print(output[i]+ " ");
			
		}

	}
	
	public static int[] arrayArrange(int arr[]) {
		
		//Make it a set so that it is sorted

		Set<Integer> arrSet = new HashSet<Integer>();
		
		for(int x = 0; x < arr.length; x++) {
			arrSet.add(arr[x]);
		}
		
		for(int x = 0; x < arr.length; x++) {
			if(arrSet.contains(x)) {
				arr[x] = x;
			}else {
				arr[x] = -3;
			}
		}
		
		return arr;
	}
	
	

}
