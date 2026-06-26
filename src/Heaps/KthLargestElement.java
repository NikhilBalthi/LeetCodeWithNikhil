package Heaps;

import java.util.PriorityQueue;

public class KthLargestElement {
    public static void main(String[] args) {
        int[] a = new int[]{3,2,1,5,6,4};
        int k = 2;
        int result = kthlargest(a,k);
        System.out.println("result is "+result);
    }

    private static int kthlargest(int[] a,int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int n : a){
            pq.add(n);
            if(pq.size()>k) pq.poll();
        }
        return pq.peek();
    }
}
