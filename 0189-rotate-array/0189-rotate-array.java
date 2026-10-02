class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;

        rotate(nums, 0, n-1);
        rotate(nums, 0, k-1);
        rotate(nums, k, n-1);

    }

    public static void rotate(int[] nums, int s, int e){
        while(s<e){
            int t = nums[s];
            nums[s] = nums[e];
            nums[e] = t;
            s++;
            e--;
        }
    }
}