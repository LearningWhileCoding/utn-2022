one = [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15]
two = [10,20,30,40,50,15,14,13,12,11,70,80,0]

set1 = set(one)
set2 = set(two)

union = list(set1 | set2)
only1 = list(set1 - set2)
only2 = list(set2 - set1)
intersection = list (set1 & set2)
print(union)
print(only1)
print(only2)
print(intersection)