class Solution {
    public int maxProfit(int[] nums) {
        int n = nums.length;
        int profit = 0;
        int minP = nums[0];
            for(int i=0; i<n; i++){
                if(minP>nums[i]){
                minP=nums[i];
                }
                if(profit<=nums[i]-minP){
                    profit = nums[i]-minP;
                }
        }
        return profit;
    }
}