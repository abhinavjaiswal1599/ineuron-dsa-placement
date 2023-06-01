import java.util.HashMap;
import java.util.Map;

public class LongestHarmoniousSubsequence {
    public int findLHS(int[] nums) {
        int longestSubsequenceLength = 0;

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            boolean found = false;
            
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == nums[i]) {
                    count++;
                } else if (nums[j] == nums[i] + 1) {
                    count++;
                    found = true;
                }
            }
            
            if (found) {
                longestSubsequenceLength = Math.max(longestSubsequenceLength, count);
            }
        }
        
        return longestSubsequenceLength;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};
        LongestHarmoniousSubsequence solution = new LongestHarmoniousSubsequence();
        int longestSubsequenceLength = solution.findLHS(nums);
        System.out.println("Longest harmonious subsequence length: " + longestSubsequenceLength);
    }
}
