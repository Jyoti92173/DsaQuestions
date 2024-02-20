import java.util.*;

class Duplicate {
    /**
     * @param nums
     * @return
     */
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i <= nums.length; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        Duplicate cd = new Duplicate();
        int nums[] = { 1, 2, 1, 3 };
        boolean ans = cd.containsDuplicate(nums);
        System.out.println(ans);
    }
}
