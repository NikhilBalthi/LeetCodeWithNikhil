package Arrays;

//2161. Partition Array According to Given Pivot
public class PartitionArrayAccordingToGivenPilot {
    public static void main(String[] args) {
        int[] nums = new int[]{9,12,5,10,14,3,10};
        int[] result = partition(nums,10);
        for(int i : result) {
            System.out.print(i + " ");
        }
    }

    private static int[] partition(int[] nums,int pivot) {
        int index = 0;
        int result[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot) {
                result[index++] = nums[i];
            }
        }
        for(int i=0;i<nums.length;i++) {
            if (nums[i] == pivot) {
                result[index++] = nums[i];
            }
        }
        for(int i=0;i<nums.length;i++) {
            if (nums[i] > pivot) {
                result[index++] = nums[i];
            }
        }
        return result;
    }
}
