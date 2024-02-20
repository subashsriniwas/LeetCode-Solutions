class Solution {
    public int maxArea(int[] height) {
        int water = 0;
        int left = 0;
        int right = height.length-1;

        while (left < right) {

            // water = max(water, current water); current water = height * length;
            // heigth = min(heigth[left], heigth[right]); length = rigth - left;
            
            water = Math.max(water, Math.min(height[left], height[right]) * (right - left));
            if (height[left] > height[right]) {
                right--;
            }
            else {
                left++;
            }
        }
        return water;
    }
}