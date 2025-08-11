// Last updated: 12/08/2025, 00:09:22
class Solution {
    public int maxDifference(String s) {
        int[] fre=new int[26];
        for(char ch:s.toCharArray()){
            fre[ch-'a']++;
        }
        int oddmax=0;
        int oddmin=Integer.MAX_VALUE;
        int evenmax=0;
        int evenmin=Integer.MAX_VALUE;
        for(int i:fre){
            if(i>0){
                if(i%2!=0){
                    //odd
                    oddmax=Math.max(oddmax,i);
                    oddmin=Math.min(oddmin,i);
                }
                else{
                    evenmax=Math.max(evenmax,i);
                    evenmin=Math.min(evenmin,i);
                }
            }
        }

        return Math.max(oddmax-evenmin,oddmin-evenmax);
    }
}