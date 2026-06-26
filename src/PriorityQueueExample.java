import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(40);
        pq.add(10);
        pq.add(30);
        pq.add(20);

        System.out.println("Priority Queue Elements:");
        System.out.println(pq);

        System.out.println("\nRemoving elements based on priority:");

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
        int[] arr = new int[]{1, 1, 2, 1, 3, 5, 1};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n:arr){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        //Map.Entry<>
    }
}