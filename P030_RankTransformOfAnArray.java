import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

    public class P030_RankTransformOfAnArray {
        public static void main(String[] args) {
            int[] arr = new int[]{40,10,20,30};

            int[] res = (rankTransform(arr));

            for (int num: res){
                System.out.print(num+ " ");
            }

        }

        private static int[] rankTransform(int[] arr) {

            Set<Integer> treeSet = new TreeSet<>();
            int n = arr.length;
            int[] res = new int[n];

            Map<Integer,Integer> map = new HashMap<>();

            for(int num : arr){
                treeSet.add(num);
            }

            int rank = 1;
            for(int num:treeSet){
                map.put(num,rank++);
            }

            for(int i=0; i<n;i++){
                res[i] = map.get(arr[i]);
            }

            return res;

        }
    }

