class Solution {
    public int majorityElement(int[] nums) {
       int n = nums.length;
       int x = 0;
       int count = 0;
       for(int i=0; i<n; i++){
        if(count==0){
            x=nums[i];
        }
        if(x==nums[i]){
            count++;
        }
        else{
            count--;
        }
       }
       return x;
    }
}