# colors=[1,1,1,6,1,1,1]
colors=[0,1]
diff=0
for i in range(len(colors)-1):
    if(colors[-1]!=colors[i]):
        diff=max(diff,len(colors)-1-i)
for i in range(len(colors)-1,0,-1):
    if(colors[0]!=colors[i]):
        diff=max(diff,i-0)
print(diff)
        