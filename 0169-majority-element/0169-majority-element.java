class Solution {
    public int majorityElement(int[] nums) {
        // int cand = 0;
        // int count = 0;

        // for(int n : nums){
        //     if(count==0){
        //         cand=n;
        //     }
        //     if(n==cand){
        //         count++;
        //     }
        // }
        //     return cand;
        int n = nums.length;
        Arrays.sort(nums);
        return nums[n/2];

    }
}