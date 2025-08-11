// Last updated: 12/08/2025, 00:17:38
class Solution {
    public String convertToBase7(int num) {
        StringBuilder sb=new StringBuilder();
        StringBuilder sbt=new StringBuilder();
        if(num==0){
            return "0";
        }
        if(num<0){
            sbt.append("-");
            num=-num;
        }
        while(num>0){
            int rem=num%7;
            sb.append(rem);
            num/=7;
        }
        sbt.append(sb.reverse());
        return sbt.toString();
    }
}