package Arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = new int[]{ 1, 1, 2, 1, 3, 5, 1};

        System.out.println("majority element is "+ majorityElement(arr));
    }

    private static int majorityElement(int[] arr) {
        // code here
        int needCount = arr.length/2;

        Map<Integer,Integer> map = new HashMap<>();
        for(int n:arr){
            map.put(n,map.getOrDefault(n,0)+1);

            if(map.get(n)>needCount) return n;
        }

        return -1;
    }
}
