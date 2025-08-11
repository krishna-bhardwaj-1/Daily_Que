// Last updated: 12/08/2025, 00:13:29
class FindSumPairs {
    static int[] arr1,arr2;
    static Map<Integer,Integer> map;
    public FindSumPairs(int[] nums1, int[] nums2) {
        arr1=nums1;
        arr2=nums2;
        map=new HashMap<>();
        for(int i:arr2){
            map.put(i,map.getOrDefault(i,0)+1);
        }
    }
    
    public void add(int index, int val) {
        map.put(arr2[index],map.get(arr2[index])-1);
        arr2[index]+=val;
        map.put(arr2[index],map.getOrDefault(arr2[index],0)+1);
    }
    
    public int count(int tot) {
        int cnt=0;
        for(int i:arr1){
            cnt+=map.getOrDefault(tot-i,0);
        }
        return cnt;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */