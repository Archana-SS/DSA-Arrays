//If array contains equal number of positive and negative numbers
class Solution {
    public int[] rearrange(ArrayList<Integer> arr) {
        int n=arr.size();
        int posIdx=0,negIdx=1;
        int ans[]=new int[n];
        int ans[]
        for(int i=0;i<n;i++){
          if(arr.get(i)>0){
            ans[posIdx]=arr.get(i);
            posIdx+=2;
          }
          else{
            ans[negIdx]=arr.get(i);
            negIdx+=2;
          }
        }
        return ans;
    }
}
