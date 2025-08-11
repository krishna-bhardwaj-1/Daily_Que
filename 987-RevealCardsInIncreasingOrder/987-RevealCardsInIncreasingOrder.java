// Last updated: 12/08/2025, 00:16:02
class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<deck.length;i++){
            q.add(i);
        }
        int[] arr=new int[deck.length];
        int i=0;
        while(!q.isEmpty()){
            arr[q.poll()]=deck[i++];
            if(!q.isEmpty()) q.add(q.poll());
        }
        return arr;
    }
}