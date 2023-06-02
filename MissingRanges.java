import java.util.ArrayList;
import java.util.List;

public class MissingRanges {
    public static List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> ranges = new ArrayList<>();

        long next = lower;

        for (int num : nums) {
            if (num > next) {
                ranges.add(getRange(next, num - 1));
            }
            next = (long) num + 1;
        }

        if (next <= upper) {
            ranges.add(getRange(next, upper));
        }

        return ranges;
    }

    private static String getRange(long start, long end) {
        return start == end ? String.valueOf(start) : start + "->" + end;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 3, 50, 75};
        int lower = 0;
        int upper = 99;
        List<String> result = findMissingRanges(nums, lower, upper);
        System.out.println(result);
    }
}
