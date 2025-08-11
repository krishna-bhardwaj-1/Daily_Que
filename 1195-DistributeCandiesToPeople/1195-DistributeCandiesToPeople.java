// Last updated: 12/08/2025, 00:15:40
class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] arr=new int[num_people];
        int candy=1;
        int i=0;
        while(candies>0){
            if(candies>=candy){
                arr[i%num_people]+=candy;
                candies-=candy;
                candy++;
            }
            else{
                arr[i%num_people]+=candies;
                candies=0;
                break;
            }
            i++;
        }
        return arr;
    }
}