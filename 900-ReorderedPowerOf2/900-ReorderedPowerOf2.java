// Last updated: 12/08/2025, 00:16:26
class Solution {
    public boolean reorderedPowerOf2(int n) {
        int[] input=cntdigit(n);

        for(int i=0;i<31;i++){
            int cnum=1<<i;
            int[] arr=cntdigit(cnum);
            if(check(input,arr)) return true;
        }
        return false;
    }

    private boolean check(int[] input,int[] arr){
        for(int i=0;i<arr.length;i++){
            if(input[i]!=arr[i]) return false;
        }
        return true;
    }


    private int[] cntdigit(int n){
        int[] arr=new int[10];
        while(n>0){
            arr[n%10]++;
            n/=10;
        }
        return arr;
    }
}