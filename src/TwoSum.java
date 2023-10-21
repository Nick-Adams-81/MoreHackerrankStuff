import java.util.*;

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

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> output = new LinkedList<>();
        for(int i = 0; i < nums.length -2; i++) {
            if(i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                int low = i + 1;
                int high = nums.length -1;
                int sum = 0 - nums[i];

                while(low < high) {
                    if(nums[low] + nums[high] == sum) {
                        output.add(Arrays.asList(nums[i], nums[low], nums[high]));
                        while(low < high && nums[low] == nums[low + 1]) low++;
                        while(low < high && nums[high] == nums[high - 1]) high--;
                        low++;
                        high--;
                    } else if(nums[low] + nums[high] > sum) {
                        high--;
                    } else {
                        low++;
                    }
                }

            }
        }
        return output;
    }
}
