public class LK_26 {
    public static void main(String[] args) {
        int[] nums = {
                -1, -1, -1, -1, -1, 2
        };
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int len = nums.length;
        if (len <= 1) {
            return len;
        }
        int z = nums[0] - 1;
        int count = 0;
        int x = 1;
        while (x < len) {
            if (nums[count] == nums[x]) {
                nums[x] = z;
            } else {
                count++;
                x = count;
            }
            x++;
        }
        for (int num : nums) {
            System.out.print(num + ",");
        }
        System.out.println();

        int c = len;
        for (int i = 0; i < c; ) {
            if (nums[i] == z) {
                int j = i + 1;
                while (j < len) {
                    if (nums[j] == z) {
                        j++;
                    } else {
                        c = len + i - j;
                        break;
                    }
                }
                if (j == len) {
                    return i;
                }
                for (int k = i; k < c; k++) {
                    nums[k] = nums[j];
                }
            } else {
                i++;
            }
        }
        return c;
    }
}
