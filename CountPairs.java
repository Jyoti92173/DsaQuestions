import java.util.List;
import java.util.ArrayList; // Import ArrayList if not already imported

public class CountPairs {
    public static void main(String[] args) {
        CountPairs cp = new CountPairs();
        List<Integer> nums = new ArrayList<>(); // Create a new ArrayList
        nums.add(-1);
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(1);
        int target = 2;
        int res = cp.countPairs(nums, target); // Call countPairs with correct parameters
        System.out.println(res);
    }

    public int countPairs(List<Integer> nums, int target) {
        int count = 0;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(i) + nums.get(j) == target) { // Changed the condition to match your requirement
                    count++;
                }
            }
        }
        return count;
    }
}
