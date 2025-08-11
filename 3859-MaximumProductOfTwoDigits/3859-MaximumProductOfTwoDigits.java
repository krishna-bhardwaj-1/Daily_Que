// Last updated: 12/08/2025, 00:09:04
class Solution {
    public int maxProduct(int n) {
        int c=0;
        char[] arr=(Integer.toString(n)).toCharArray();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                c=Math.max(c,(arr[i]-'0')*(arr[j]-'0'));
            }
        }
        return c;
    }
}