public class Practice{
  // function that calculates the number of unique absolute differences between consecutive elements in an array
  public static int DifferentValues(int[] A) {
		int max = 0;
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i=0; i<A.length-1; i++) {
			int currDiff = Math.abs(A[i] - A[i+1]);
			set.add(currDiff);
		}
		return set.size();
	}
}
