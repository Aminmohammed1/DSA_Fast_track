class Solution:
    def search(self, nums: List[int], target: int) -> int:
        s = 0
        e = len(nums)-1
        while s <= e:
            mid = (e+s)//2
            if target < nums[mid]:
                e = mid-1
            elif target > nums[mid]:
                s = mid+1
            else:
                return mid   
        return -1