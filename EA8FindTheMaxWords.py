lst=["my name is kishore","I completed my btech in electrical electronics engineering","hai how are you"]
ans=0
for i in lst:
    count=0
    for j in i:
        if(j==" "):
            count=count+1
    if (count>ans):
        ans=count
print(ans)
        