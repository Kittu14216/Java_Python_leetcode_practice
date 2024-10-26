# lst = [7, 4, 5, 6, 1,2, 8, 9]
lst=[1,2,3,4]
target = 7

for i in lst:
    for j in lst:
        if i + j == target:
            print(lst.index(i), lst.index(j))
            break

