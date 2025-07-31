class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum=0;
        int num=0;
        for(int i=0; i<n; i++){
            sum = sum + nums[i];
        }
        int sumReal= (n*(n+1))/2;
        num = sumReal - sum;
        return num;
    }
}