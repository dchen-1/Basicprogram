import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class basic{
    public static double findMedian(int[] nums) {
        // Sort the array
        Arrays.sort(nums);

        int n = nums.length;

        // Check if the length of the array is odd or even
        if (n % 2 != 0) {
            // If odd, return the middle element
            return nums[n / 2];
        } else {
            // If even, return the average of the two middle elements
            return (nums[(n - 1) / 2] + nums[n / 2]) / 2.0;
        }
    }

    public static int findMode(int[] nums) {
        // Create a hashmap to store the frequency of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Populate the frequency map
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Initialize variables to keep track of the mode and its frequency
        int mode = Integer.MIN_VALUE;
        int maxFrequency = Integer.MIN_VALUE;

        // Iterate through the frequency map to find the mode
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int currentNum = entry.getKey();
            int currentFrequency = entry.getValue();

            // Update mode and maxFrequency if a higher frequency is found
            if (currentFrequency > maxFrequency) {
                mode = currentNum;
                maxFrequency = currentFrequency;
            }
        }

        return mode;
    }
}