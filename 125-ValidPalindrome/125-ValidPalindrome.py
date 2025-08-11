# Last updated: 12/08/2025, 00:20:05
class Solution:
    def isPalindrome(self, s: str) -> bool:
        s=s.casefold()
        a=""
        for i in s:
            if i.isalnum()==True:
                a+=i
        return(a==a[::-1])
        