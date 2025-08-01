class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] arr = new int[2];
        for(int j=0; j<n; j++){
            for(int i=j+1; i<n; i++){
                if(target == nums[i]+nums[j]){
                    arr[0]=i;
                    arr[1]=j;
                }
            }        
        }
        return arr;
    }
}