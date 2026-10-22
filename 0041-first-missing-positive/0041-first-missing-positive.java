class Solution {
    public int firstMissingPositive(int[] arr) {
        int n = arr.length;
        
        int i = 0;
        while(i<n){
            int correctIndex = arr[i]-1;
            if(arr[i]>0 && arr[i]<=n && arr[i] != arr[correctIndex]){
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }else{
                i++;
            }
        }

        for(int k=0; k<n; k++){
            if(arr[k] != k+1){
                return k+1;
            }
        }

        return n+1;
    }
}