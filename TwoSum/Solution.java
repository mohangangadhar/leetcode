import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] input, int target ) {
        Map<Integer, Integer> values = new HashMap<>();
        for (int i=0; i < input.length; i++){
            int compliment = target - input[i];
            if(values.containsKey(compliment)){
                return new int[] {values.get(compliment), i};
            }
            values.put(input[i], i );
        }
        throw new IllegalArgumentException("No matching sum found");
    }
}
