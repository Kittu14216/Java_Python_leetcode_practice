lst=[17,18,5,4,6,1]
# for i in range(len(lst)):
#     rightmax=-1
#     for j in range(i+1,len(lst)):
#         rightmax=max(rightmax,lst[j])
#     lst[i]=rightmax

rightmax=-1
for i in range(len(lst)-1,-1,-1):
    prev=lst[i]
    lst[i]=rightmax
    rightmax=max(prev,rightmax)
print(lst)


# doubt
# doubt# doubt
# doubt
# doubt
# doubt
