// Last updated: 12/08/2025, 00:16:52
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int lo=0;
        int hi=letters.length-1;
        char ans=letters[0];
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(letters[mid]>target){
                ans=letters[mid];
                hi=mid-1;
            }
            else {
                lo=mid+1;
            }
        }
        return ans;
    }
}