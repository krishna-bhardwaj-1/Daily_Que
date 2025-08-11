// Last updated: 12/08/2025, 00:14:38
class Solution {
    public int[] finalPrices(int[] prices) {
        List<Integer> ll=new ArrayList<>();
        for(int i=0;i<prices.length;i++){
            int j=i+1;
            for(;j<prices.length;j++){
                if(prices[j]<=prices[i]){
                    ll.add(prices[i]-prices[j]);
                    break;
                }
            }
            if(j==prices.length){
                ll.add(prices[i]);
            }
        }
        int[] arr=new int[ll.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=ll.get(i);
        }
        return arr;
    }
}