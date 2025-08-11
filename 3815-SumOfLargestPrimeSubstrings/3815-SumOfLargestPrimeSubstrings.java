// Last updated: 12/08/2025, 00:09:11
class Solution {
    public long sumOfLargestPrimes(String s) {
        Set<Long> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String st=s.substring(i,j);
                if (st.length() > 1 && st.startsWith("0")) continue;
                long n=Long.valueOf(st);
                if(prime(n)) set.add(n);
            }
        }
        List<Long> ll=new ArrayList<>(set);
        if(ll.size()==0) return 0;
        if(ll.size()<3){
            long sum=0;
            for(long i:ll) sum+=i;
            return sum;
        }
        Collections.sort(ll);
        return ll.get(ll.size()-1)+ll.get(ll.size()-2)+ll.get(ll.size()-3);
    }

    private boolean prime(long n){
        if(n<=1) return false;
        if(n==2 || n==3 ) return true;
        if(n%2==0|| n%3==0) return false;
        for(long i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
}