public class LK_26 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }
        int count = 0;
        int z = 1;
        while (z < nums.length - count) {
            if (nums[z] == nums[z - 1]) {
                nums = move(nums, z, count);
                count++;
            }else {
                z++;
            }
        }
        return z;
    }

    public int[] move(int[] nums, int x, int count) {
        for (int i = x; i < nums.length - 1 - count; i++) {
            nums[i] = nums[i + 1];
        }
        return nums;
    }
}
