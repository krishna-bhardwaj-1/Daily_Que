// Last updated: 12/08/2025, 00:11:05
class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        Set<Integer> set=new HashSet<>();
        int[] arr=new int[A.length];
        int size=2;
        int i=0,j=0;
        while(i<A.length){
            set.add(A[i]);
            set.add(B[j++]);
            arr[i++]=size-set.size();
            size+=2;
        }
        return arr;
    }
}