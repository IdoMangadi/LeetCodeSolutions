public class Practice1 {

	/**
	 * function to find the best position to insert '5' in order to get the highest value of a given number. 
	 * @param X - the number
	 * @return the result
	 */
  public static int Solution(int X) {
		  // define variables:
	    String numberAsString = String.valueOf(X);
	    boolean positive = false, fiveAdded = false;
	    if(X >= 0) positive = true;
	    
	    // Build an empty string:
	    StringBuilder res = new StringBuilder(numberAsString.length() + 1);
	    
	    for (int i = 0; i < numberAsString.length(); i++) {
	    	
	        char c = numberAsString.charAt(i);
	        
	        if(Character.isDigit(c) == false) {
	        	res.append(c);
	        }
	        else { 
	        	if (fiveAdded == false && ((positive == false && c > '5') || positive == true && c < '5')) {
		            res.append('5');
		            fiveAdded = true;
		        }
		        res.append(c);
		    }
	    }
	    
	    if (fiveAdded == false) {
	        res.append('5');
	    }
	    
	    return Integer.parseInt(res.toString());
	    
	}

	public static void main(String[] args) {
		System.out.println(Solution(268));    // Expected output: 5268
		System.out.println(Solution(670));    // Expected output: 6750
		System.out.println(Solution(0));      // Expected output: 50
		System.out.println(Solution(-999));   // Expected output: -5999
	}
}
