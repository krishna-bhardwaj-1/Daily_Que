// Last updated: 12/08/2025, 00:16:57
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ll=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(shihai(i)) ll.add(i);
        }
        return ll;
    }
    private boolean shihai(int n){
        int c=n;
        while(c>0){
            if(c%10==0 || n%(c%10)!=0){
                return false;
            }
            c/=10;
        }
        return true;
    }
}