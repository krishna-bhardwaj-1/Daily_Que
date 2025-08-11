// Last updated: 12/08/2025, 00:12:48
class Solution {
    public int[] findEvenNumbers(int[] digits) {
        Set<Integer> set=new HashSet<>();
        int n=digits.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    if(i==j||j==k||i==k) continue;
                    int num=digits[i]*100+digits[j]*10+digits[k];
                    if(num>=100 && num%2==0){
                        set.add(num);
                    }
                }
            }
        }
        List<Integer> res=new ArrayList<>(set);
        Collections.sort(res);
        int[] arr=new int[res.size()];
        for(int i=0;i<res.size();i++){
            arr[i]=res.get(i);
        }
        return arr;
    }
}