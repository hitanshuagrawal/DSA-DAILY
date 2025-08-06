class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] arrP = new int[n];
        int[] arrN = new int[n];
        int j = 0;
        int k = 0;
        for(int i=0; i<n; i++){
            if(nums[i]>0){
                arrP[j] = nums[i];
                j++;
            }
            else{
                arrN[k] = nums[i];
                k++;
            }
        }
        int x = 0;
        for(int i=0; i<j; i++){
            nums[x] = arrP[i];
            x=x+2;
        }
        int y = 1;
        for(int i=0; i<k; i++){
            nums[y] = arrN[i];
            y=y+2;
        }
        return nums;
    }
}