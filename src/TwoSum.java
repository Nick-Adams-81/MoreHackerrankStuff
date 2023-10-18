import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum1(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap();

        for(int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if(map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            }
                map.put(nums[i], i);

        }

        return new int[]{};
    }

    public int[] twoSum2(int[] nums, int target) {
        int low = 0;
        int high = nums.length -1;
        while(low <= high) {
            int sum = nums[low] + nums[high];
            if(sum > target) {
                high--;
            } else if(sum < target) {
                low++;
            } else {
                return new int[]{low + 1, high + 1};
            }
        }
        return new int[]{low + 1, high + 1};
    }
}
