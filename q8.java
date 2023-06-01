public class MinScoreArray {
    public int minScore(int[] nums, int k) {
        int minScore = Integer.MAX_VALUE;
        
        for (int i = 0; i < nums.length; i++) {
            for (int x = -k; x <= k; x++) {
                nums[i] += x;
                int min = Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;
                
                for (int num : nums) {
                    min = Math.min(min, num);
                    max = Math.max(max, num);
                }
                
                minScore = Math.min(minScore, max - min);
                
                nums[i] -= x;
            }
        }
        
        return minScore;
    }

    public static void main(String[] args) {
        int[] nums = {1};
        int k = 0;
        MinScoreArray solution = new MinScoreArray();
        int minScore = solution.minScore(nums, k);
        System.out.println("Minimum score: " + minScore);
    }
}
