// Last updated: 12/08/2025, 00:14:32
class Solution {
    public double average(int[] salary) {
        double sum=0;
        // Arrays.sort(salary);
        // for(int i=1;i<salary.length-1;i++){
        //     sum+=salary[i];
        // }
        // return sum/(salary.length-2);
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i:salary){
            min=Math.min(min,i);
            max=Math.max(max,i);
            sum+=i;
        }
        return (sum-min-max)/(salary.length-2);
    }
}