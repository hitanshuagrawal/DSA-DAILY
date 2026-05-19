class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];

        left[0]=0;
        for(int i=0; i<nums.length-1; i++){
            left[i+1] = left[i] + nums[i];
        }

        right[nums.length-1]=0;
        for(int j=nums.length-2; j>=0; j--){
            right[j] = right[j+1] + nums[j+1];
        }

        for(int k=0; k<nums.length; k++){
            nums[k] = Math.abs(left[k]-right[k]);
        }
        return nums;
    }
}