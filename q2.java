import java.util.HashSet;
import java.util.Set;

public class MaxCandies {
    public int maxCandies(int[] candyType) {
        int n = candyType.length;
        int maxCandies = n / 2;
        
        Set<Integer> uniqueCandies = new HashSet<>();
        for (int candy : candyType) {
            uniqueCandies.add(candy);
        }
        
        return Math.min(uniqueCandies.size(), maxCandies);
    }

    public static void main(String[] args) {
        int[] candyType = {1, 1, 2, 2, 3, 3};
        MaxCandies solution = new MaxCandies();
        int maxCount = solution.maxCandies(candyType);
        System.out.println("Maximum number of different candies: " + maxCount);
    }
}
