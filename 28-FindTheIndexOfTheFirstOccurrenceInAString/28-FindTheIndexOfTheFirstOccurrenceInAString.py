# Last updated: 12/08/2025, 00:21:37
class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        for i in range(len(haystack)):
            if haystack[i:i+len(needle)]==needle:
                return i
        return -1
                
        