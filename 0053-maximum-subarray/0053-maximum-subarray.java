// Important //

class Solution {
    public int maxSubArray(int[] nums) {
        int bestans=nums[0];
        int ans=nums[0];

        for(int a=1;a<nums.length;a++){
            int v1 = nums[a];
            int v2 = nums[a]+ bestans;

            bestans = Math.max(v1,v2);

            ans = Math.max(bestans,ans);
        }
        return ans;

        
    }
}