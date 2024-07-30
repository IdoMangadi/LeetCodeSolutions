public class Practice{
	/**
	 * function to find the number of strictly decreasing sequences in a given array.
	 * @param A the array.
	 * @return the requiered number.
	 */
	public static int Solution(int[] A) {
		
		if(A.length == 1 || A.length == 0) return 0;
		
		int counter = 0;
		boolean decreasing = false;
		
		for(int i=0; i<A.length-1; i++) {
			if(A[i] > A[i+1] && decreasing == false) {
				counter++;
				decreasing = true;
			}
			if(A[i] <= A[i+1]) decreasing = false;
		}
		
		return counter;
	}
}
