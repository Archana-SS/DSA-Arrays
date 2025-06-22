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

//If number of positives and negatives are unequal in an array

class Solution {
    void rearrange(ArrayList<Integer> arr) {
        int N=arr.size();
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();

        for(int i=0;i<N;i++){
            if(arr.get(i)>=0)
                pos.add(arr.get(i));
            else
                neg.add(arr.get(i));
        }

        int p=0,n=0,i=0;

        while(p<pos.size() && n<neg.size()){
            arr.set(i++,pos.get(p++));
            arr.set(i++,neg.get(n++));
        }

        while(p<pos.size()){
            arr.set(i++,pos.get(p++));
        }

        while(n<neg.size()){
            arr.set(i++,neg.get(n++));
        }
    }
}
