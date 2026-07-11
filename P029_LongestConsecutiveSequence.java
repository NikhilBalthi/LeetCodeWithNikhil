import java.util.HashSet;

public class P029_LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr = new int[]{0,3,7,2,5,8,4,6,0,1};

        System.out.println(longestConsecutiveSequence(arr));
    }

    private static int longestConsecutiveSequence(int[] arr){
        HashSet<Integer> present = new HashSet<>();

        for(int num : arr){
            present.add(num);
        }

        int longestConsecutiveChain = 0;

        for(int num: present){
            if(!present.contains(num-1)) {
                int currentChain = 1;
                int start = num;

                while (present.contains(start + 1)) {
                    currentChain += 1;
                    start += 1;
                }
                longestConsecutiveChain = Math.max(longestConsecutiveChain, currentChain);
            }
        }
        return longestConsecutiveChain;
    }
}
