// Last updated: 12/08/2025, 00:13:44
class Solution {
    public int[] minOperations(String boxes) {
        int[] arr=new int[boxes.length()];
        int i=0;
        while(i<boxes.length()){
            int c=0;
            for(int j=0;j<boxes.length();j++){
                if(boxes.charAt(j)=='1'){
                    c+=Math.abs(i-j);
                }
            }
            arr[i]=c;
            i++;
        }
        return arr;
    }
}