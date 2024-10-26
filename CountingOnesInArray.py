arr=[1,2,3,4,4,3,1,1,1,2,3,4,5,5,6,6,6,6,5,4,32,2,2,11,3,4,1,3,1]
count=0
for i in range(0,len(arr)):
    if (arr[i]==1):
        count=count+1
print(count)