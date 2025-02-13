import java.util.Arrays;

public class MoveZeros {
    public static void moveZeros(int[] nums) {
        int index = 0;
        
        for (int num : nums) {
            if (num != 0) {
                nums[index++] = num;
            }
        }
        
        while (index < nums.length) {
            nums[index++] = 0;
        }
    }
    
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeros(nums);
        System.out.println("Output: " + Arrays.toString(nums));
    }
}
