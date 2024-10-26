lst1=[1,3,4,5,6,7,8,9,15]
lst2=[]
for i in range(1,lst1[-1]):
    if(i not in lst1):
        lst2.append(i)
print(lst2)
