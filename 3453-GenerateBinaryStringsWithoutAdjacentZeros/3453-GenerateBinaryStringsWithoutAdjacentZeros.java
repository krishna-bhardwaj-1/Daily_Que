// Last updated: 12/08/2025, 00:10:08
class Solution {
    public List<String> validStrings(int n) {
        List<String> ll=new ArrayList<>();
        sol(n,"",ll,n,0);
        return ll;
    }
    private static void sol(int n,String ans,List<String> ll,int len,int pointer){
        if(ans.length()==len){
            ll.add(ans);
            return;
        }
        if(pointer==0){
            pointer=1;
            sol(n-1,ans+"0",ll,len,pointer);
        }
        pointer=0;
        sol(n-1,ans+"1",ll,len,pointer);
    }
}