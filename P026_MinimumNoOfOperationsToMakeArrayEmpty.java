import java.util.HashMap;
import java.util.Map;


//LeetCode 2870. Minimum Number of Operations to Make Array Empty

public class P026_MinimumNoOfOperationsToMakeArrayEmpty {

    public int minOperations(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        int totalOperations = 0;

        for(int count : map.values()){
            if(count == 1){
                return -1;
            }
            totalOperations+= Math.ceil((double)count/3);
        }

        return totalOperations;
    }
}
