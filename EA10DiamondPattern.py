n=5
for i in range(n-1):
    for j in range(n-i-1):
        print(" ",end="")
    for k in range(i*2+1):
        print("*",end="")
    print()

for i in range(n-1,-1,-1):
    for j in range(n-i-1):
        print(" ",end="")
    for k in range(i*2+1):
        print("*",end="")
    print()
