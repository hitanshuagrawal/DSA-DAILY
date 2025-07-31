class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int x=0;
        for(int i=0; i<n; i++){
            if(nums[i]!=0){
                arr[x]=nums[i];
                x++;
            }
        }
        for(int i=x+1; i<n; i++){
            arr[i]=0;
        }
        for(int i=0; i<n; i++){
            nums[i]=arr[i];
        }
    }
}