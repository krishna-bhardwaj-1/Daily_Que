// Last updated: 12/08/2025, 00:15:41
class Solution {
    public void duplicateZeros(int[] write) {
        int[] read=Arrays.copyOfRange(write,0,write.length);
        int i=0;
        int j=0;
        while(j<write.length){
            if(read[i]!=0){
                write[j]=read[i];
                j++;
            }
            else{
                write[j++] = 0;
                if (j < write.length)
                    write[j++] = 0;
            }
            i++;
        }
    }
}