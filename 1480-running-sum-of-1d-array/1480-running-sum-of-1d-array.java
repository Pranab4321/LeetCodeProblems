class Solution {
    public int[] runningSum(int[] nums) {
        int[] newArr = new int[nums.length];
        
        for(int i=0; i<nums.length; i++){
            int sum =0;
            int en = i;
            for(int st=0; st<=en; st++){
                sum += nums[st];
            }
            newArr[i] = sum;
        }

        return newArr;
    }
}