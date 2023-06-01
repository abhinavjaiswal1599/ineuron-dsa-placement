public class ArrayPairSum {
    public int arrayPairSum(int[] nums) {
        int[] count = new int[20001];
        
        for (int num : nums) {
            count[num + 10000]++;
        }
        
        int sum = 0;
        boolean isOdd = true; 
                for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                if (isOdd) {
                    // Add the current number to the sum
                    sum += (i - 10000);
                }
                
                isOdd = !isOdd;
                
                count[i]--;
            }
        }
        
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 2};
        ArrayPairSum solution = new ArrayPairSum();
        int maxSum = solution.arrayPairSum(nums);
        System.out.println("Maximized sum: " + maxSum);
    }
}
