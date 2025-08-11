// Last updated: 12/08/2025, 00:12:32
class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        // List<Integer> ll=new ArrayList<>();
        // for(int i:nums){
        //     if(i<pivot){
        //         ll.add(i);
        //     }
        // }
        // List<Integer> ll2=new ArrayList<>();
        // for(int i:nums){
        //     if(i>=pivot){
        //         ll2.add(i);
        //     }
        // }
        // List<Integer> pivo=new ArrayList<>();
        // for(int i=0;i<ll2.size();i++){
        //     if(ll2.get(i)==pivot){
        //         pivo.add(ll2.get(i));
        //         ll2.remove(i);
        //     }
        // }
        // int[] arr=new int[nums.length];
        // int c=0;
        // for(int i=0;i<ll.size();i++){
        //     arr[c]=ll.get(i);
        //     c++;
        // }
        // for (int i=0;i<pivo.size();i++){
        //     arr[c]=pivo.get(i);
        //     c++;
        // }
        // for (int i=0;i<ll2.size();i++){
        //     arr[c]=ll2.get(i);
        //     c++;
        // }
        // return arr;
        int n=nums.length;
        int[] less=new int[n];
        int[] high=new int[n];
        int[] result=new int[n];
        int count=0;
        int j=0;
        int k=0;
        for(int i=0;i<n;i++){
            if(nums[i]<pivot){
                less[j]=nums[i];
                j++;
            }
            else if(nums[i]==pivot){
                count++;
            }
            else{
                high[k]=nums[i];
                k++;
            }
        }
        int c=0;
        for(int i=0;i<j;i++){
            result[c++]=less[i];
        }
        for(int i=0;i<count;i++){
            result[c++]=pivot;
        }
        for(int i=0;i<k;i++){
            result[c++]=high[i];
        }
        return result;
    }
}