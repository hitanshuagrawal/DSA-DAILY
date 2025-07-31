class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int count=0;
        int[] arr = new int[n+n];
        for(int i=0; i<n; i++){
            if(nums[i]==1){
                count ++;
            }
            if(nums[i]==0){
                arr[i]=count;
                count = 0;
            }
        }
         if (nums[n - 1] == 1) {
            arr[n - 1] = count;
        }
        int temp=0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]>temp){
                temp = arr[i];
            }
        }
        return temp;
    }
}