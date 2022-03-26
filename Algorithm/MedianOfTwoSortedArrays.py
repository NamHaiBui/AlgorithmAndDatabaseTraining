class Solution:
#     def mergeSort(self, arr: List[int]):
#         if(len(arr) == 1):
#             return arr
#         else:
#             firstHalf = Solution.mergeSort(self, arr[0:len(arr)//2])
#             secondHalf = Solution.mergeSort(self, arr[len(arr)//2:len(arr)])
#             result =[]
#             firstIndex = 0
#             secondIndex = 0
#             while firstIndex < len(firstHalf) and secondIndex < len(secondHalf):
#                 if(firstHalf[firstIndex] >= secondHalf[secondIndex]):
#                     result.append(secondHalf[secondIndex])
#                     secondIndex += 1
#                 else:
#                     result.append(firstHalf[firstIndex])
#                     firstIndex += 1
#             while(firstIndex < len(firstHalf)):
#                     result.append(firstHalf[firstIndex])
#                     firstIndex += 1
#             while(secondIndex < len(secondHalf)):
#                 result.append(secondHalf[secondIndex])
#                 secondIndex += 1
#             return result
        
#     def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
#         #MergeSort!
#         nums = []
#         for i in range(len(nums1)):
#             nums.append(nums1[i])
#         for i in range(len(nums2)):
#             nums.append(nums2[i])
#         nums = Solution.mergeSort(self, nums)
#         # print(nums)
#         if(len(nums) % 2 == 1):
#             return float(nums[math.floor(len(nums)/2)])
#         else:
#             print("isEven")
#             return (nums[len(nums)//2] + nums[len(nums)//2-1])/2
        def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
            nums = nums1 + nums2

            nums.sort()

            median = len(nums) // 2

            if len(nums) % 2 is 0:
                return float((nums[median] + nums[median - 1]) / 2)
            else:
                return float(nums[median])
    
            
        
    
