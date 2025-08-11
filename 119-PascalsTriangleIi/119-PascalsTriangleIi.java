// Last updated: 12/08/2025, 00:20:03
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ll=new ArrayList<>();;
        long row=rowIndex;
        long i=0;
        long ncr=1;
        while(i<=row){
            ll.add((int)ncr);
            ncr=((row-i)*ncr)/(i+1);
            i++;
        }
        return ll;
    }
}