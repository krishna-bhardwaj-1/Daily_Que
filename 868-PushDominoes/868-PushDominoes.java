// Last updated: 12/08/2025, 00:16:34
class Solution {
    public String pushDominoes(String dominoes) {
        char[] arr = dominoes.toCharArray();
        int n = arr.length;
        int lastR = -1, lastL = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 'L') {
                if (lastR > lastL) {
                    pushBoth(lastR, i, arr);
                } else {
                    pushLeft(lastL + 1, i, arr);
                }
                lastL = i;
            } else if (arr[i] == 'R') {
                if (lastR > lastL) {
                    pushRight(lastR + 1, i - 1, arr);
                }
                lastR = i;
            }
        }

        if (lastR > lastL) {
            pushRight(lastR + 1, n - 1, arr);
        }

        return new String(arr);
    }

    private void pushLeft(int start, int end, char[] arr) {
        for (int i = start; i < end; i++) {
            arr[i] = 'L';
        }
    }

    private void pushRight(int start, int end, char[] arr) {
        for (int i = start; i <= end; i++) {
            arr[i] = 'R';
        }
    }

    private void pushBoth(int start, int end, char[] arr) {
        while (start < end) {
            arr[start++] = 'R';
            arr[end--] = 'L';
        }
    }
}