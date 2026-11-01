import java.util.Arrays;

class Solution {
    public int minMoves(int[] nums) {
        long sum = Arrays.stream(nums).asLongStream().sum();
        int min = Arrays.stream(nums).min().getAsInt();

        return (int) (sum - (long) min * nums.length);
    }
}
