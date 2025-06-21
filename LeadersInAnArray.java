//Given a sequence of numbers. Find all leaders in sequence. An element is a leader if it is strictly greater than all the elements on its right side.
//Note:
//1. Rightmost element is always a leader.
//2. The order of elements in the return sequence must be the same as the given sequence

import java.util.* ;
import java.io.*; 
public class Solution {
	public static ArrayList<Integer> findLeaders(int arr[], int n) {
		ArrayList<Integer> ans=new ArrayList<>();
    int max=arr[n-1];
    ans.add(max);
    for(int i=n-2;i>=0;i--){
      if(arr[i]>max){
        max=arr[i];
        ans.add(arr[i]);
      }
    }
    Collections.reverse(ans);
    return ans;
	}
}
