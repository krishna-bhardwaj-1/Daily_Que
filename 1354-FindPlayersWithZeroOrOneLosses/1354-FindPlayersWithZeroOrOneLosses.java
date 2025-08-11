// Last updated: 12/08/2025, 00:15:17
class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        // List<List<Integer>> ans=new ArrayList<>();
        // List<Integer> winner=new ArrayList<>();
        // List<Integer> loser=new ArrayList<>();
        // List<Integer> temp=new ArrayList<>();

        // Set<Integer> winnerSet=new HashSet<>();
        // Set<Integer> loserSet=new HashSet<>();
        // Set<Integer> tempSet=new HashSet<>();

        // for(int i=0;i<matches.length;i++){

        //     int win=matches[i][0];
        //     int lose=matches[i][1];

        //     if(!tempSet.contains(win) && !loserSet.contains(win)){
        //         if(!winnerSet.contains(win)){
        //             winner.add(win);
        //             winnerSet.add(win);
        //         }
        //     }

        //     if(loserSet.contains(lose)){
        //         temp.add(lose);
        //         tempSet.add(lose);
        //         loserSet.remove(lose);
        //         loser.remove(Integer.valueOf(lose));
        //     }

        //     else if(winnerSet.contains(lose)){
        //         loser.add(lose);
        //         loserSet.add(lose);
        //         winnerSet.remove(lose);
        //         winner.remove(Integer.valueOf(lose));
        //     }

        //     else if(!tempSet.contains(lose)){
        //         loser.add(lose);
        //         loserSet.add(lose);
        //     }
        // }

        // Collections.sort(winner);
        // Collections.sort(loser);
        // ans.add(winner);
        // ans.add(loser);
        // return ans;

        List<List<Integer>> ans=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<matches.length;i++){
            int win=matches[i][0];
            int lose=matches[i][1];

            map.putIfAbsent(win,0);
            map.put(lose,map.getOrDefault(lose,0)+1);
        }

        List<Integer> winner=new ArrayList<>();
        List<Integer> loser=new ArrayList<>();
        for(var entry:map.entrySet()){
            if(entry.getValue()==0){
                winner.add(entry.getKey());
            }
            else if(entry.getValue()==1){
                loser.add(entry.getKey());
            }
        }

        Collections.sort(winner);
        Collections.sort(loser);

        ans.add(winner);
        ans.add(loser);
        return ans;
    }
}