class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> res = new LinkedHashSet<>();
        Set<Integer> set1 = new HashSet<>();
        
        for (int num : nums1) { set1.add(num); }

        for (int num : nums2) { if (set1.contains(num)) { res.add(num); } }
        
        int[] result = new int[res.size()];
        int index = 0;
        for (int num : res) { result[index++] = num; }
        
        return result;
    }
}
