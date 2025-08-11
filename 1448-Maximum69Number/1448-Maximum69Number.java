// Last updated: 12/08/2025, 00:15:05
class Solution {
    public int maximum69Number (int num) {
        List<Integer> ll=new ArrayList<>();
        while(num>0){
            ll.add(num%10);
            num/=10;
        }
        for(int i=ll.size()-1;i>=0;i--){
            if(ll.get(i)==6){
                ll.set(i,9);
                break;
            }
        }
        int sum=0;
        for(int i=ll.size()-1;i>=0;i--){
            sum=sum*10+ll.get(i);
        }
        return sum;
    }
}