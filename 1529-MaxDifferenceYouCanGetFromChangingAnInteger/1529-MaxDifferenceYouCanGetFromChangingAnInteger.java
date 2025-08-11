// Last updated: 12/08/2025, 00:14:45
class Solution {
    public int maxDiff(int num) {
        String s1=Integer.toString(num);
        String s2=new String(s1);
        int idx=-1;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!='9'){
                idx=i;
                break;
            }
        }
        if(idx!=-1) s1=s1.replace(s1.charAt(idx),'9');

        int temp=0;
        String s3=new String(s2);

        s2=s2.replace(s2.charAt(0),'1');
        temp=Integer.parseInt(s2);
        if(s3.length()>1){
            for(int i=1;i<s3.length();i++){
                char nikala=s3.charAt(i);
                if(nikala=='0'||nikala=='1') continue;
                s3=s3.replace(s3.charAt(i),'0');
                if(s3.charAt(0)=='0'){
                    s3=s3.replace(s3.charAt(i),nikala);
                    continue;
                }
                temp=Math.min(temp,Integer.parseInt(s3));
                s3=s3.replace(s3.charAt(i),nikala);
            }
        }
        return Integer.parseInt(s1)-temp;
    }
}