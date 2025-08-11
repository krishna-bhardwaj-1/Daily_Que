// Last updated: 12/08/2025, 00:11:53
class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        // int time=0;
        // //metal
        // int MIndex=0;
        // for(int i=0;i<garbage.length;i++){
        //     time+=garbage[i].chars().filter(ch -> ch=='M').count();
        //     if(garbage[i].contains("M")) MIndex=i;
        // }
        // for(int i=0;i<MIndex;i++){
        //     time+=travel[i];
        // }
        // // //paper
        // int PIndex=0;
        // for(int i=0;i<garbage.length;i++){
        //     time+=garbage[i].chars().filter(ch -> ch=='P').count();
        //     if(garbage[i].contains("P")) PIndex=i;
        // }
        // for(int i=0;i<PIndex;i++){
        //     time+=travel[i];
        // }
        // //Glass
        // int GIndex=0;
        // for(int i=0;i<garbage.length;i++){
        //     time+=garbage[i].chars().filter(ch -> ch=='G').count();
        //     if(garbage[i].contains("G")) GIndex=i;
        // }
        // for(int i=0;i<GIndex;i++){
        //     time+=travel[i];
        // }
        // return time;

        int time=0;
        int[] lastindex=new int[3];
        //lastindex = {'M','P','G'}
        for(int i=garbage.length-1;i>=0;i--){
            time+=garbage[i].length();
            if(garbage[i].contains("M") && lastindex[0]==0){
                lastindex[0]=i;
            }
            if(garbage[i].contains("P") && lastindex[1]==0){
                lastindex[1]=i;
            }
            if(garbage[i].contains("G") && lastindex[2]==0){
                lastindex[2]=i;
            }
        }
        //metal traveeling time
        for(int i=0;i<=lastindex[0];i++){
            if(i>0)time+=travel[i-1];
        }

        //paper
        for(int i=0;i<=lastindex[1];i++){
            if(i>0) time+=travel[i-1];
        }

        //glass
        for(int i=0;i<=lastindex[2];i++){
            if(i>0) time+=travel[i-1];
        }

        return time;
    }
}