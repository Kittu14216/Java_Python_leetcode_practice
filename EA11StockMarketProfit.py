arr=[7,28,1,4,5,19,4,25,30,12,22]
profit=0
temp=arr[0]
for i in range(1,len(arr)):
    profit=max(profit,arr[i]-temp)
    if(arr[i]<temp):
        temp=arr[i]
print(profit)