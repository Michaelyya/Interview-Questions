package presentation;

import java.util.Arrays;

public class exercise2 {
	public static int getSmallestDifference(int[]a, int[]b){
		Arrays.sort(a);
		Arrays.sort(b);
		int i = 0; int j = 0; int min = Integer.MAX_VALUE;
		while(a.length>i && b.length>j){
			int diff = Math.abs(a[i]-b[j]);
			if (min>diff){
				min = diff;
			}
			else if(diff == 0){
				return 0;
			}
			if(a[i] <b[j]){
				i++;
			}
			else{
				j++;
			}
		}
		return min;
	}
	/*
	c1 represents the number of steps needed to process each element of the input arrays,
	and c2 represents the number of steps needed to perform any initialization or finalization steps
	 */
}
