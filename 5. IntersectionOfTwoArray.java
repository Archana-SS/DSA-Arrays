class Solution {
    static ArrayList<Integer> intersection(int arr1[], int arr2[]) {
        int n1=arr1.length;
        int n2=arr2.length;
        int i=0,j=0;
        ArrayList<Integer> intersection=new ArrayList<>();
        while(i<n1 && j<n2){
          if(arr1[i]<arr2[j])
            i++;
          else if(arr2[j]<arr1[i])
            j++;
          else{
            if(intersection.isEmpty() || intersection.get(intersection.size()-1)!=arr1[i])
              intersection.add(arr1[i]);
            i++;
            j++;
          }
        }
        return intersection // (or) int ans[]=intersection.stream().mapToInt(k->k).toArray(); return ans
    }
}
