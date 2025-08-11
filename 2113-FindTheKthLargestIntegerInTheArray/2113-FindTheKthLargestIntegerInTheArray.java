// Last updated: 12/08/2025, 00:13:08
import java.math.*;
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        List<BigInteger> ll=new ArrayList<>();
        for(String s:nums){
            ll.add(new BigInteger(s));
        }
        Collections.sort(ll);
        return ll.get(nums.length-k).toString();
    }
}