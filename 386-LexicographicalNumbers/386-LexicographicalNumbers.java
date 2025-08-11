// Last updated: 12/08/2025, 00:18:12
class Solution {
    static List<Integer> ll;
    public List<Integer> lexicalOrder(int n) {
        ll=new ArrayList<>();
        helper(0,n);
        return ll;
    }
    private void helper(int st,int end){
        if(st>end){
            return;
        }
        if(st!=0) ll.add(st);
        int i=0;
        if(st==0){
            i=1;
        }
        for(;i<10;i++){
            helper(st*10+i,end);
        }
    }
}