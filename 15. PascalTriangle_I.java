//Given two integers r and c, return the value at the rth row and cth column (1-indexed) in a Pascal's Triangle.
class Solution {
    public int pascalTriangleI(int r, int c) {
        return NCR(r-1,c-1);
    }

    private int NCR(int n,int r){
      if(r>n-r)
        r=n-r;

      if(r==1)
        return n;

      int res=1;

      for(int i=0;i<r;i++){
        res=res*(n-i);
        res=res/(i+1);
      }
      return res;
    }
}
