// Last updated: 12/08/2025, 00:21:47
class Solution {
    static String[] mapping={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0){
            return new ArrayList<>();
        }
        ArrayList<String> res=new ArrayList<>();
            helper(digits,"",res);
            return res;
    }
    private void helper(String digits,String comb,List<String> res){
        if(digits.length()==0){
            res.add(comb);
            System.out.println(comb);
            return;
        }
        char digitpressed=digits.charAt(0);
        int index=digitpressed-'0';

        String mappedString=mapping[index];
        System.out.println(mappedString);

        for(int i=0;i<mappedString.length();i++){
            String bachiString=digits.substring(1);
            char choice = mappedString.charAt(i);
            helper(bachiString,comb+choice,res);
        }
    }
}