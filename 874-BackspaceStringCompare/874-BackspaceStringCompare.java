// Last updated: 12/08/2025, 00:16:33
class Solution {
    public boolean backspaceCompare(String s, String t) {
        return(helper(s,t));
    }
    private static boolean helper(String s,String t){
        Stack<Character> st1=new Stack<>();
        Stack<Character> st2=new Stack<>();
        for (char ch : s.toCharArray()) {
        if (ch == '#') {
            if (!st1.isEmpty()) st1.pop();
        } else {
            st1.push(ch);
        }
        }

        for (char ch : t.toCharArray()) {
            if (ch == '#') {
                if (!st2.isEmpty()) st2.pop();
            } else {
                st2.push(ch);
            }
        }
        while (!st1.isEmpty() && !st2.isEmpty()){
            if(st1.pop()!=st2.pop()){
                return false;
            }
        }
        if(!st1.isEmpty()||!st2.isEmpty()){
            return false;
        }
        return true;
    }
}