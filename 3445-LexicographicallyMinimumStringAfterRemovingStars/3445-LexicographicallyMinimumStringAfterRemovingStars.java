// Last updated: 12/08/2025, 00:10:12
class Solution {
    public String clearStars(String s) {
        char[] arr=s.toCharArray();
        Map<Character,List<Integer>> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='*'){
                for(int j=0;j<26;j++){
                    if(map.getOrDefault((char)(j+97),new ArrayList<>()).size()>0){
                        List<Integer> ll=map.get((char)(j+97));
                        arr[ll.get(ll.size()-1)]='*';
                        ll.remove(ll.size()-1);
                        break;
                    }
                }
            }
            else{
                List<Integer> position=map.getOrDefault(arr[i],new ArrayList<>());
                position.add(i);
                map.put(arr[i],position);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char ch:arr){
            if(ch!='*') sb.append(ch);
        }
        return sb.toString();
    }
}