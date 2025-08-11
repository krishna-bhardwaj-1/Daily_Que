// Last updated: 12/08/2025, 00:12:44
class Solution {
    public int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int alice=0;
        int bob=plants.length-1;
        int panibhrenge=0;
        int water1=capacityA;
        int water2=capacityB;
        while(alice<bob){
            if(capacityA>=plants[alice]){
                capacityA-=plants[alice];
            }
            else{
                panibhrenge++;
                capacityA=water1-plants[alice];
            }
            if(capacityB>=plants[bob]){
                capacityB-=plants[bob];
            }
            else{
                panibhrenge++;
                capacityB=water2-plants[bob];
            }
            alice++;
            bob--;
        }
        if(alice==bob){
            if(capacityA==capacityB || capacityA>capacityB){
                if(capacityA<plants[alice]){
                    panibhrenge++;
                    capacityA=water1-plants[alice];
                }
            }
            else{
                if(capacityB<plants[bob]){
                    panibhrenge++;
                    capacityB=water1-plants[bob];
                }
            }
        }
        return panibhrenge;
    }
}