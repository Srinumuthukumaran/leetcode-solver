class Solution(object):
    def missingNumber(self, nums):
        n = len(nums)
        actualsum = 0
        expectedsum = n * (n+1) // 2

        for num in nums:
            actualsum+=num

        missing = expectedsum - actualsum
        return missing