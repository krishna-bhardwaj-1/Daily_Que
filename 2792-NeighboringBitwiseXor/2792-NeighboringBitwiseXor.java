// Last updated: 12/08/2025, 00:11:03
class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int inxor=0;
        for(int i:derived){
            inxor^=i;
        }
        return inxor==0;
    }
}