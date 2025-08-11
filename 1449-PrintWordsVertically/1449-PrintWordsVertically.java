// Last updated: 12/08/2025, 00:15:03
class Solution {
    public List<String> printVertically(String s) {
        List<String> ll=new ArrayList<>();
        String[] arr=s.split(" +");
        int heightest=0;
        for(String word:arr){
            heightest=Math.max(word.length(),heightest);
        }
        StringBuilder sb=new StringBuilder();
        int c=0;
        for(int i=0;i<heightest;i++){
            for (String word : arr) {
                if (word.length()>c) {
                    sb.append(word.charAt(c));
                }
                else{
                    sb.append(" ");
                }
            }
            c++;
            // String kuchbhi=sb.toString();
            // int len = kuchbhi.length() - 1;
            // while (len >= 0 && Character.isWhitespace(kuchbhi.charAt(len))) {
            //     len--;
            // }
            // ll.add(kuchbhi.substring(0,len+1));
            ll.add(sb.toString().stripTrailing());
            sb.setLength(0);
        }
        return ll;
    }
}