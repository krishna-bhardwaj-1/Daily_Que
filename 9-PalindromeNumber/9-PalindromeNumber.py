# Last updated: 12/08/2025, 00:22:01
class Solution(object):
    def isPalindrome(self, x):
        x=str(x)
        y=x[::-1]
        
        return x==y    