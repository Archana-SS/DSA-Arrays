class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        int n1=a.length;
        int n2=b.length;
        ArrayList<Integer> union=new ArrayList<>();
        int i=0,j=0;
        
        while(i<n1 && j<n2){
            if(a[i]<=b[j]){
                if(union.isEmpty() || union.get(union.size()-1)!=a[i])
                    union.add(a[i]);
                i++;
            }
            else{
                if(union.isEmpty() || union.get(union.size()-1)!=b[j])
                    union.add(b[j]);
                j++;
            }
        }
        while(i<n1){
            if(union.isEmpty() || union.get(union.size()-1)!=a[i])
                union.add(a[i]);
            i++;
        }
        while(j<n2){
            if(union.isEmpty() || union.get(union.size()-1)!=b[j])
                union.add(b[j]);
            j++;
        }
        return union; // (or) int ans[]=union.stream().mapToInt(k->k).toArray() and then finally return ans;
    }
}
