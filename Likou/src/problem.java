public class problem {
    public static void main(String[] args) {
        String[] strs = {"flow", "flow"};
        int[] nums = {1,3,5,6};
        int target = 7;
        System.out.println(binarySearch(nums, target));
        //System.out.println(pd("flo","flight"));
    }

    public static String longestCommonPrefix(String[] strs) {
        int min1 = 0;
        for (String str : strs) {
            min1 = Math.max(str.length(), min1);
        }
        String ss = strs[0];
        for (int i = 1; i < strs.length; i++) {
            ss = pd(ss, strs[i]);
        }
        return ss;
    }

    public static String pd(String s1, String s2) {
        int min = Math.min(s1.length(), s2.length());
        String ss = "";
        for (int i = 0; i < min; i++) {
            if (s1.charAt(i) != s2.charAt(i))
                return ss;
            ss = ss + s1.charAt(i);
        }
        return ss;
    }

    public static int searchInsert(int[] nums, int target) {
        int len = nums.length;
        if (nums[len - 1] < target) {
            return len;
        }
        return binarySearch(nums,target);
    }
    public static int binarySearch(int[] arr, int number) {
        int min = 0;
        int max = arr.length;
        while (min < max) {
            int mid = (min + max) / 2;
            if (arr[mid] < number) {
                min = mid + 1;
            } else if (arr[mid] > number) {
                max = mid;
            } else {
                return mid;
            }
        }
        return max;
    }

}
