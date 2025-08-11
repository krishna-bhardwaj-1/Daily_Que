// Last updated: 12/08/2025, 00:15:19
class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        List<String> ans=new ArrayList<>();
        String compare=folder[0]+"/";
        ans.add(folder[0]);
        for(int i=1;i<folder.length;i++){
            if(!folder[i].startsWith(compare)){
                ans.add(folder[i]);
                compare=folder[i]+"/";
            }
        }
        return ans;
    }
}