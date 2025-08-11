// Last updated: 12/08/2025, 00:16:07
class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3) return false;
        int p=0;
        for(int i=1;i<arr.length-1;i++){
            int pre=arr[i-1];
            int cur=arr[i];
            int next=arr[i+1];
            if(pre==cur|| cur==next||(pre>cur && cur<next)){
                return false;
            }
            if(pre<cur && cur>next){
                p++;
                if(p>1){
                    return false;
                }
            }
        }
        return p==1;
    }
}