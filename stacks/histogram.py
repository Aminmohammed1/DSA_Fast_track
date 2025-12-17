class Solution:
    def largestRectangleArea(self, heights: List[int]) -> int:
        # max = heights[0]
        # mA = 0
        # stack = []
        # length = len(heights)
        # for i in range(length):
        #     if stack:
        #         stack.append((i, heights[i]))
        #     elif stack and stack[i-1] < heights[i]:
        #         stack.append((i, height[i]))
        #     elif stack and  stack[i-1] > heights[i]:
        #         j, h = stack.pop(i-1)
        #         w = j-i
        #         mA = max(w*h, mA)
        # for i in range(len(stack), -1):
        #     j, h = stack.pop(i)
        #     w = length-j
        #     mA = max((w*h), mA)        
        # return mA


        # full working solution
        # def largestRectangleArea(self, heights: List[int]) -> int:
        # max = heights[0]
        mA = 0
        stack = []
        length = len(heights)
        for i, h in enumerate(heights):
            start = i
            while stack and stack[-1][1] > h:
                index, height = stack.pop()
                mA = max(mA, height*(i-index))
                start = index
            stack.append((start, h))

        for i, h in stack:
            mA = max(mA, h*(len(heights) - i))

        return mA


           
