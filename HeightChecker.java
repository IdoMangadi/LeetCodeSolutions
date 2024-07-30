public class Practice{
  // function that determines how many students in an array of heights are not in their correct positions when sorted.
  public int heightChecker(int[] heights) {

        int len = heights.length;
        int[] heightsCount = new int [101];

        for(int i=0; i<len; i++){
            heightsCount[heights[i]]++; 
        }

        int pointer = 0;
        int result = 0;
        for(int i=1; i<101; i++){
            int count = heightsCount[i];
            for(int j=pointer; j<pointer+count; j++){
                if(heights[j] != i) result++;
            }
            pointer += count;
        }
        return result;
    }
}
