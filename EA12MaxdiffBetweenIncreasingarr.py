# nums=[7,1,5,4]
# nums=[9,4,3,2]
nums=[1,2,3,10]
diff=-1
temp=nums[0]
for i in range(1,len(nums)):
    if(temp<nums[i]):
        diff=max(diff,nums[i]-temp)
    if(nums[i]<temp):
        temp=nums[i]
print(diff)