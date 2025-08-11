// Last updated: 12/08/2025, 00:12:35
class Solution {
    public String[] divideString(String s, int k, char fill) {
        String[] arr=new String[(int)Math.ceil((double)s.length()/k)];
        int idx=0;
        for(int i=0;i<arr.length;i++){
            if((idx+k)>=s.length()){
                StringBuilder sb=new StringBuilder();
                while(idx<s.length()){
                    sb.append(s.charAt(idx++));
                }
                while(sb.length()<k){
                    sb.append(fill);
                }
                arr[i]=sb.toString();
            }
            else arr[i]=s.substring(idx,idx+k);
            idx+=k;
        }
        return arr;
    }
}