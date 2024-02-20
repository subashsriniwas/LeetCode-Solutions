class Solution {
    public void rotate(int[] nums, int k) {  //3
       int temp[] = new int[nums.length];
       k = k % nums.length; // 3%7 = 3 // also to handle case k is within the range of 0 to n-1 to handle cases where k > n

       for (int i=0; i<nums.length; i++) {
           temp[(k + i) % nums.length] =  nums[i];  // (3+0) % 7 = 3 so index[0] ie. 1 will place in 3rd position..
       }

       for (int i=0; i<nums.length; i++) {
           nums[i] = temp[i];
       }
    }
}