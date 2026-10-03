class Solution {
    public boolean isMonotonic(int[] nums) {
        if(nums.length == 1){
            return true;
        }
        boolean inc = false;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] <= nums[i+1]){
                inc = true;   
            }else{
                inc = false;
                break;
            }
        }

        boolean dec = false;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] >= nums[i+1]){
                dec = true;
            }else{
                dec = false;
                break;
            }
        }

        if(inc == true || dec == true){
            return true;
        }else{
            return false;
        }
    }
}