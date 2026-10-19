class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int p = -1;
        
        // to find the pivot
        
        for (int i=n-1; i>=0; i--){
            if((i-1)<0){
                reverse(nums, 0, n-1);
                return;
            }

            if(nums[i-1]<nums[i]){
                p = i-1;
                break;
            }
        }
        

        // swap the second largest with the pivot
        for(int i=n-1; i>p; i--){
            if(nums[i]> nums[p]){
                swap(nums, p, i);
                break;
            }
        }
        // reverse from p+1 to n-1
        reverse(nums, p+1, n-1);
    
    }

    private static void swap(int[] nums, int i, int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    private static void reverse(int[] nums, int l, int r){
        while(l<r){
            swap(nums, l, r);
            l++;
            r--;
        }
    }
} 