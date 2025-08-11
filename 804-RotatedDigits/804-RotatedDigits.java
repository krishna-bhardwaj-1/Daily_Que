// Last updated: 12/08/2025, 00:16:41
class Solution {
    public int rotatedDigits(int n) {
        int count=0;
        for(int i=1;i<=n;i++){
            if(isgood(i)){
                System.out.println(i);
                count++;
            }
        }
        return count;
    }
    private static boolean isgood(int n){
        boolean isgood=false;
        while(n>0){
            int r=n%10;
             if (!isgood && (r==2||r==5||r==6||r==9))
               isgood=true;
             if(r==3||r==4||r==7)return false;
            n=n/10;
        }
        return isgood;
    }
}