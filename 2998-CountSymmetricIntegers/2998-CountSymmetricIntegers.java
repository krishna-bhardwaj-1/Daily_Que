// Last updated: 12/08/2025, 00:10:47
class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int c=0;
        for(int i=low;i<=high;i++){
            if(symmetric(Integer.toString(i))) c++;
        }
        return c;
    }
    private static boolean symmetric(String s){
        if(s.length()%2!=0) return false;
        int mid=s.length()/2;
        int sum1=0;
        for(int i=0;i<mid;i++){
            sum1+=s.charAt(i)-'0';
        }
        int sum2=0;
        for(int i=mid;i<s.length();i++){
            sum2+=s.charAt(i)-'0';
        }
        return sum1==sum2;
    }
}