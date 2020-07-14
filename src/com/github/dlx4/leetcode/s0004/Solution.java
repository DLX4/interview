package com.github.dlx4.leetcode.s0004;
//给定两个大小为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。
//
// 请你找出这两个正序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
//
// 你可以假设 nums1 和 nums2 不会同时为空。
//
//
//
// 示例 1:
//
// nums1 = [1, 3]
//nums2 = [2]
//
//则中位数是 2.0
//
//
// 示例 2:
//
// nums1 = [1, 2]
//nums2 = [3, 4]
//
//则中位数是 (2 + 3)/2 = 2.5
//
// Related Topics 数组 二分查找 分治算法


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

    }

    private int findKthValue(int[] nums1, int[] nums2, int k) {

    }


    public static void main(String[] args) {
        int[] num1 = {1, 2, 5};
        int[] num2 = {3, 4};
        System.out.println(new Solution().findMedianSortedArrays(num1, num2));

        /**
         * 从num1 num2中寻找第3小的数
         * 从num1找第（3+1）/2=2小的数，返回2（num1[1]）
         * 从num2找第（3+1）/2=2小的数，返回4(num2[2])
         * 因为4 > 2, 接下来从num2中返回num2[1] = 3
         * */
    }
}
//leetcode submit region end(Prohibit modification and deletion)
