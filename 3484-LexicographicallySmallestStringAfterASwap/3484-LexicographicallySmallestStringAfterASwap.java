// Last updated: 12/08/2025, 00:10:01
class Solution {
    public String getSmallestString(String s) {
        char[] arr=s.toCharArray();
        for(int i=1;i<arr.length;i++){
            int b=s.charAt(i)-'0';
            int a=s.charAt(i-1)-'0';
            if(a>b && a%2==b%2){
                char temp=arr[i];
                arr[i]=arr[i-1];
                arr[i-1]=temp;
                break;
            }
        }
        return new String(arr);
    }
}