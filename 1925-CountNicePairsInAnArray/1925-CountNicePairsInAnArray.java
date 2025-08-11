// Last updated: 12/08/2025, 00:13:40
class Solution {
    public int countNicePairs(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        long ans=0;
        for(int i=0;i<arr.length;i++) {
            int searchinMap=arr[i]-rev(arr[i]);
            if(map.containsKey(searchinMap)){
                ans+=map.get(searchinMap);
            }
            map.put(searchinMap,map.getOrDefault(searchinMap,0)+1);
        }
        return (int)(ans%1000_000_007);
    }
    private static int rev(int num){
        int revnum=0;
        while (num>0){
            int rem=num%10;
            revnum=revnum*10+rem;
            num/=10;
        }
        return revnum;
    }
}