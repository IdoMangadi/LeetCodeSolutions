public class practice{
  // function to solve the doctors in hospitals problem. 
  public static int DoctorsInHospitals(int A[][]) {
		
		if(A == null || A.length == 0 || A[0].length == 0) return 0;
		int result = 0;
		HashMap<Integer, Integer> resultMap = new HashMap<>();
		
		for(int k=0; k<A.length; k++) {
			
			HashMap<Integer, Integer> HospitalMap = new HashMap<>();
			
			for(int l=0; l<A[0].length; l++) {
				
				if(HospitalMap.get(A[k][l]) == null) {
					HospitalMap.put(A[k][l], 1);
					if(resultMap.get(A[k][l]) == null) {
						resultMap.put(A[k][l], 1);
					}
					else {
						int val = resultMap.get(A[k][l]);
						resultMap.put(A[k][l], val+1);
					}
				}
			}
			
		}
		for(int value : resultMap.values()) {
			if(value >= 2) result++;
		}
		
		return result;
	}
}
