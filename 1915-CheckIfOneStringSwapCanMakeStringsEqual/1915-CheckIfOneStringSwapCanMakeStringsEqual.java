// Last updated: 12/08/2025, 00:13:42
class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int c=0;
        int[] arr=new int[2];
        int curr=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                c++;
                if(c>2){
                    return false;
                }
                arr[curr]=i;
                curr++;
            }
        }
        if(s1.charAt(arr[0])!=s2.charAt(arr[1])){
            return false;
        }

        if(s1.charAt(arr[1])!=s2.charAt(arr[0])){
            return false;
        }
        return true;
    }
}