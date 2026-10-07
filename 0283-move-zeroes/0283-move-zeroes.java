class Solution {
    public void moveZeroes(int[] nums) {

        int insertPos = 0;

        for(int i=0; i<nums.length; i++){
            if(nums.length == 1){
                    nums[insertPos] = nums[i];
            }


            if(nums[i] != 0){
                int t = nums[insertPos];
                nums[insertPos] = nums[i];
                nums[i] = t;
                insertPos++;
            }
        }
        
    }
}