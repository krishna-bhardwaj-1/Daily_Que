// Last updated: 12/08/2025, 00:20:57
class Solution {
    static int c=1;
    public String getPermutation(int n, int k) {
        c=1;
        String inp=gen(n);
        return(sol(inp,"",k));
    }
    private static String gen(int n){
        StringBuilder sb=new StringBuilder(n);
        for(int i=1;i<=n;i++){
            sb.append(i);
        }
        return sb.toString();
    }
    public static String sol(String inp,String ans,int k){
        if(inp.length()==0){
            if(c==k){
                return ans;
            }
            c++;
            return null;
        }
        for(int i=0;i<inp.length();i++){
            String bachistring=inp.substring(0,i)+inp.substring(i+1);
            char fixedchar=inp.charAt(i);
            String result=sol(bachistring,ans+fixedchar,k);
            if (result != null) {
                return result; 
            }
        }
        return null;
    }
}