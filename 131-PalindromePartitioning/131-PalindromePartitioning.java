// Last updated: 12/08/2025, 00:19:55
class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        List<String> ll=new ArrayList<>();
        sol(s,ll,ans);
        return ans;
    }
    private static void sol(String s,List<String> ll,List<List<String>> ans){
        if(s.length()==0){
            ans.add(new ArrayList<>(ll));
            return;
        }
        for(int cut=1;cut<=s.length();cut++){
            String st=s.substring(0,cut);
            if(palindrome(st)){
                ll.add(st);
                sol(s.substring(cut),ll,ans);
                ll.remove(ll.size()-1);
            }
        }
    }
    private static boolean palindrome(String s){
        int i=0,j=s.length()-1;
        while (i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}