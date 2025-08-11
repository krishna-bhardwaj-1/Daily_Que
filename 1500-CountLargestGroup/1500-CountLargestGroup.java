// Last updated: 12/08/2025, 00:14:51
class Solution {
    public int countLargestGroup(int n) {
        Map<Integer,Integer> map=new HashMap<>();
        int max=0;
        int cnt=0;
        for(int i=1;i<=n;i++){
            int x=i;
            if(i>9){
                x=sum(i);
            }
            map.put(x,map.getOrDefault(x,0)+1);
            if(max<map.get(x)){
                max=map.get(x);
                cnt=1;
            }
            else if(map.get(x)==max) cnt++;
        }
        return cnt;
    }
    private static int sum(int i){
        int sm=0;
        while(i>0){
            sm+=i%10;
            i/=10;
        }
        return sm;
    }
}