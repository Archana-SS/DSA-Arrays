class Solution {
    public void rotateArrayByOne(int[] nums) {
        int temp=nums[0];
        int n=nums.length;
        for(int i=1;i<n;i++){
            nums[i-1]=nums[i];
        }
        nums[n-1]=temp;
    }
}
