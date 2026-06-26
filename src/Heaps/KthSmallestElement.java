package Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElement {
    public static void main(String[] args) {
        int[] a = new int[]{3,2,1,5,6,4,-1};
        int k = 2;
        int result = kthsmallest(a,k);
        System.out.println("result is "+result);
    }

    private static int kthsmallest(int[] a,int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int n : a){
            pq.add(n);
            if(pq.size()>k) pq.poll();
        }
        return pq.peek();
    }
}
