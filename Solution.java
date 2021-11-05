//Justin Butler
// 11/4/2021
// Greedy Algorithm approach
class Solution {
    public int jump(int[] nums) 
    {
        int jumpCount = 0;
        int left = 0;
        int right = 0;
        while(right < nums.length-1)
        {
            int maxDistance = 0;
            for(int i = left; i < right+1; i++)
            {
                maxDistance = Math.max(maxDistance, nums[i]+i);
            }
            left = right+1;
            right = maxDistance;
            jumpCount++;
        }
        return jumpCount;
    }
}
