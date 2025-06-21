class Solution {
    public int secondLargestElement(int[] nums) {
        int max=Integer.MIN_VALUE;
        int secMax=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                secMax=max;
                max=nums[i];
            }
            else if(nums[i]>secMax && nums[i]!=max)
                secMax=nums[i];
        }
        return secMax==Integer.MIN_VALUE? -1 : secMax;
    }
}
