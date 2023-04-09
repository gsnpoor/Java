public class zhweishu {
    public static void main(String[] args) {
        int[] num1 = {1,9};
        int[] num2 = {2,3,4,5,6,7,8};
        System.out.println(findMedianSortedArrays(num1,num2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length + nums2.length;
        int a1 = 0;
        int a2 = 0;
        double num = 0.00000;
        if (nums1[nums1.length-1] < nums2[0]){
            return (double)(nums2[(nums2.length-nums1.length)/2] + nums2[(nums2.length-nums1.length)/2 - 1])/2;
        } else if (nums2[nums2.length-1] < nums1[0]) {
            return (double)(nums1[(nums1.length-nums2.length)/2] + nums1[(nums1.length-nums2.length)/2 - 1])/2;
        }
        if (len % 2 == 1) {
            while ((a1 + a2) < (len / 2 + 1)) {
                if (nums1[a1] < nums2[a2])
                    num = nums1[a1++];
                else
                    num = nums2[a2++];
            }
            return num;
        }
        else {
            boolean flag = false;
            while ((a1 + a2) < (len / 2)) {
                if (nums1[a1] < nums2[a2]){
                    a1++;
                    flag = false;
                }
                else{
                    a2++;
                    flag = true;
                }
            }
            if(flag){
                if(nums2[a2] < nums1[a1])
                    return (double)(nums2[a2] + nums2[a2-1])/2;
                else
                {
                    return (double)(nums1[a1] + nums2[a2-1])/2;
                }
            }
            else{
                if(nums1[a1] < nums2[a2])
                    return (double)(nums1[a1] + nums1[a1-1])/2;
                else
                {
                    return (double)(nums2[a2] + nums1[a1-1])/2;
                }
            }
        }
    }
}
