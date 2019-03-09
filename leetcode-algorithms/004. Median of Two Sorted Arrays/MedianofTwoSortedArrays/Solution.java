package MedianofTwoSortedArrays;

/**
 * @author Jiacheng Huang
 * @date 2019/03/09 16:28
 */
public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length + nums2.length];
        int p1 = 0;
        int p2 = 0;
        for (int i = 0; i < nums.length; i++) {

            if (p1 < nums1.length && p2 < nums2.length) {
                if (nums1[p1] < nums2[p2]) {
                    nums[i] = nums1[p1];
                    p1++;
                } else {
                    nums[i] = nums2[p2];
                    p2++;
                }
                continue;
            }

            if (p1 < nums1.length && p2 >= nums2.length) {
                nums[i] = nums1[p1];
                p1++;
                continue;
            }

            if (p1 >= nums1.length && p2 < nums2.length) {
                nums[i] = nums2[p2];
                p2++;
                continue;
            }


        }
        if (nums.length % 2 == 0) {
            return dividedBy2(nums[nums.length / 2] + nums[nums.length / 2 - 1]);
        } else {
            return nums[nums.length / 2];
        }
    }

    private double dividedBy2(int num) {
        double result;
        if (num % 2 == 0) {
            result = num / 2;
        } else {
            result = num / 2 + 0.5;
        }
        return result;
    }
}
