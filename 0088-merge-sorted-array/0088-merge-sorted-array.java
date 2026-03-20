class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }

        boolean swapped;
        for (int i = 0; i < m + n - 1; i++) {
            swapped = false;
            for (int j = 0; j < m + n - i - 1; j++) {
                if (nums1[j] > nums1[j + 1]) {
                    int temp = nums1[j];
                    nums1[j] = nums1[j + 1];
                    nums1[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break; 
        }
    }
}