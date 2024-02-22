import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = Arrays.copyOf(nums1, nums1.length + nums2.length);
        System.arraycopy(nums2, 0, merged, nums1.length, nums2.length);
        Arrays.sort(merged);
        int mid = merged.length / 2;
        return merged.length % 2 == 0 ? (merged[mid - 1] + merged[mid]) / 2.0 : merged[mid];
    }
}
