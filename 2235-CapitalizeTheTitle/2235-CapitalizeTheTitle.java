// Last updated: 12/08/2025, 00:12:40
class Solution {
    public String capitalizeTitle(String title) {
    String[] arr=title.split(" +");
    for (int i = 0; i < arr.length; i++) {
        if (arr[i].length() <= 2) {
            arr[i] = arr[i].toLowerCase();
        }
        else {
            arr[i] = arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1).toLowerCase();
            }
    }
    StringBuilder sb=new StringBuilder();
    for(String s:arr){
        sb.append(s);
        if(s==arr[arr.length-1]){
            break;
        }
        sb.append(" ");
    }
    return sb.toString();
    }
}