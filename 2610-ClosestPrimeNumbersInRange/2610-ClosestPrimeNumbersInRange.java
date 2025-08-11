// Last updated: 12/08/2025, 00:11:27
class Solution {
    public int[] closestPrimes(int left, int right) {
        return PrimeSieve(left,right);
    }
    public static int[] PrimeSieve(int left,int right){
        boolean[] ans=new boolean[right+1];
        ans[0]=ans[1]=true;
        for (int i=2;i*i<=ans.length;i++){
            if(ans[i]==false){
                for (int j=2;i*j<ans.length;j++){
                    ans[i*j]=true;
                }
            }
        }
        int[] arr=new int[2];
        List<Integer> ll=new ArrayList<>();
        int c=0;
        for(int i=left;i<ans.length;i++){
            if(ans[i]==false){
                ll.add(i);
                c++;
            }
        }
        if(c<2){
            arr[0]=-1;
            arr[1]=-1;
            return arr;
        }
        int diff=Integer.MAX_VALUE;
        for(int i=0;i<ll.size()-1;i++){
            if(diff>ll.get(i+1)-ll.get(i)){
                arr[0]=ll.get(i);
                arr[1]=ll.get(i+1);
                diff=ll.get(i+1)-ll.get(i);
            }
        }
        return arr;
    }
}