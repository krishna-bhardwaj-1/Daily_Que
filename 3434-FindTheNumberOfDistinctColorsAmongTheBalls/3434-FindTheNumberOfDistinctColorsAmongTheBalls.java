// Last updated: 12/08/2025, 00:10:14
class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        int[] arr=new int[queries.length];
        Map<Integer,Integer> ballcolr=new HashMap<>();
        Map<Integer,Integer> colourfre=new HashMap<>();
        for(int i=0;i<queries.length;i++){
            int ball=queries[i][0];
            int colour=queries[i][1];
            if(ballcolr.containsKey(ball)){
                int cnt=colourfre.get(ballcolr.get(ball))-1;
                if(cnt==0){
                    colourfre.remove(ballcolr.get(ball));
                }
                else{
                    colourfre.put(ballcolr.get(ball),cnt);
                }
            }
            ballcolr.put(ball,colour);
            colourfre.put(colour,colourfre.getOrDefault(colour,0)+1);
            arr[i]=colourfre.size();
        }
        return arr;
    }
}