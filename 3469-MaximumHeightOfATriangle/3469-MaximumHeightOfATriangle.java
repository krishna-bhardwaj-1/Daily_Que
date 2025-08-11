// Last updated: 12/08/2025, 00:10:05
class Solution {
    public int maxHeightOfTriangle(int red, int blue) {
        return Math.max(max(red,blue),max(blue,red));
    }
    private static int max(int a,int b){
        int c=0;
        int i=1;
        boolean blue=true;
        while(true){
            if(blue){
                if(a>=i) a-=i;
                else break;  
            }
            else{
                if(b>=i) b-=i;
                else break;
            }
            c++;
            i++;
            blue=!blue;
        }
        return c;
    }
}