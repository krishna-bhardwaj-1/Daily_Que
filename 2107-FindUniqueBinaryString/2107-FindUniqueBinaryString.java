// Last updated: 12/08/2025, 00:13:11
class Solution {
    public String findDifferentBinaryString(String[] nums) {
        Set<String> set=new HashSet<>();
        for(String s:nums){
            set.add(s);
        }
        return generate("",nums.length,set);
    }
    private static String generate(String ans,int len,Set<String> set){
        if(ans.length()==len){
            if(!set.contains(ans)){
                return ans;
            }
            return "";
        }
        String ok=generate(ans+"0",len,set);
        if(ok.length()>0){
            return ok;
        }
        return generate(ans+"1",len,set);

    }
}