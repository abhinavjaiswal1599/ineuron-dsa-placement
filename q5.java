public class MaximumProduct {
    public int maximumProduct(int[] nums) {
        int maxProduct = Integer.MIN_VALUE;
        
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int product = nums[i] * nums[j] * nums[k];
                    maxProduct = Math.max(maxProduct, product);
                }
            }
        }
        
        return maxProduct;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        MaximumProduct solution = new MaximumProduct();
        int maxProduct = solution.maximumProduct(nums);
        System.out.println("Maximum product: " + maxProduct);
    }
}
