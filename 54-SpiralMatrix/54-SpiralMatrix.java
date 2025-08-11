// Last updated: 12/08/2025, 00:21:05
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        return convertArrayToList(Print(matrix));
    }
    public static int[] Print(int[][] arr){
        int minc=0;
        int minr=0;
        int maxc=arr[0].length-1;
        int maxr=arr.length-1;
        int te=arr.length*arr[0].length;
        int c=0;
        int[] result=new int[te];
        while(c<te)
        {
            for (int i = minc; i <= maxc && c<te; i++) {
                result[c]=arr[minr][i];
                c++;
            }
            minr++;
            for (int i = minr; i <= maxr && c<te; i++) {
                result[c]=arr[i][maxc];
                c++;
            }
            maxc--;
            for (int i = maxc; i >= minc && c<te; i--) {
                result[c]=arr[maxr][i];
                c++;
            }
            maxr--;
            for (int i = maxr; i >= minr && c<te; i--) {
                result[c]=arr[i][minc];
                c++;
            }
            minc++;
        }
        return result;
    }
    public static List<Integer> convertArrayToList(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }
        return list;
    }
}