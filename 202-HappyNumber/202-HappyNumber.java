// Last updated: 12/08/2025, 00:19:16
class Solution {
    public boolean isHappy(int n) {
        List<Integer> ll = new ArrayList<Integer>();
        while(true){
            int sum=0;
            while(n>0){
                int rem=n%10;
                sum+=Math.pow(rem,2);
                n/=10;
            }
            if(sum==1){
                return true;
            }
            n=sum;
            if(ll.contains(n)){
                return false;
            }
            ll.add(n);
        }
    }
}