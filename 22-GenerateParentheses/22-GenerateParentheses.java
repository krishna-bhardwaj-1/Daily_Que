// Last updated: 12/08/2025, 00:21:41
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result=new ArrayList<>();
        genpar("",n,0,0,result);
        return result;
    }
    private void genpar(String ans,int n,int oc,int cc,List<String> result){
        if(oc==n && cc==n){
            result.add(ans);
            return;
        }
        if(oc<n){
            genpar(ans+"(",n,oc+1,cc,result);
        }
        if(oc>cc){
            genpar(ans+")",n,oc,cc+1,result);
        }
    }
}