// Last updated: 12/08/2025, 00:15:38
class Solution {
    public String defangIPaddr(String address) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<address.length();i++){
            if(address.charAt(i)=='.'){
                sb.append('[');
                sb.append(address.charAt(i));
                sb.append(']');
            }
            else{
                sb.append(address.charAt(i));
            }
        }
        return sb.toString();
    }
}