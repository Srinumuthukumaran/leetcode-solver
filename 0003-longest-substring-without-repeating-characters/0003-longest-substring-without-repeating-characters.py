class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        check_set = set()
        left = 0
        maxlen = 0

        for right in range(len(s)):
            while s[right] in check_set:
                check_set.remove(s[left])
                left+=1
            check_set.add(s[right])
            maxlen = max(maxlen,right-left+1)
            
        return maxlen