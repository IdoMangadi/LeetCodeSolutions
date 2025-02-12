public class Practice{

	// function to find the maximum value in a CVS column
	public static int CVSMax(String S, String T) { 
		
		int max = Integer.MIN_VALUE;
		if(S == null || T == null) return max;
		
		String[] rows = S.split("\n");
		String[] firstRow = rows[0].split(",");
		
		int colIndex = 0;
		for(int i=0; i<firstRow.length; i++) {
			if(firstRow[i].equals(T)) {
				colIndex = i;
				break;
			}
		}
		
		for(int i=1; i<rows.length; i++) {
			String[] currRow = rows[i].split(",");
			int currVal = Integer.parseInt(currRow[colIndex]);
			if(currVal > max) max = currVal;
		}
		
		return max;
  	}
}
